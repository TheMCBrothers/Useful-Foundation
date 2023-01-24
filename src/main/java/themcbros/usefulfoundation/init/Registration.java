package themcbros.usefulfoundation.init;

import net.minecraftforge.eventbus.api.IEventBus;
import net.themcbrothers.lib.registration.deferred.BlockDeferredRegister;
import net.themcbrothers.lib.registration.deferred.BlockEntityDeferredRegister;
import net.themcbrothers.lib.registration.deferred.ItemDeferredRegister;
import themcbros.usefulfoundation.UsefulFoundation;

public class Registration {
    public static final BlockDeferredRegister BLOCKS = new BlockDeferredRegister(UsefulFoundation.MOD_ID);
    public static final BlockEntityDeferredRegister BLOCK_ENTITY_TYPES = new BlockEntityDeferredRegister(UsefulFoundation.MOD_ID);
    public static final ItemDeferredRegister ITEMS = new ItemDeferredRegister(UsefulFoundation.MOD_ID);

    public static void register(IEventBus bus) {
        FoundationBlocks.init();
        FoundationItems.init();
        FoundationBlockEntities.init();

        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITY_TYPES.register(bus);
    }
}
