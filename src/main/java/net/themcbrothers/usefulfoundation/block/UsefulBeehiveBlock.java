package net.themcbrothers.usefulfoundation.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.themcbrothers.usefulfoundation.infrastructure.FoundationBlockEntityTypes;

import javax.annotation.Nullable;

public class UsefulBeehiveBlock extends BeehiveBlock {
    public UsefulBeehiveBlock(Properties properties) {
        super(properties);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return FoundationBlockEntityTypes.USEFUL_BEEHIVE.get().create(pos, state);
    }
}
