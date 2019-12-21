package themcbros.usefulfoundation.world;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;
import themcbros.usefulfoundation.init.FoundationBlocks;

public class WorldGeneration {

    public static void setupOreGeneration() {

        // TODO: add config for ore generation
        for (Biome biome : ForgeRegistries.BIOMES) {

            final BlockState copperOre = FoundationBlocks.COPPER_ORE.getDefaultState();
            final BlockState tinOre = FoundationBlocks.TIN_ORE.getDefaultState();
            final BlockState nickelOre = FoundationBlocks.NICKEL_ORE.getDefaultState();
            final BlockState leadOre = FoundationBlocks.LEAD_ORE.getDefaultState();
            final BlockState silverOre = FoundationBlocks.SILVER_ORE.getDefaultState();
            final BlockState uraniumOre = FoundationBlocks.URANIUM_ORE.getDefaultState();

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, copperOre, 8)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(10, 40, 0, 90))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, tinOre, 8)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(10, 20, 0, 80))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, nickelOre, 4)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(8, 0, 0, 24))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, leadOre, 5)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(9, 0, 0, 30))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, silverOre, 5)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(9, 0, 0, 30))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, uraniumOre, 3)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(5, 0, 0, 18))));


        }

    }

}
