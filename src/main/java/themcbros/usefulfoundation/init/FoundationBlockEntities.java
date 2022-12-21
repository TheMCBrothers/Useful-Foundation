package themcbros.usefulfoundation.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.RegistryObject;
import themcbros.usefulfoundation.tileentity.UsefulBeehiveBlockEntity;

public class FoundationBlockEntities {
    public static final RegistryObject<BlockEntityType<UsefulBeehiveBlockEntity>> USEFUL_BEEHIVE = Registration.BLOCK_ENTITIES.register("useful_beehive",
            () -> BlockEntityType.Builder.of(UsefulBeehiveBlockEntity::new, FoundationBlocks.USEFUL_BEEHIVE.get()).build(null));

    public static void init() {
    }
}
