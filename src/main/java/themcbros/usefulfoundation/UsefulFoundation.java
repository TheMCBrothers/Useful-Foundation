package themcbros.usefulfoundation;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import themcbros.usefulfoundation.init.FoundationItems;
import themcbros.usefulfoundation.proxy.ClientProxy;
import themcbros.usefulfoundation.proxy.CommonProxy;
import themcbros.usefulfoundation.proxy.ServerProxy;

import javax.annotation.Nonnull;

@Mod(UsefulFoundation.MOD_ID)
public class UsefulFoundation {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "usefulfoundation";

    public static CommonProxy proxy;

    public static final CreativeModeTab GROUP = new CreativeModeTab(MOD_ID) {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(FoundationItems.COPPER_GEAR.get());
        }
    };

    public UsefulFoundation() {
        proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> ServerProxy::new);
    }

    public static ResourceLocation getId(String pathIn) {
        return new ResourceLocation(MOD_ID, pathIn);
    }
}
