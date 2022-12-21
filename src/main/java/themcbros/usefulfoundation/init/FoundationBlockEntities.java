package themcbros.usefulfoundation.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.RegistryObject;
import themcbros.usefulfoundation.tileentity.UsefulBeehiveBlockEntity;

import static themcbros.usefulfoundation.init.Registration.BLOCK_ENTITY_TYPES;

public class FoundationBlockEntities {
    public static final RegistryObject<BlockEntityType<UsefulBeehiveBlockEntity>> USEFUL_BEEHIVE = BLOCK_ENTITY_TYPES.register("useful_beehive", () -> BlockEntityType.Builder.of(UsefulBeehiveBlockEntity::new, FoundationBlocks.USEFUL_BEEHIVE.get()).build(null));

    protected static void init() {
    }
}
