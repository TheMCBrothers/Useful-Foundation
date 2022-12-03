package themcbros.usefulfoundation.tileentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BeehiveBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import themcbros.usefulfoundation.init.FoundationBlockEntities;

public class UsefulBeehiveBlockEntity extends BeehiveBlockEntity {
    public UsefulBeehiveBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return FoundationBlockEntities.USEFUL_BEEHIVE.get();
    }
}
