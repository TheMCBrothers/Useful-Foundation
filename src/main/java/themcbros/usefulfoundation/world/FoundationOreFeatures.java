package themcbros.usefulfoundation.world;

import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import themcbros.usefulfoundation.UsefulFoundation;
import themcbros.usefulfoundation.init.FoundationBlocks;

import java.util.List;
import java.util.function.Supplier;

import static net.minecraft.data.worldgen.features.OreFeatures.DEEPSLATE_ORE_REPLACEABLES;
import static net.minecraft.data.worldgen.features.OreFeatures.STONE_ORE_REPLACEABLES;

public final class FoundationOreFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, UsefulFoundation.MOD_ID);

    //Targets
    private static final Supplier<List<OreConfiguration.TargetBlockState>> ORE_ALUMINUM_SUPPLIER = Suppliers.memoize(() -> List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, FoundationBlocks.ALUMINUM_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_ALUMINUM_ORE.get().defaultBlockState())));
    private static final Supplier<List<OreConfiguration.TargetBlockState>> ORE_LEAD_SUPPLIER = Suppliers.memoize(() -> List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, FoundationBlocks.LEAD_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_LEAD_ORE.get().defaultBlockState())));
    private static final Supplier<List<OreConfiguration.TargetBlockState>> ORE_NICKEL_SUPPLIER = Suppliers.memoize(() -> List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, FoundationBlocks.NICKEL_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_NICKEL_ORE.get().defaultBlockState())));
    private static final Supplier<List<OreConfiguration.TargetBlockState>> ORE_PLATINUM_SUPPLIER = Suppliers.memoize(() -> List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, FoundationBlocks.PLATINUM_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_PLATINUM_ORE.get().defaultBlockState())));
    private static final Supplier<List<OreConfiguration.TargetBlockState>> ORE_SILVER_SUPPLIER = Suppliers.memoize(() -> List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, FoundationBlocks.SILVER_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState())));
    private static final Supplier<List<OreConfiguration.TargetBlockState>> ORE_TIN_SUPPLIER = Suppliers.memoize(() -> List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, FoundationBlocks.TIN_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState())));
    private static final Supplier<List<OreConfiguration.TargetBlockState>> ORE_URANIUM_SUPPLIER = Suppliers.memoize(() -> List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, FoundationBlocks.URANIUM_ORE.get().defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_URANIUM_ORE.get().defaultBlockState())));

    //Features
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_ALUMINUM = CONFIGURED_FEATURES.register("ore_aluminum", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_ALUMINUM_SUPPLIER.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_LEAD = CONFIGURED_FEATURES.register("ore_lead", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_LEAD_SUPPLIER.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_NICKEL = CONFIGURED_FEATURES.register("ore_nickel", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_NICKEL_SUPPLIER.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_PLATINUM = CONFIGURED_FEATURES.register("ore_platinum", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_PLATINUM_SUPPLIER.get(), 4)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_SILVER = CONFIGURED_FEATURES.register("ore_silver", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_SILVER_SUPPLIER.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_TIN = CONFIGURED_FEATURES.register("ore_tin", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_TIN_SUPPLIER.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_URANIUM = CONFIGURED_FEATURES.register("ore_uranium", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_URANIUM_SUPPLIER.get(), 8)));

    public static void init() {
    }
}
