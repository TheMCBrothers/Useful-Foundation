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

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, copperOre, 8)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(15, 40, 0, 90))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, tinOre, 8)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(15, 20, 0, 80))));


        }

    }

}
