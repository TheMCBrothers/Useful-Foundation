package themcbros.usefulfoundation.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.themcbrothers.lib.registration.deferred.BlockDeferredRegister;
import net.themcbrothers.lib.registration.deferred.BlockEntityTypeDeferredRegister;
import net.themcbrothers.lib.registration.deferred.ItemDeferredRegister;
import themcbros.usefulfoundation.UsefulFoundation;

public class Registration {
    public static final BlockDeferredRegister BLOCKS = new BlockDeferredRegister(UsefulFoundation.MOD_ID);
    public static final BlockEntityTypeDeferredRegister BLOCK_ENTITY_TYPES = new BlockEntityTypeDeferredRegister(UsefulFoundation.MOD_ID);
    public static final ItemDeferredRegister ITEMS = new ItemDeferredRegister(UsefulFoundation.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UsefulFoundation.MOD_ID);

    public static void register(IEventBus bus) {
        FoundationBlocks.init();
        FoundationItems.init();
        FoundationBlockEntities.init();
        FoundationCreativeModeTabs.init();

        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITY_TYPES.register(bus);
        CREATIVE_MODE_TABS.register(bus);
    }
}
