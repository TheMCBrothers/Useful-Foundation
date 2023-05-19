package themcbros.usefulfoundation.data;

import net.minecraft.DetectedVersion;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.metadata.PackMetadataGenerator;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import themcbros.usefulfoundation.UsefulFoundation;
import themcbros.usefulfoundation.data.world.FoundationBiomeModifiers;
import themcbros.usefulfoundation.data.world.FoundationOreFeatures;
import themcbros.usefulfoundation.data.world.FoundationOrePlacements;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = UsefulFoundation.MOD_ID)
public class Events {
    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event) {
        // Client Providers
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        PackOutput output = gen.getPackOutput();

        gen.addProvider(event.includeClient(), new FoundationBlockStateProvider(output, fileHelper));
        gen.addProvider(event.includeClient(), new FoundationItemModelProvider(output, fileHelper));
        gen.addProvider(event.includeClient(), new FoundationRecipeProvider(output));
        gen.addProvider(event.includeClient(), new FoundationLanguageProviders.EnglishUS(output));
        gen.addProvider(event.includeClient(), new FoundationLanguageProviders.SwissGerman(output));

        // Server Providers
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();
        BlockTagsProvider blockTagsProvider = new FoundationTagProvider.Blocks(output, provider, fileHelper);

        RegistrySetBuilder registrySetBuilder = new RegistrySetBuilder()
                .add(Registries.CONFIGURED_FEATURE, FoundationOreFeatures::bootstrap)
                .add(Registries.PLACED_FEATURE, FoundationOrePlacements::bootstrap)
                .add(ForgeRegistries.Keys.BIOME_MODIFIERS, FoundationBiomeModifiers::bootstrap);

        gen.addProvider(event.includeServer(), blockTagsProvider);
        gen.addProvider(event.includeServer(), new FoundationTagProvider.Items(output, provider, blockTagsProvider.contentsGetter(), fileHelper));
        gen.addProvider(event.includeServer(), new FoundationLootTableProvider(output));
        gen.addProvider(event.includeServer(), new DatapackBuiltinEntriesProvider(output, provider, registrySetBuilder, Set.of(UsefulFoundation.MOD_ID)));

        gen.addProvider(true, new PackMetadataGenerator(output))
                .add(PackMetadataSection.TYPE,
                        new PackMetadataSection(Component.literal("Useful Foundation Resources"),
                                DetectedVersion.BUILT_IN.getPackVersion(PackType.CLIENT_RESOURCES),
                                Arrays.stream(PackType.values()).collect(Collectors.toMap(Function.identity(), DetectedVersion.BUILT_IN::getPackVersion))));
    }
}
