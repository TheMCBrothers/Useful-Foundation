package themcbros.usefulfoundation;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import themcbros.usefulfoundation.init.Registration;
import themcbros.usefulfoundation.proxy.ClientProxy;
import themcbros.usefulfoundation.proxy.CommonProxy;
import themcbros.usefulfoundation.proxy.ServerProxy;

@Mod(UsefulFoundation.MOD_ID)
public class UsefulFoundation {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "usefulfoundation";
    public static CommonProxy proxy;

    public UsefulFoundation() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Registration.register(bus);

        proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> ServerProxy::new);
    }

    public static ResourceLocation getId(String pathIn) {
        return new ResourceLocation(MOD_ID, pathIn);
    }
}
