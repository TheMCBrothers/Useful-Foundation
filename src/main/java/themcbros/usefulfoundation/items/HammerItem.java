package themcbros.usefulfoundation.items;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.Tags;

import java.util.Random;

public class HammerItem extends DiggerItem {
    public static final Random RAND = new Random();

    public HammerItem(Properties props) {
        super(0, -2.5f, Tiers.IRON, BlockTags.MINEABLE_WITH_SHOVEL, props);
    }

    @Override
    public boolean isCorrectToolForDrops(ItemStack stack, BlockState state) {
        return this.isCorrectToolForDrops(state);
    }

    @Override
    public boolean isCorrectToolForDrops(BlockState state) {
        return state.is(Tags.Blocks.COBBLESTONE) || state.is(Tags.Blocks.SAND) || state.is(Tags.Blocks.GRAVEL) || state.is(Tags.Blocks.ORES);
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        ItemStack copy = stack.copy();

        if(copy.hurt(1, RAND, null))
            return ItemStack.EMPTY;
        else
            return copy;
    }

    public float getDestroySpeed(ItemStack stack, BlockState state) {
        Material material = state.getMaterial();
        return material != Material.METAL && material != Material.HEAVY_METAL && material != Material.STONE ? super.getDestroySpeed(stack, state) : this.speed;
    }
}
