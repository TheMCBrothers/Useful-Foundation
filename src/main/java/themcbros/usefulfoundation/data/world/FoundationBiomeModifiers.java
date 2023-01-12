package themcbros.usefulfoundation.data.world;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class FoundationBiomeModifiers {
    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        HolderGetter<Biome> biomeGetter = context.lookup(Registries.BIOME);
        HolderGetter<PlacedFeature> placedFeatureGetter = context.lookup(Registries.PLACED_FEATURE);
        HolderSet<Biome> biomes = biomeGetter.getOrThrow(BiomeTags.IS_OVERWORLD);

        registerModifierForOre(context, placedFeatureGetter, FoundationOrePlacements.ORE_ALUMINUM, biomes);
        registerModifierForOre(context, placedFeatureGetter, FoundationOrePlacements.ORE_LEAD, biomes);
        registerModifierForOre(context, placedFeatureGetter, FoundationOrePlacements.ORE_NICKEL, biomes);
        registerModifierForOre(context, placedFeatureGetter, FoundationOrePlacements.ORE_PLATINUM, biomes);
        registerModifierForOre(context, placedFeatureGetter, FoundationOrePlacements.ORE_PLATINUM_TOP, biomes);
        registerModifierForOre(context, placedFeatureGetter, FoundationOrePlacements.ORE_SILVER, biomes);
        registerModifierForOre(context, placedFeatureGetter, FoundationOrePlacements.ORE_TIN, biomes);
    }

    private static void registerModifierForOre(BootstapContext<BiomeModifier> context, HolderGetter<PlacedFeature> getter, ResourceKey<PlacedFeature> key, HolderSet<Biome> biomes) {
        ForgeBiomeModifiers.AddFeaturesBiomeModifier modifier = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes, HolderSet.direct(getter.getOrThrow(key)), GenerationStep.Decoration.UNDERGROUND_ORES);

        context.register(ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(key.location() + "_generation")), modifier);
    }
}
