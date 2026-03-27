package net.themcbrothers.usefulfoundation.item;

import net.minecraft.core.component.DataComponentPatch;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemInstance;
import net.minecraft.world.item.ItemStackTemplate;
import org.jspecify.annotations.Nullable;

public class HammerItem extends Item {
    public HammerItem(Properties props) {
        super(props);
    }

    @Override
    public @Nullable ItemStackTemplate getCraftingRemainder(ItemInstance instance) {
        int damage = instance.getOrDefault(DataComponents.DAMAGE, 0);
        int maxDamage = instance.getOrDefault(DataComponents.MAX_DAMAGE, 0);

        if (damage < maxDamage - 1) {
            return new ItemStackTemplate(this,
                    DataComponentPatch.builder()
                            .set(DataComponents.DAMAGE, damage + 1)
                            .build()
            );
        } else {
            return null;
        }
    }
}
