package themcbros.usefulfoundation.proxy;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import themcbros.usefulfoundation.UsefulFoundation;
import themcbros.usefulfoundation.world.WorldGeneration;

public class CommonProxy {
    CommonProxy() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
    }

    protected void commonSetup(FMLCommonSetupEvent event) {
        UsefulFoundation.LOGGER.info("Common setup");
    }

    protected void enqueueIMC(InterModEnqueueEvent event) {
    }

    protected void processIMC(InterModProcessEvent event) {
    }
}
