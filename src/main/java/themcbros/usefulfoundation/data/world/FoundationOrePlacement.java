package themcbros.usefulfoundation.data.world;

import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

import static themcbros.usefulfoundation.init.Registration.PLACED_FEATURES;

public final class FoundationOrePlacement {
    public static final RegistryObject<PlacedFeature> ORE_ALUMINUM = PLACED_FEATURES.register("ore_aluminum", () -> new PlacedFeature(FoundationOreFeatures.ORE_ALUMINUM.getHolder().orElseThrow(), commonOrePlacement(23, HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(80)))));
    public static final RegistryObject<PlacedFeature> ORE_LEAD = PLACED_FEATURES.register("ore_lead", () -> new PlacedFeature(FoundationOreFeatures.ORE_LEAD.getHolder().orElseThrow(), commonOrePlacement(18, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(80)))));
    public static final RegistryObject<PlacedFeature> ORE_NICKEL = PLACED_FEATURES.register("ore_nickel", () -> new PlacedFeature(FoundationOreFeatures.ORE_NICKEL.getHolder().orElseThrow(), commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(60)))));
    public static final RegistryObject<PlacedFeature> ORE_PLATINUM = PLACED_FEATURES.register("ore_platinum", () -> new PlacedFeature(FoundationOreFeatures.ORE_PLATINUM.getHolder().orElseThrow(), commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(0)))));
    public static final RegistryObject<PlacedFeature> ORE_PLATINUM_TOP = PLACED_FEATURES.register("ore_platinum_top", () -> new PlacedFeature(FoundationOreFeatures.ORE_PLATINUM.getHolder().orElseThrow(), commonOrePlacement(100, HeightRangePlacement.uniform(VerticalAnchor.absolute(190), VerticalAnchor.top()))));
    public static final RegistryObject<PlacedFeature> ORE_SILVER = PLACED_FEATURES.register("ore_silver", () -> new PlacedFeature(FoundationOreFeatures.ORE_SILVER.getHolder().orElseThrow(), commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(80)))));
    public static final RegistryObject<PlacedFeature> ORE_TIN = PLACED_FEATURES.register("ore_tin", () -> new PlacedFeature(FoundationOreFeatures.ORE_TIN.getHolder().orElseThrow(), commonOrePlacement(32, HeightRangePlacement.uniform(VerticalAnchor.absolute(85), VerticalAnchor.top()))));
    public static final RegistryObject<PlacedFeature> ORE_URANIUM = PLACED_FEATURES.register("ore_uranium", () -> new PlacedFeature(FoundationOreFeatures.ORE_URANIUM.getHolder().orElseThrow(), commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(0)))));

    private static List<PlacementModifier> orePlacement(PlacementModifier modifier, PlacementModifier modifier2) {
        return List.of(modifier, InSquarePlacement.spread(), modifier2, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int num, PlacementModifier modifier) {
        return orePlacement(CountPlacement.of(num), modifier);
    }

    private static List<PlacementModifier> rareOrePlacement(int num, PlacementModifier modifier) {
        return orePlacement(RarityFilter.onAverageOnceEvery(num), modifier);
    }

    public static void init() {
    }
}
