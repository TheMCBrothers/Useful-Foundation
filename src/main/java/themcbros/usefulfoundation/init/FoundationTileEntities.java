package themcbros.usefulfoundation.init;

import com.google.common.collect.Lists;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import themcbros.usefulfoundation.UsefulFoundation;
import themcbros.usefulfoundation.tileentity.UsefulBeehiveBlockEntity;

import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = UsefulFoundation.MOD_ID)
public class FoundationTileEntities {
    private static final List<BlockEntityType<?>> TILE_ENTITY_TYPES = Lists.newArrayList();

    public static final BlockEntityType<UsefulBeehiveBlockEntity> USEFUL_BEEHIVE = BlockEntityType.Builder.of(UsefulBeehiveBlockEntity::new, FoundationBlocks.USEFUL_BEEHIVE).build(null);

    private static <T extends BlockEntity> BlockEntityType<T> registerType(String registryName, BlockEntityType<T> type) {
        type.setRegistryName(UsefulFoundation.getId(registryName));
        TILE_ENTITY_TYPES.add(type);
        return type;
    }

    @SubscribeEvent
    public static void registerTileEntityTypes(final RegistryEvent.Register<BlockEntityType<?>> event) {
        TILE_ENTITY_TYPES.forEach(event.getRegistry()::register);
    }
}
