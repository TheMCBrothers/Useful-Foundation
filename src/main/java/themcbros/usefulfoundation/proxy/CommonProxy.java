package themcbros.usefulfoundation.proxy;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import themcbros.usefulfoundation.UsefulFoundation;
import themcbros.usefulfoundation.init.FoundationItems;
import themcbros.usefulfoundation.init.Registration;

public class CommonProxy {
    CommonProxy() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::enqueueIMC);
        modEventBus.addListener(this::processIMC);
        modEventBus.addListener(this::registerCreativeModeTab);
        modEventBus.addListener(this::buildContentsCreativeModeTab);
    }

    protected void commonSetup(FMLCommonSetupEvent event) {
        UsefulFoundation.LOGGER.info("Common setup");
    }

    protected void enqueueIMC(InterModEnqueueEvent event) {
    }

    protected void processIMC(InterModProcessEvent event) {
    }

    protected void registerCreativeModeTab(CreativeModeTabEvent.Register event) {
        UsefulFoundation.GROUP = event.registerCreativeModeTab(UsefulFoundation.getId("tab"), builder -> builder
                .icon(() -> new ItemStack(FoundationItems.COPPER_GEAR.get()))
                .title(Component.translatable("itemGroup.usefulfoundation")));
    }

    protected void buildContentsCreativeModeTab(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == UsefulFoundation.GROUP) {
            Registration.BLOCKS.getEntries().forEach(block -> event.accept(block.get(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS));
            Registration.ITEMS.getEntries().forEach(item -> event.accept(item.get(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS));
        }
    }
}
