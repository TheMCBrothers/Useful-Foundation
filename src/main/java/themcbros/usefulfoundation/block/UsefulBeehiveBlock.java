package themcbros.usefulfoundation.block;

import net.minecraft.block.BeehiveBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import themcbros.usefulfoundation.tileentity.UsefulBeehiveTileEntity;

import javax.annotation.Nullable;

public class UsefulBeehiveBlock extends BeehiveBlock {

    public UsefulBeehiveBlock(Properties properties) {
        super(properties);
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(IBlockReader worldIn) {
        return new UsefulBeehiveTileEntity();
    }
}
