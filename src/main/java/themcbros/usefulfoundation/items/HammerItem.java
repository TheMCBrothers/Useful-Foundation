package themcbros.usefulfoundation.items;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.ToolItem;
import net.minecraftforge.common.Tags;

import java.util.Set;

public class HammerItem extends ToolItem {

    private static final Set<Block> EFFECTIVE_ON = ImmutableSet.of(Blocks.COBBLESTONE, Blocks.GRAVEL, Blocks.SAND);

    public HammerItem(Properties builder) {
        super(0, -2.5f, ItemTier.IRON, EFFECTIVE_ON, builder);
    }

    @Override
    public boolean canHarvestBlock(BlockState blockIn) {
        return blockIn.isIn(Tags.Blocks.COBBLESTONE) || blockIn.isIn(Tags.Blocks.SAND) || blockIn.isIn(Tags.Blocks.GRAVEL) || blockIn.isIn(Tags.Blocks.ORES);
    }

    @Override
    public boolean canHarvestBlock(ItemStack stack, BlockState state) {
        return this.canHarvestBlock(state);
    }

    public float getDestroySpeed(ItemStack stack, BlockState state) {
        Material material = state.getMaterial();
        return material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? super.getDestroySpeed(stack, state) : this.efficiency;
    }

}
