package net.themcbrothers.usefulfoundation.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.themcbrothers.lib.data.models.GroupedModelProvider;
import net.themcbrothers.usefulfoundation.UsefulFoundation;
import net.themcbrothers.usefulfoundation.datagen.models.FoundationBlockModelProvider;
import net.themcbrothers.usefulfoundation.datagen.models.FoundationItemModelProvider;
import net.themcbrothers.usefulfoundation.datagen.world.FoundationBiomeModifiers;
import net.themcbrothers.usefulfoundation.datagen.world.FoundationOreFeatures;
import net.themcbrothers.usefulfoundation.datagen.world.FoundationOrePlacements;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = UsefulFoundation.MOD_ID)
public final class DataGenEvents {
    @SubscribeEvent
    static void onDataGen(final GatherDataEvent.Client event) {
        final DataGenerator generator = event.getGenerator();
        final PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // Server resources
        FoundationBlockTagsProvider blockTags = new FoundationBlockTagsProvider(output, lookupProvider);
        RegistrySetBuilder registrySetBuilder = new RegistrySetBuilder()
                .add(Registries.CONFIGURED_FEATURE, FoundationOreFeatures::bootstrap)
                .add(Registries.PLACED_FEATURE, FoundationOrePlacements::bootstrap)
                .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, FoundationBiomeModifiers::bootstrap);

        DatapackBuiltinEntriesProvider datapackBuiltinEntriesProvider = new DatapackBuiltinEntriesProvider(output, lookupProvider, registrySetBuilder, Set.of(UsefulFoundation.MOD_ID));
        generator.addProvider(true, datapackBuiltinEntriesProvider);

        LootTableProvider.SubProviderEntry providerEntry = new LootTableProvider.SubProviderEntry(FoundationBlockLootSubProvider::new, LootContextParamSets.BLOCK);

        lookupProvider = datapackBuiltinEntriesProvider.getRegistryProvider();

        generator.addProvider(true, blockTags);
        generator.addProvider(true, new FoundationItemTagsProvider(output, lookupProvider, blockTags.contentsGetter()));
        generator.addProvider(true, new FoundationRecipeProvider.Runner(lookupProvider, output));
        generator.addProvider(true, new LootTableProvider(output, Collections.emptySet(), List.of(providerEntry), lookupProvider));

        // Client resources
        generator.addProvider(true, GroupedModelProvider.create(UsefulFoundation.MOD_ID, FoundationItemModelProvider::new, FoundationBlockModelProvider::new));
        generator.addProvider(true, new FoundationLanguageProvider(output));
    }
}
