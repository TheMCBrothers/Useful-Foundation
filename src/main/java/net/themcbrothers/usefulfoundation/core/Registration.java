package net.themcbrothers.usefulfoundation.core;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.themcbrothers.lib.registries.BlockDeferredRegister;
import net.themcbrothers.lib.registries.ItemDeferredRegister;
import net.themcbrothers.usefulfoundation.UsefulFoundation;

public final class Registration {
    public static final ItemDeferredRegister ITEMS = ItemDeferredRegister.create(UsefulFoundation.MOD_ID);
    public static final BlockDeferredRegister BLOCKS = BlockDeferredRegister.create(UsefulFoundation.MOD_ID, ITEMS);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, UsefulFoundation.MOD_ID);
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
