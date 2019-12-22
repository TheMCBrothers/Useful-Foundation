package themcbros.usefulfoundation.init;

import com.google.common.collect.Lists;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import themcbros.usefulfoundation.UsefulFoundation;
import themcbros.usefulfoundation.tileentity.UsefulBeehiveTileEntity;

import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = UsefulFoundation.MOD_ID)
public class FoundationTileEntities {

    private static final List<TileEntityType<?>> TILE_ENTITY_TYPES = Lists.newArrayList();

    public static final TileEntityType<UsefulBeehiveTileEntity> USEFUL_BEEHIVE = TileEntityType.Builder.create(UsefulBeehiveTileEntity::new, FoundationBlocks.USEFUL_BEEHIVE).build(null);

    private static <T extends TileEntity> TileEntityType<T> registerType(String registryName, TileEntityType<T> type) {
        type.setRegistryName(UsefulFoundation.getId(registryName));
        TILE_ENTITY_TYPES.add(type);
        return type;
    }

    @SubscribeEvent
    public static void registerTileEntityTypes(final RegistryEvent.Register<TileEntityType<?>> event) {
        TILE_ENTITY_TYPES.forEach(event.getRegistry()::register);
    }

}
