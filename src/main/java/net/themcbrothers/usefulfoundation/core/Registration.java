package net.themcbrothers.usefulfoundation.core;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.themcbrothers.usefulfoundation.UsefulFoundation;

public final class Registration {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(UsefulFoundation.MOD_ID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, UsefulFoundation.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(UsefulFoundation.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UsefulFoundation.MOD_ID);


    public static void register(IEventBus modEventBus) {
        FoundationBlocks.init();
        FoundationBlockEntityTypes.init();
        FoundationItems.init();
        FoundationTabs.init();

        BLOCKS.register(modEventBus);
        BLOCK_ENTITY_TYPES.register(modEventBus);
        ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
