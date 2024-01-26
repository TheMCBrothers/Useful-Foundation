package net.themcbrothers.usefulfoundation.core;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.themcbrothers.usefulfoundation.block.entity.UsefulBeehiveBlockEntity;

import static net.themcbrothers.usefulfoundation.core.Registration.BLOCK_ENTITY_TYPES;

public class FoundationBlockEntityTypes {
    static void init() {
    }

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<UsefulBeehiveBlockEntity>> USEFUL_BEEHIVE = BLOCK_ENTITY_TYPES.register("useful_beehive", () -> BlockEntityType.Builder.of(UsefulBeehiveBlockEntity::new, FoundationBlocks.USEFUL_BEEHIVE.get()).build(null));
}
