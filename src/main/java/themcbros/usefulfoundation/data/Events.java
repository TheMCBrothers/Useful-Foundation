package themcbros.usefulfoundation.data;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import net.minecraft.core.RegistryAccess;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.resources.RegistryOps;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import themcbros.usefulfoundation.UsefulFoundation;
import themcbros.usefulfoundation.world.FoundationBiomeModifiers;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = UsefulFoundation.MOD_ID)
public class Events {
    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event) {
        // Client Providers
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        gen.addProvider(event.includeClient(), new FoundationBlockStateProvider(gen, fileHelper));
        gen.addProvider(event.includeClient(), new FoundationItemModelProvider(gen, fileHelper));
        gen.addProvider(event.includeClient(), new FoundationLanguageProvider(gen));
        gen.addProvider(event.includeClient(), new FoundationRecipeProvider(gen));


        // Server Providers
        BlockTagsProvider blockTagsProvider = new FoundationTagProvider.Blocks(gen, fileHelper);
        RegistryOps<JsonElement> regOps = RegistryOps.create(JsonOps.INSTANCE, RegistryAccess.builtinCopy());

        gen.addProvider(event.includeServer(), blockTagsProvider);
        gen.addProvider(event.includeServer(), new FoundationTagProvider.Items(gen, blockTagsProvider, fileHelper));
        gen.addProvider(event.includeServer(), new FoundationLootTableProvider(gen));
        gen.addProvider(event.includeServer(), FoundationBiomeModifiers.dataGenBiomeModifiers(gen, fileHelper, regOps));
    }
}
