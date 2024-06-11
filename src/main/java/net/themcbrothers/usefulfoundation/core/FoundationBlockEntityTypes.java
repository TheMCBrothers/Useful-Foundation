package net.themcbrothers.usefulfoundation.core;

import net.themcbrothers.lib.registries.DeferredBlockEntityType;
import net.themcbrothers.usefulfoundation.block.entity.UsefulBeehiveBlockEntity;

import static net.themcbrothers.usefulfoundation.core.Registration.BLOCK_ENTITY_TYPES;

public class FoundationBlockEntityTypes {
    static void init() {
    }

    public static final DeferredBlockEntityType<UsefulBeehiveBlockEntity> USEFUL_BEEHIVE = BLOCK_ENTITY_TYPES.register("useful_beehive", UsefulBeehiveBlockEntity::new, FoundationBlocks.USEFUL_BEEHIVE);
}
