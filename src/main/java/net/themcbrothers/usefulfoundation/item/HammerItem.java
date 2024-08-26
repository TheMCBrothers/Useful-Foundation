package net.themcbrothers.usefulfoundation.item;

import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tiers;
import net.themcbrothers.usefulfoundation.core.FoundationTags;

public class HammerItem extends DiggerItem {
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

        int damageValue = copy.getDamageValue();

        if (damageValue < copy.getMaxDamage() - 1) {
            copy.setDamageValue(damageValue + 1);

            return copy;
        } else {
            return ItemStack.EMPTY;
        }
    }
}
