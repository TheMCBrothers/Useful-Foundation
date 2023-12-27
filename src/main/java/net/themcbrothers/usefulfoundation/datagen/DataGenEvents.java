package net.themcbrothers.usefulfoundation.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.themcbrothers.usefulfoundation.UsefulFoundation;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = UsefulFoundation.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenEvents {
    @SubscribeEvent
    static void onDataGen(final GatherDataEvent event) {
        final DataGenerator generator = event.getGenerator();
        final PackOutput packOutput = generator.getPackOutput();
        final ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        final CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // Server resources
        FoundationBlockTagsProvider blockTags = new FoundationBlockTagsProvider(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new FoundationItemTagsProvider(packOutput, lookupProvider, blockTags.contentsGetter(), existingFileHelper));

        // Client resources
        generator.addProvider(event.includeClient(), new FoundationBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new FoundationItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new FoundationLanguageProvider.EnglishUS(packOutput));
        generator.addProvider(event.includeClient(), new FoundationLanguageProvider.SwissGerman(packOutput));
    }
}
