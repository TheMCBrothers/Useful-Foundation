package net.themcbrothers.usefulfoundation.core;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;

import static net.themcbrothers.usefulfoundation.core.FoundationItems.COPPER_GEAR;
import static net.themcbrothers.usefulfoundation.core.Registration.CREATIVE_MODE_TABS;

public final class FoundationTabs {
    static void init() {
    }

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BASE = CREATIVE_MODE_TABS.register("base", () -> CreativeModeTab.builder()
            .icon(() -> COPPER_GEAR.get().getDefaultInstance())
            .title(Component.translatable("itemGroup.usefulfoundation.base"))
            .displayItems((parameters, output) -> {
                Registration.BLOCKS.getEntries().forEach(block -> output.accept(block.get()));
                Registration.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
            }).build());
}
