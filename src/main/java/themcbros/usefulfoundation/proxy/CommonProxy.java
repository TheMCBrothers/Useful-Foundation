package themcbros.usefulfoundation.proxy;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import themcbros.usefulfoundation.UsefulFoundation;

public class CommonProxy {
    CommonProxy() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::commonSetup);
        eventBus.addListener(this::enqueueIMC);
        eventBus.addListener(this::processIMC);
    }

    protected void commonSetup(FMLCommonSetupEvent event) {
        UsefulFoundation.LOGGER.info("Common setup");
    }

    protected void enqueueIMC(InterModEnqueueEvent event) {
    }

    protected void processIMC(InterModProcessEvent event) {
    }
}
