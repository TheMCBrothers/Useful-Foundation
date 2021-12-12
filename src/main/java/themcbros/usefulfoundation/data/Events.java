package themcbros.usefulfoundation.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import themcbros.usefulfoundation.UsefulFoundation;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = UsefulFoundation.MOD_ID)
public class Events {
    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        if (event.includeClient()) {
            gen.addProvider(new FoundationBlockStateProvider(gen, fileHelper));
            gen.addProvider(new FoundationItemModelProvider(gen, fileHelper));
            gen.addProvider(new FoundationLanguageProvider(gen));
            gen.addProvider(new FoundationRecipeProvider(gen));
        }

        if (event.includeServer()) {
            BlockTagsProvider blockTagsProvider = new FoundationTagProvider.Blocks(gen, fileHelper);

            gen.addProvider(blockTagsProvider);
            gen.addProvider(new FoundationTagProvider.Items(gen, blockTagsProvider, fileHelper));
        }
    }
}
