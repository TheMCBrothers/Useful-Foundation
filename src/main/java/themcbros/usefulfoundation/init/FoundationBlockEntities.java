package themcbros.usefulfoundation.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.RegistryObject;
import themcbros.usefulfoundation.tileentity.UsefulBeehiveBlockEntity;

import static themcbros.usefulfoundation.init.Registration.BLOCK_ENTITIES;

public class FoundationBlockEntities {
    public static final RegistryObject<BlockEntityType<UsefulBeehiveBlockEntity>> USEFUL_BEEHIVE = BLOCK_ENTITIES.register("useful_beehive", UsefulBeehiveBlockEntity::new, FoundationBlocks.USEFUL_BEEHIVE);

    public static void init() {
    }
}
