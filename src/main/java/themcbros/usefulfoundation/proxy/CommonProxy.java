package themcbros.usefulfoundation.proxy;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import themcbros.usefulfoundation.UsefulFoundation;
import themcbros.usefulfoundation.init.Registration;

public class CommonProxy {
    CommonProxy() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        Registration.register(bus);

        bus.addListener(this::commonSetup);
        bus.addListener(this::enqueueIMC);
        bus.addListener(this::processIMC);
    }

    protected void commonSetup(FMLCommonSetupEvent event) {
        UsefulFoundation.LOGGER.info("Common setup");
    }

    protected void enqueueIMC(InterModEnqueueEvent event) {
    }

    protected void processIMC(InterModProcessEvent event) {
    }
}
