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
        simpleItem(ALUMINUM_GEAR);
        simpleItem(ALUMINUM_INGOT);
        simpleItem(RAW_ALUMINUM);
        simpleItem(ALUMINUM_NUGGET);
        simpleItem(ALUMINUM_PLATE);
        simpleItem(ALUMINUM_DUST);
        simpleItem(BRONZE_GEAR);
        simpleItem(BRONZE_INGOT);
        simpleItem(BRONZE_NUGGET);
        simpleItem(BRONZE_PLATE);
        simpleItem(BRONZE_DUST);
        simpleItem(ELECTRUM_GEAR);
        simpleItem(ELECTRUM_INGOT);
        simpleItem(ELECTRUM_NUGGET);
        simpleItem(ELECTRUM_PLATE);
        simpleItem(ELECTRUM_DUST);
        simpleItem(ENDERIUM_GEAR);
        simpleItem(ENDERIUM_INGOT);
        simpleItem(ENDERIUM_NUGGET);
        simpleItem(ENDERIUM_PLATE);
        simpleItem(ENDERIUM_DUST);
        simpleItem(INVAR_GEAR);
        simpleItem(INVAR_INGOT);
        simpleItem(INVAR_NUGGET);
        simpleItem(INVAR_PLATE);
        simpleItem(INVAR_DUST);
        simpleItem(LEAD_GEAR);
        simpleItem(LEAD_INGOT);
        simpleItem(RAW_LEAD);
        simpleItem(LEAD_NUGGET);
        simpleItem(LEAD_PLATE);
        simpleItem(LEAD_DUST);
        simpleItem(NICKEL_GEAR);
        simpleItem(NICKEL_INGOT);
        simpleItem(RAW_NICKEL);
        simpleItem(NICKEL_NUGGET);
        simpleItem(NICKEL_PLATE);
        simpleItem(NICKEL_DUST);
        simpleItem(PLATINUM_GEAR);
        simpleItem(PLATINUM_INGOT);
        simpleItem(RAW_PLATINUM);
        simpleItem(PLATINUM_NUGGET);
        simpleItem(PLATINUM_PLATE);
        simpleItem(PLATINUM_DUST);
        simpleItem(SILVER_GEAR);
        simpleItem(SILVER_INGOT);
        simpleItem(RAW_SILVER);
        simpleItem(SIGNALUM_GEAR);
        simpleItem(SIGNALUM_INGOT);
        simpleItem(SIGNALUM_NUGGET);
        simpleItem(SIGNALUM_PLATE);
        simpleItem(SIGNALUM_DUST);
        simpleItem(SILVER_NUGGET);
        simpleItem(SILVER_PLATE);
        simpleItem(SILVER_DUST);
        simpleItem(STEEL_GEAR);
        simpleItem(STEEL_INGOT);
        simpleItem(STEEL_NUGGET);
        simpleItem(STEEL_PLATE);
        simpleItem(STEEL_DUST);
        simpleItem(TIN_GEAR);
        simpleItem(TIN_INGOT);
        simpleItem(RAW_TIN);
        simpleItem(TIN_NUGGET);
        simpleItem(TIN_PLATE);
        simpleItem(TIN_DUST);
        simpleItem(URANIUM_GEAR);
        simpleItem(URANIUM_INGOT);
        simpleItem(RAW_URANIUM);
        simpleItem(URANIUM_NUGGET);
        simpleItem(URANIUM_PLATE);
        simpleItem(URANIUM_DUST);

        //Foundation Tools
        simpleTool(HAMMER);

        //Vanilla Items
        simpleItem(COPPER_GEAR);
        simpleItem(COPPER_NUGGET);
        simpleItem(COPPER_PLATE);
        simpleItem(COPPER_DUST);
        simpleItem(GOLD_GEAR);
        simpleItem(GOLD_PLATE);
        simpleItem(GOLD_DUST);
        simpleItem(DIAMOND_GEAR);
        simpleItem(DIAMOND_PLATE);
        simpleItem(DIAMOND_DUST);
        simpleItem(IRON_GEAR);
        simpleItem(IRON_PLATE);
        simpleItem(IRON_DUST);
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
