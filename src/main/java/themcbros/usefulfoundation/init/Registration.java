package themcbros.usefulfoundation.init;

import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.themcbrothers.lib.registration.deferred.BlockDeferredRegister;
import net.themcbrothers.lib.registration.deferred.BlockEntityDeferredRegister;
import net.themcbrothers.lib.registration.deferred.ItemDeferredRegister;
import themcbros.usefulfoundation.UsefulFoundation;
import themcbros.usefulfoundation.data.world.FoundationOreFeatures;
import themcbros.usefulfoundation.data.world.FoundationOrePlacement;

public class Registration {
    public static final BlockDeferredRegister BLOCKS = new BlockDeferredRegister(UsefulFoundation.MOD_ID);
    public static final BlockEntityDeferredRegister BLOCK_ENTITY_TYPES = new BlockEntityDeferredRegister(UsefulFoundation.MOD_ID);
    public static final ItemDeferredRegister ITEMS = new ItemDeferredRegister(UsefulFoundation.MOD_ID);
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, UsefulFoundation.MOD_ID);
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, UsefulFoundation.MOD_ID);

    public static void register(IEventBus bus) {
        FoundationBlocks.init();
        FoundationItems.init();
        FoundationBlockEntities.init();
        FoundationOreFeatures.init();
        FoundationOrePlacement.init();

        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITY_TYPES.register(bus);
        CONFIGURED_FEATURES.register(bus);
        PLACED_FEATURES.register(bus);
    }
}
