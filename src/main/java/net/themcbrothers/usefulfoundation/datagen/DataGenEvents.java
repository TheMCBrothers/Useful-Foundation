package net.themcbrothers.usefulfoundation.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.themcbrothers.usefulfoundation.UsefulFoundation;
import net.themcbrothers.usefulfoundation.datagen.world.FoundationBiomeModifiers;
import net.themcbrothers.usefulfoundation.datagen.world.FoundationOreFeatures;
import net.themcbrothers.usefulfoundation.datagen.world.FoundationOrePlacements;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = UsefulFoundation.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenEvents {
    @SubscribeEvent
    static void onDataGen(final GatherDataEvent event) {
        final DataGenerator generator = event.getGenerator();
        final PackOutput output = generator.getPackOutput();
        final ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        final CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // Server resources
        FoundationBlockTagsProvider blockTags = new FoundationBlockTagsProvider(output, lookupProvider, existingFileHelper);

        RegistrySetBuilder registrySetBuilder = new RegistrySetBuilder()
                .add(Registries.CONFIGURED_FEATURE, FoundationOreFeatures::bootstrap)
                .add(Registries.PLACED_FEATURE, FoundationOrePlacements::bootstrap)
                .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, FoundationBiomeModifiers::bootstrap);

        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new FoundationItemTagsProvider(output, lookupProvider, blockTags.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new DatapackBuiltinEntriesProvider(output, lookupProvider, registrySetBuilder, Set.of(UsefulFoundation.MOD_ID)));

        // Client resources
        generator.addProvider(event.includeClient(), new FoundationBlockStateProvider(output, existingFileHelper));
        generator.addProvider(event.includeClient(), new FoundationItemModelProvider(output, existingFileHelper));
        generator.addProvider(event.includeClient(), new FoundationLanguageProvider(output));
    }
}
