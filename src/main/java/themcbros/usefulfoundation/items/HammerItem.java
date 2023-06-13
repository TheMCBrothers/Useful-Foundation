package themcbros.usefulfoundation.items;

import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.Tags;

@Deprecated
public class HammerItem extends DiggerItem {
    public static final RandomSource RAND = RandomSource.create();

    public HammerItem(Properties props) {
        super(0, -2.5f, Tiers.IRON, BlockTags.MINEABLE_WITH_SHOVEL, props);
    }

    @Override
    public boolean isCorrectToolForDrops(ItemStack stack, BlockState state) {
        return state.is(Tags.Blocks.COBBLESTONE) || state.is(Tags.Blocks.SAND) || state.is(Tags.Blocks.GRAVEL) || state.is(Tags.Blocks.ORES);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        ItemStack copy = stack.copy();

        if (copy.hurt(1, RAND, null)) return ItemStack.EMPTY;
        else return copy;
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        return state.getBlock().defaultDestroyTime() < 1.5 ? super.getDestroySpeed(stack, state) : this.speed;
    }
}
