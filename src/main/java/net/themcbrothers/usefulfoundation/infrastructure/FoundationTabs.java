package net.themcbrothers.usefulfoundation.infrastructure;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;

import static net.themcbrothers.usefulfoundation.infrastructure.FoundationItems.COPPER_GEAR;
import static net.themcbrothers.usefulfoundation.infrastructure.Registration.CREATIVE_MODE_TABS;

public final class FoundationTabs {
    static void init() {
    }

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BASE = CREATIVE_MODE_TABS.register("base", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> COPPER_GEAR.get().getDefaultInstance())
            .title(Component.translatable("itemGroup.usefulfoundation.base"))
            .displayItems((parameters, output) -> {
                Registration.BLOCKS.getEntries().forEach(block -> output.accept(block.get()));
                Registration.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
            }).build());
}