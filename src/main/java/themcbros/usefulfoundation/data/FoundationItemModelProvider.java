package themcbros.usefulfoundation.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import themcbros.usefulfoundation.UsefulFoundation;
import themcbros.usefulfoundation.init.FoundationItems;

import java.util.Objects;

public class FoundationItemModelProvider extends ItemModelProvider {
    public FoundationItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, UsefulFoundation.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Foundation Items
        simpleItem(FoundationItems.BRONZE_GEAR);
        simpleItem(FoundationItems.BRONZE_INGOT);
        simpleItem(FoundationItems.BRONZE_NUGGET);
        simpleItem(FoundationItems.BRONZE_PLATE);
        simpleItem(FoundationItems.ELECTRUM_GEAR);
        simpleItem(FoundationItems.ELECTRUM_INGOT);
        simpleItem(FoundationItems.ELECTRUM_NUGGET);
        simpleItem(FoundationItems.ELECTRUM_PLATE);
        simpleItem(FoundationItems.INVAR_GEAR);
        simpleItem(FoundationItems.INVAR_INGOT);
        simpleItem(FoundationItems.INVAR_NUGGET);
        simpleItem(FoundationItems.INVAR_PLATE);
        simpleItem(FoundationItems.LEAD_GEAR);
        simpleItem(FoundationItems.LEAD_INGOT);
        simpleItem(FoundationItems.LEAD_NUGGET);
        simpleItem(FoundationItems.LEAD_PLATE);
        simpleItem(FoundationItems.NICKEL_GEAR);
        simpleItem(FoundationItems.NICKEL_INGOT);
        simpleItem(FoundationItems.NICKEL_NUGGET);
        simpleItem(FoundationItems.NICKEL_PLATE);
        simpleItem(FoundationItems.SILVER_GEAR);
        simpleItem(FoundationItems.SILVER_INGOT);
        simpleItem(FoundationItems.SILVER_NUGGET);
        simpleItem(FoundationItems.SILVER_PLATE);
        simpleItem(FoundationItems.TIN_GEAR);
        simpleItem(FoundationItems.TIN_INGOT);
        simpleItem(FoundationItems.TIN_NUGGET);
        simpleItem(FoundationItems.TIN_PLATE);
        simpleItem(FoundationItems.URANIUM_GEAR);
        simpleItem(FoundationItems.URANIUM_INGOT);
        simpleItem(FoundationItems.URANIUM_NUGGET);
        simpleItem(FoundationItems.URANIUM_PLATE);

        //Foundation Tools
        simpleTool(FoundationItems.HAMMER);

        //Vanilla Items
        simpleItem(FoundationItems.COPPER_GEAR);
        simpleItem(FoundationItems.COPPER_NUGGET);
        simpleItem(FoundationItems.COPPER_PLATE);
        simpleItem(FoundationItems.GOLD_GEAR);
        simpleItem(FoundationItems.GOLD_PLATE);
        simpleItem(FoundationItems.IRON_GEAR);
        simpleItem(FoundationItems.IRON_PLATE);
    }

    private void simpleItem(Item item) {
        ResourceLocation id = item.getRegistryName();
        this.generatedModels.put(id, this.singleTexture(Objects.requireNonNull(id).getPath(), mcLoc("item/generated"), "layer0", modLoc("item/" + id.getPath())));
    }

    private void simpleTool(Item item) {
        ResourceLocation id = item.getRegistryName();
        this.generatedModels.put(id, this.singleTexture(Objects.requireNonNull(id).getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/" + id.getPath())));
    }
}
