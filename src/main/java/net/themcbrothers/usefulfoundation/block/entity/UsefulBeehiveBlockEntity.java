package net.themcbrothers.usefulfoundation.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BeehiveBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.themcbrothers.usefulfoundation.infrastructure.FoundationBlockEntityTypes;

public class UsefulBeehiveBlockEntity extends BeehiveBlockEntity {
    public UsefulBeehiveBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return FoundationBlockEntityTypes.USEFUL_BEEHIVE.get();
    }
}
