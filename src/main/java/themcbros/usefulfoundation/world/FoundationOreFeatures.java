package themcbros.usefulfoundation.world;

import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import themcbros.usefulfoundation.init.FoundationBlocks;

import java.util.List;

import static net.minecraft.data.worldgen.features.OreFeatures.DEEPSLATE_ORE_REPLACEABLES;
import static net.minecraft.data.worldgen.features.OreFeatures.STONE_ORE_REPLACEABLES;

public final class FoundationOreFeatures {
    //Targets
    public static final List<OreConfiguration.TargetBlockState> ORE_ALUMINUM_TARGET_LIST = List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, FoundationBlocks.ALUMINUM_ORE.defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_ALUMINUM_ORE.defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> ORE_LEAD_TARGET_LIST = List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, FoundationBlocks.LEAD_ORE.defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_LEAD_ORE.defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> ORE_NICKEL_TARGET_LIST = List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, FoundationBlocks.NICKEL_ORE.defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_NICKEL_ORE.defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> ORE_PLATINUM_TARGET_LIST = List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, FoundationBlocks.PLATINUM_ORE.defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_PLATINUM_ORE.defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> ORE_SILVER_TARGET_LIST = List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, FoundationBlocks.SILVER_ORE.defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_SILVER_ORE.defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> ORE_TIN_TARGET_LIST = List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, FoundationBlocks.TIN_ORE.defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TIN_ORE.defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> ORE_URANIUM_TARGET_LIST = List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, FoundationBlocks.URANIUM_ORE.defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_URANIUM_ORE.defaultBlockState()));

    //Features
    public static final ConfiguredFeature<?, ?> ORE_ALUMINUM = FeatureUtils.register("ore_aluminum", Feature.ORE.configured(new OreConfiguration(ORE_ALUMINUM_TARGET_LIST, 8)));
    public static final ConfiguredFeature<?, ?> ORE_LEAD = FeatureUtils.register("ore_lead", Feature.ORE.configured(new OreConfiguration(ORE_LEAD_TARGET_LIST, 8)));
    public static final ConfiguredFeature<?, ?> ORE_NICKEL = FeatureUtils.register("ore_nickel", Feature.ORE.configured(new OreConfiguration(ORE_NICKEL_TARGET_LIST, 8)));
    public static final ConfiguredFeature<?, ?> ORE_PLATINUM = FeatureUtils.register("ore_platinum", Feature.ORE.configured(new OreConfiguration(ORE_PLATINUM_TARGET_LIST, 4)));
    public static final ConfiguredFeature<?, ?> ORE_SILVER = FeatureUtils.register("ore_silver", Feature.ORE.configured(new OreConfiguration(ORE_SILVER_TARGET_LIST, 8)));
    public static final ConfiguredFeature<?, ?> ORE_TIN = FeatureUtils.register("ore_tin", Feature.ORE.configured(new OreConfiguration(ORE_TIN_TARGET_LIST, 8)));
    public static final ConfiguredFeature<?, ?> ORE_URANIUM = FeatureUtils.register("ore_uranium", Feature.ORE.configured(new OreConfiguration(ORE_URANIUM_TARGET_LIST, 8)));
}