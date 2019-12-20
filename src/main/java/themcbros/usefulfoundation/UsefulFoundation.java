package themcbros.usefulfoundation;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import themcbros.usefulfoundation.init.FoundationItems;
import themcbros.usefulfoundation.proxy.ClientProxy;
import themcbros.usefulfoundation.proxy.CommonProxy;
import themcbros.usefulfoundation.proxy.ServerProxy;

@Mod(UsefulFoundation.MOD_ID)
public class UsefulFoundation {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "usefulfoundation";

    public static CommonProxy proxy;

    public static final ItemGroup GROUP = new ItemGroup(MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(FoundationItems.COPPER_GEAR);
        }
    };

    public UsefulFoundation() {

        proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    }

    public static ResourceLocation getId(String pathIn) {
        return new ResourceLocation(MOD_ID, pathIn);
    }

}
