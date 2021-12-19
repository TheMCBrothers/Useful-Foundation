package themcbros.usefulfoundation.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import themcbros.usefulfoundation.UsefulFoundation;

import java.util.Objects;

import static themcbros.usefulfoundation.init.FoundationItems.*;

public class FoundationItemModelProvider extends ItemModelProvider {
    public FoundationItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, UsefulFoundation.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Foundation Items
        simpleItem(BRONZE_GEAR);
        simpleItem(BRONZE_INGOT);
        simpleItem(RAW_BRONZE);
        simpleItem(BRONZE_NUGGET);
        simpleItem(BRONZE_PLATE);
        simpleItem(ELECTRUM_GEAR);
        simpleItem(ELECTRUM_INGOT);
        simpleItem(RAW_ELECTRUM);
        simpleItem(ELECTRUM_NUGGET);
        simpleItem(ELECTRUM_PLATE);
        simpleItem(INVAR_GEAR);
        simpleItem(INVAR_INGOT);
        simpleItem(RAW_INVAR);
        simpleItem(INVAR_NUGGET);
        simpleItem(INVAR_PLATE);
        simpleItem(LEAD_GEAR);
        simpleItem(LEAD_INGOT);
        simpleItem(RAW_LEAD);
        simpleItem(LEAD_NUGGET);
        simpleItem(LEAD_PLATE);
        simpleItem(NICKEL_GEAR);
        simpleItem(NICKEL_INGOT);
        simpleItem(RAW_NICKEL);
        simpleItem(NICKEL_NUGGET);
        simpleItem(NICKEL_PLATE);
        simpleItem(SILVER_GEAR);
        simpleItem(SILVER_INGOT);
        simpleItem(RAW_SILVER);
        simpleItem(SILVER_NUGGET);
        simpleItem(SILVER_PLATE);
        simpleItem(TIN_GEAR);
        simpleItem(TIN_INGOT);
        simpleItem(RAW_TIN);
        simpleItem(TIN_NUGGET);
        simpleItem(TIN_PLATE);
        simpleItem(URANIUM_GEAR);
        simpleItem(URANIUM_INGOT);
        simpleItem(RAW_URANIUM);
        simpleItem(URANIUM_NUGGET);
        simpleItem(URANIUM_PLATE);

        //Foundation Tools
        simpleTool(HAMMER);

        //Vanilla Items
        simpleItem(COPPER_GEAR);
        simpleItem(COPPER_NUGGET);
        simpleItem(COPPER_PLATE);
        simpleItem(GOLD_GEAR);
        simpleItem(GOLD_PLATE);
        simpleItem(IRON_GEAR);
        simpleItem(IRON_PLATE);
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
