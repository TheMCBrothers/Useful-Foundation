package themcbros.usefulfoundation.init;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

import static themcbros.usefulfoundation.init.Registration.CREATIVE_MODE_TABS;

public class FoundationCreativeModeTabs {
    public static final RegistryObject<CreativeModeTab> BASE_CREATIVE_MODE_TAB = CREATIVE_MODE_TABS.register("base_creative_mode_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(FoundationItems.COPPER_GEAR.get()))
            .title(Component.translatable("itemGroup.usefulfoundation"))
            .build());

    static void init() {
    }
}
