package net.themcbrothers.usefulfoundation.core;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.themcbrothers.lib.registries.BlockDeferredRegister;
import net.themcbrothers.lib.registries.BlockEntityTypeDeferredRegister;
import net.themcbrothers.lib.registries.ItemDeferredRegister;
import net.themcbrothers.usefulfoundation.UsefulFoundation;

public final class Registration {
    public static final ItemDeferredRegister ITEMS = ItemDeferredRegister.create(UsefulFoundation.MOD_ID);
    public static final BlockDeferredRegister BLOCKS = BlockDeferredRegister.create(UsefulFoundation.MOD_ID, ITEMS);
    public static final BlockEntityTypeDeferredRegister BLOCK_ENTITY_TYPES = BlockEntityTypeDeferredRegister.create(UsefulFoundation.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UsefulFoundation.MOD_ID);


    public static void register(IEventBus modEventBus) {
        FoundationItems.init();
        FoundationBlocks.init();
        FoundationBlockEntityTypes.init();
        FoundationTabs.init();

        ITEMS.register(modEventBus);
        BLOCKS.register(modEventBus);
        BLOCK_ENTITY_TYPES.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
