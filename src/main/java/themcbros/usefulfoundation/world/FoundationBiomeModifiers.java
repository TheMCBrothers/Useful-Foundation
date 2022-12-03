package themcbros.usefulfoundation.world;

import com.google.gson.JsonElement;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.data.DataGenerator;
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
import themcbros.usefulfoundation.UsefulFoundation;

import java.util.HashMap;
import java.util.Map;

public final class FoundationBiomeModifiers {
    public static JsonCodecProvider<BiomeModifier> dataGenBiomeModifiers(DataGenerator gen, ExistingFileHelper exFileHelper, RegistryOps<JsonElement> regOps) {
        return JsonCodecProvider.forDatapackRegistry(gen, exFileHelper, UsefulFoundation.MOD_ID, regOps, ForgeRegistries.Keys.BIOME_MODIFIERS, generateBiomeModifiers(regOps.registryAccess));
    }

    private static Map<ResourceLocation, BiomeModifier> generateBiomeModifiers(RegistryAccess registryAccess) {
        Map<ResourceLocation, BiomeModifier> biomeModifierMap = new HashMap<>();

        generateBiomeOres(registryAccess.registryOrThrow(Registry.BIOME_REGISTRY), registryAccess.registryOrThrow(Registry.PLACED_FEATURE_REGISTRY), biomeModifierMap);

        return biomeModifierMap;
    }

    private static void generateBiomeOres(Registry<Biome> biomeRegistry, Registry<PlacedFeature> placedFeatureRegistry, Map<ResourceLocation, BiomeModifier> map) {
        HolderSet<Biome> allBiomes = new AnyHolderSet<>(biomeRegistry);

        addOreToBiomeGen(map, FoundationOrePlacement.ORE_ALUMINUM.getId().getPath(), allBiomes, placedFeatureRegistry);
        addOreToBiomeGen(map, FoundationOrePlacement.ORE_LEAD.getId().getPath(), allBiomes, placedFeatureRegistry);
        addOreToBiomeGen(map, FoundationOrePlacement.ORE_NICKEL.getId().getPath(), allBiomes, placedFeatureRegistry);
        addOreToBiomeGen(map, FoundationOrePlacement.ORE_PLATINUM.getId().getPath(), allBiomes, placedFeatureRegistry);
        addOreToBiomeGen(map, FoundationOrePlacement.ORE_PLATINUM_TOP.getId().getPath(), allBiomes, placedFeatureRegistry);
        addOreToBiomeGen(map, FoundationOrePlacement.ORE_TIN.getId().getPath(), allBiomes, placedFeatureRegistry);
        addOreToBiomeGen(map, FoundationOrePlacement.ORE_SILVER.getId().getPath(), allBiomes, placedFeatureRegistry);
        addOreToBiomeGen(map, FoundationOrePlacement.ORE_URANIUM.getId().getPath(), allBiomes, placedFeatureRegistry);
    }

    public static void addOreToBiomeGen(Map<ResourceLocation, BiomeModifier> map, String name, HolderSet<Biome> biomes, Registry<PlacedFeature> placedFeatureRegistry) {
        ResourceKey<PlacedFeature> resourceKey = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(UsefulFoundation.MOD_ID, name));
        ForgeBiomeModifiers.AddFeaturesBiomeModifier addFeaturesBiomeModifier = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes, HolderSet.direct(Holder.Reference.createStandAlone(placedFeatureRegistry, resourceKey)), GenerationStep.Decoration.UNDERGROUND_ORES);

        map.put(new ResourceLocation(UsefulFoundation.MOD_ID, name + "_generation"), addFeaturesBiomeModifier);
    }

}
