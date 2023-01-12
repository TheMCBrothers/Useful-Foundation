package themcbros.usefulfoundation.data;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import themcbros.usefulfoundation.UsefulFoundation;

import java.util.Objects;

import static themcbros.usefulfoundation.init.FoundationItems.*;

public class FoundationItemModelProvider extends ItemModelProvider {
    public FoundationItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, UsefulFoundation.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Foundation Items
        simpleItem(ALUMINUM_GEAR.get());
        simpleItem(ALUMINUM_INGOT.get());
        simpleItem(RAW_ALUMINUM.get());
        simpleItem(ALUMINUM_NUGGET.get());
        simpleItem(ALUMINUM_PLATE.get());
        simpleItem(ALUMINUM_DUST.get());
        simpleItem(BRONZE_GEAR.get());
        simpleItem(BRONZE_INGOT.get());
        simpleItem(BRONZE_NUGGET.get());
        simpleItem(BRONZE_PLATE.get());
        simpleItem(BRONZE_DUST.get());
        simpleItem(ELECTRUM_GEAR.get());
        simpleItem(ELECTRUM_INGOT.get());
        simpleItem(ELECTRUM_NUGGET.get());
        simpleItem(ELECTRUM_PLATE.get());
        simpleItem(ELECTRUM_DUST.get());
        simpleItem(ENDERIUM_GEAR.get());
        simpleItem(ENDERIUM_INGOT.get());
        simpleItem(ENDERIUM_NUGGET.get());
        simpleItem(ENDERIUM_PLATE.get());
        simpleItem(ENDERIUM_DUST.get());
        simpleItem(INVAR_GEAR.get());
        simpleItem(INVAR_INGOT.get());
        simpleItem(INVAR_NUGGET.get());
        simpleItem(INVAR_PLATE.get());
        simpleItem(INVAR_DUST.get());
        simpleItem(LEAD_GEAR.get());
        simpleItem(LEAD_INGOT.get());
        simpleItem(RAW_LEAD.get());
        simpleItem(LEAD_NUGGET.get());
        simpleItem(LEAD_PLATE.get());
        simpleItem(LEAD_DUST.get());
        simpleItem(NICKEL_GEAR.get());
        simpleItem(NICKEL_INGOT.get());
        simpleItem(RAW_NICKEL.get());
        simpleItem(NICKEL_NUGGET.get());
        simpleItem(NICKEL_PLATE.get());
        simpleItem(NICKEL_DUST.get());
        simpleItem(PLATINUM_GEAR.get());
        simpleItem(PLATINUM_INGOT.get());
        simpleItem(RAW_PLATINUM.get());
        simpleItem(PLATINUM_NUGGET.get());
        simpleItem(PLATINUM_PLATE.get());
        simpleItem(PLATINUM_DUST.get());
        simpleItem(SILVER_GEAR.get());
        simpleItem(SILVER_INGOT.get());
        simpleItem(RAW_SILVER.get());
        simpleItem(SIGNALUM_GEAR.get());
        simpleItem(SIGNALUM_INGOT.get());
        simpleItem(SIGNALUM_NUGGET.get());
        simpleItem(SIGNALUM_PLATE.get());
        simpleItem(SIGNALUM_DUST.get());
        simpleItem(SILVER_NUGGET.get());
        simpleItem(SILVER_PLATE.get());
        simpleItem(SILVER_DUST.get());
        simpleItem(STEEL_GEAR.get());
        simpleItem(STEEL_INGOT.get());
        simpleItem(STEEL_NUGGET.get());
        simpleItem(STEEL_PLATE.get());
        simpleItem(STEEL_DUST.get());
        simpleItem(TIN_GEAR.get());
        simpleItem(TIN_INGOT.get());
        simpleItem(RAW_TIN.get());
        simpleItem(TIN_NUGGET.get());
        simpleItem(TIN_PLATE.get());
        simpleItem(TIN_DUST.get());
        simpleItem(URANIUM_GEAR.get());
        simpleItem(URANIUM_INGOT.get());
        simpleItem(RAW_URANIUM.get());
        simpleItem(URANIUM_NUGGET.get());
        simpleItem(URANIUM_PLATE.get());
        simpleItem(URANIUM_DUST.get());

        //Foundation Tools
        simpleTool(HAMMER.get());

        //Vanilla Items
        simpleItem(COPPER_GEAR.get());
        simpleItem(COPPER_NUGGET.get());
        simpleItem(COPPER_PLATE.get());
        simpleItem(COPPER_DUST.get());
        simpleItem(GOLD_GEAR.get());
        simpleItem(GOLD_PLATE.get());
        simpleItem(GOLD_DUST.get());
        simpleItem(DIAMOND_GEAR.get());
        simpleItem(DIAMOND_PLATE.get());
        simpleItem(DIAMOND_DUST.get());
        simpleItem(IRON_GEAR.get());
        simpleItem(IRON_PLATE.get());
        simpleItem(IRON_DUST.get());
    }

    private void simpleItem(Item item) {
        ResourceLocation id = ForgeRegistries.ITEMS.getKey(item);
        this.generatedModels.put(id, this.singleTexture(Objects.requireNonNull(id).getPath(), mcLoc("item/generated"), "layer0", modLoc("item/" + id.getPath())));
    }

    private void simpleTool(Item item) {
        ResourceLocation id = ForgeRegistries.ITEMS.getKey(item);
        this.generatedModels.put(id, this.singleTexture(Objects.requireNonNull(id).getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/" + id.getPath())));
    }
}
