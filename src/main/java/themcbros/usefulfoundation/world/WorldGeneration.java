package themcbros.usefulfoundation.world;

import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import themcbros.usefulfoundation.UsefulFoundation;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE, modid = UsefulFoundation.MOD_ID)
public class WorldGeneration {
    @SubscribeEvent
    public static void setupOreGeneration(final BiomeLoadingEvent event) {
        event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, FoundationOrePlacement.ORE_LEAD);
        event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, FoundationOrePlacement.ORE_NICKEL);
        event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, FoundationOrePlacement.ORE_TIN);
        event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, FoundationOrePlacement.ORE_SILVER);
        event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, FoundationOrePlacement.ORE_URANIUM);
    }
}
