package net.themcbrothers.usefulfoundation.item;

import net.minecraft.util.RandomSource;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tiers;
import net.themcbrothers.usefulfoundation.core.FoundationTags;

public class HammerItem extends DiggerItem {
    private static final RandomSource RAND = RandomSource.create();

    public HammerItem(Properties props) {
        super(Tiers.IRON, FoundationTags.Blocks.MINEABLE_WITH_HAMMER, props);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        ItemStack copy = stack.copy();
       
        copy.hurtAndBreak(1, RAND, null, () -> copy.setCount(0));

        return copy;
    }
}
