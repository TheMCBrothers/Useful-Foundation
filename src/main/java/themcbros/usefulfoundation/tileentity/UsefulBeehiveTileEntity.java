package themcbros.usefulfoundation.tileentity;

import net.minecraft.tileentity.BeehiveTileEntity;
import net.minecraft.tileentity.TileEntityType;
import themcbros.usefulfoundation.init.FoundationTileEntities;

public class UsefulBeehiveTileEntity extends BeehiveTileEntity {

    public UsefulBeehiveTileEntity() {
        super();
    }

    @Override
    public TileEntityType<?> getType() {
        return FoundationTileEntities.USEFUL_BEEHIVE;
    }
}
