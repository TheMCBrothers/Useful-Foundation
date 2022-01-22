package themcbros.usefulfoundation.world;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class FoundationOrePlacement {
    public static final PlacedFeature ORE_ALUMINUM = PlacementUtils.register("ore_aluminum", FoundationOreFeatures.ORE_ALUMINUM.placed(commonOrePlacement(23, HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(80)))));
    public static final PlacedFeature ORE_LEAD = PlacementUtils.register("ore_lead", FoundationOreFeatures.ORE_LEAD.placed(commonOrePlacement(18, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(80)))));
    public static final PlacedFeature ORE_NICKEL = PlacementUtils.register("ore_nickel", FoundationOreFeatures.ORE_NICKEL.placed(commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(60)))));
    public static final PlacedFeature ORE_PLATINUM = PlacementUtils.register("ore_platinum", FoundationOreFeatures.ORE_PLATINUM.placed(commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(0)))));
    public static final PlacedFeature ORE_PLATINUM_TOP = PlacementUtils.register("ore_platinum_top", FoundationOreFeatures.ORE_PLATINUM.placed(commonOrePlacement(100, HeightRangePlacement.uniform(VerticalAnchor.absolute(190), VerticalAnchor.top()))));
    public static final PlacedFeature ORE_SILVER = PlacementUtils.register("ore_silver", FoundationOreFeatures.ORE_SILVER.placed(commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(80)))));
    public static final PlacedFeature ORE_TIN = PlacementUtils.register("ore_tin", FoundationOreFeatures.ORE_TIN.placed(commonOrePlacement(32, HeightRangePlacement.uniform(VerticalAnchor.absolute(85), VerticalAnchor.top()))));
    public static final PlacedFeature ORE_URANIUM = PlacementUtils.register("ore_uranium", FoundationOreFeatures.ORE_URANIUM.placed(commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(0)))));

    private static List<PlacementModifier> orePlacement(PlacementModifier modifier, PlacementModifier modifier2) {
        return List.of(modifier, InSquarePlacement.spread(), modifier2, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int num, PlacementModifier modifier) {
        return orePlacement(CountPlacement.of(num), modifier);
    }

    private static List<PlacementModifier> rareOrePlacement(int num, PlacementModifier modifier) {
        return orePlacement(RarityFilter.onAverageOnceEvery(num), modifier);
    }
}
