package net.themcbrothers.usefulfoundation.datagen.world;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.themcbrothers.usefulfoundation.UsefulFoundation;

import java.util.List;

public class FoundationOrePlacements {
    public static final ResourceKey<PlacedFeature> ORE_ALUMINUM = createKey("ore_aluminum");
    public static final ResourceKey<PlacedFeature> ORE_LEAD = createKey("ore_lead");
    public static final ResourceKey<PlacedFeature> ORE_NICKEL = createKey("ore_nickel");
    public static final ResourceKey<PlacedFeature> ORE_PLATINUM = createKey("ore_platinum");
    public static final ResourceKey<PlacedFeature> ORE_PLATINUM_TOP = createKey("ore_platinum_top");
    public static final ResourceKey<PlacedFeature> ORE_SILVER = createKey("ore_silver");
    public static final ResourceKey<PlacedFeature> ORE_TIN = createKey("ore_tin");
    public static final ResourceKey<PlacedFeature> ORE_URANIUM = createKey("ore_uranium");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> getter = context.lookup(Registries.CONFIGURED_FEATURE);
        Holder<ConfiguredFeature<?, ?>> aluminumHolder = getter.getOrThrow(FoundationOreFeatures.ORE_ALUMINUM);
        Holder<ConfiguredFeature<?, ?>> leadHolder = getter.getOrThrow(FoundationOreFeatures.ORE_LEAD);
        Holder<ConfiguredFeature<?, ?>> nickelHolder = getter.getOrThrow(FoundationOreFeatures.ORE_NICKEL);
        Holder<ConfiguredFeature<?, ?>> platinumHolder = getter.getOrThrow(FoundationOreFeatures.ORE_PLATINUM);
        Holder<ConfiguredFeature<?, ?>> silverHolder = getter.getOrThrow(FoundationOreFeatures.ORE_SILVER);
        Holder<ConfiguredFeature<?, ?>> tinHolder = getter.getOrThrow(FoundationOreFeatures.ORE_TIN);
        Holder<ConfiguredFeature<?, ?>> uraniumHolder = getter.getOrThrow(FoundationOreFeatures.ORE_URANIUM);

        PlacementUtils.register(context, ORE_ALUMINUM, aluminumHolder, commonOrePlacement(23, HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(80))));
        PlacementUtils.register(context, ORE_LEAD, leadHolder, commonOrePlacement(18, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(80))));
        PlacementUtils.register(context, ORE_NICKEL, nickelHolder, commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(60))));
        PlacementUtils.register(context, ORE_PLATINUM, platinumHolder, commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(0))));
        PlacementUtils.register(context, ORE_PLATINUM_TOP, platinumHolder, commonOrePlacement(100, HeightRangePlacement.uniform(VerticalAnchor.absolute(190), VerticalAnchor.top())));
        PlacementUtils.register(context, ORE_SILVER, silverHolder, commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(80))));
        PlacementUtils.register(context, ORE_TIN, tinHolder, commonOrePlacement(32, HeightRangePlacement.uniform(VerticalAnchor.absolute(85), VerticalAnchor.top())));
        PlacementUtils.register(context, ORE_URANIUM, uraniumHolder, commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(0))));
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier modifier, PlacementModifier modifier2) {
        return List.of(modifier, InSquarePlacement.spread(), modifier2, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int num, PlacementModifier modifier) {
        return orePlacement(CountPlacement.of(num), modifier);
    }

    private static List<PlacementModifier> rareOrePlacement(int num, PlacementModifier modifier) {
        return orePlacement(RarityFilter.onAverageOnceEvery(num), modifier);
    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, UsefulFoundation.rl(name));
    }
}
