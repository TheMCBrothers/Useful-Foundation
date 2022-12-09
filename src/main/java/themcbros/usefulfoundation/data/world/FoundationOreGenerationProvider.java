package themcbros.usefulfoundation.data.world;

import com.google.gson.JsonElement;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.JsonCodecProvider;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.holdersets.AnyHolderSet;
import org.jetbrains.annotations.NotNull;
import themcbros.usefulfoundation.UsefulFoundation;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class FoundationOreGenerationProvider implements DataProvider {
    private final DataGenerator gen;
    private final ExistingFileHelper fileHelper;
    private final RegistryOps<JsonElement> regOps;

    public FoundationOreGenerationProvider(DataGenerator gen, ExistingFileHelper fileHelper, RegistryOps<JsonElement> regOps) {
        this.gen = gen;
        this.fileHelper = fileHelper;
        this.regOps = regOps;
    }

    @Override
    public void run(@NotNull CachedOutput cachedOutput) throws IOException {
        JsonCodecProvider.forDatapackRegistry(
                        this.gen,
                        this.fileHelper,
                        UsefulFoundation.MOD_ID,
                        this.regOps, ForgeRegistries.Keys.BIOME_MODIFIERS,
                        generateBiomeModifiers(regOps.registryAccess)
                )
                .run(cachedOutput);
    }

    @Override
    @NotNull
    public String getName() {
        return "Biome Modifiers: " + UsefulFoundation.MOD_ID;
    }

    private static Map<ResourceLocation, BiomeModifier> generateBiomeModifiers(RegistryAccess ra) {
        Map<ResourceLocation, BiomeModifier> biomeModifierMap = new HashMap<>();

        generateBiomeOres(
                ra.registryOrThrow(Registry.BIOME_REGISTRY),
                ra.registryOrThrow(Registry.PLACED_FEATURE_REGISTRY),
                biomeModifierMap
        );

        return biomeModifierMap;
    }

    private static void generateBiomeOres(Registry<Biome> bRegistry, Registry<PlacedFeature> pfRegistry, Map<ResourceLocation, BiomeModifier> map) {
        HolderSet<Biome> allBiomes = new AnyHolderSet<>(bRegistry);

        addOreToBiomeGen(map, FoundationOrePlacement.ORE_ALUMINUM.getId().getPath(), allBiomes, pfRegistry);
        addOreToBiomeGen(map, FoundationOrePlacement.ORE_LEAD.getId().getPath(), allBiomes, pfRegistry);
        addOreToBiomeGen(map, FoundationOrePlacement.ORE_NICKEL.getId().getPath(), allBiomes, pfRegistry);
        addOreToBiomeGen(map, FoundationOrePlacement.ORE_PLATINUM.getId().getPath(), allBiomes, pfRegistry);
        addOreToBiomeGen(map, FoundationOrePlacement.ORE_PLATINUM_TOP.getId().getPath(), allBiomes, pfRegistry);
        addOreToBiomeGen(map, FoundationOrePlacement.ORE_TIN.getId().getPath(), allBiomes, pfRegistry);
        addOreToBiomeGen(map, FoundationOrePlacement.ORE_SILVER.getId().getPath(), allBiomes, pfRegistry);
        addOreToBiomeGen(map, FoundationOrePlacement.ORE_URANIUM.getId().getPath(), allBiomes, pfRegistry);
    }

    private static void addOreToBiomeGen(Map<ResourceLocation, BiomeModifier> map, String name, HolderSet<Biome> biomes, Registry<PlacedFeature> pfRegistry) {
        ResourceKey<PlacedFeature> resourceKey = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(UsefulFoundation.MOD_ID, name));
        ForgeBiomeModifiers.AddFeaturesBiomeModifier addFeaturesBiomeModifier = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes, HolderSet.direct(Holder.Reference.createStandAlone(pfRegistry, resourceKey)), GenerationStep.Decoration.UNDERGROUND_ORES);

        map.put(new ResourceLocation(UsefulFoundation.MOD_ID, name + "_generation"), addFeaturesBiomeModifier);
    }
}
