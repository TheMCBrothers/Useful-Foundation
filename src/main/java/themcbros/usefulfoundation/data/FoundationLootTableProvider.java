package themcbros.usefulfoundation.data;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.packs.VanillaLootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FoundationLootTableProvider extends LootTableProvider {

    public FoundationLootTableProvider(PackOutput output) {
        super(output, Set.of(), VanillaLootTableProvider.create(output).getTables());
    }

    @Override
    @Nonnull
    public List<SubProviderEntry> getTables() {
        return List.of(new LootTableProvider.SubProviderEntry(FoundationBlockLoot::new, LootContextParamSets.BLOCK));
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, @Nonnull ValidationContext context) {
        map.forEach((location, lootTable) -> LootTables.validate(context, location, lootTable));
    }
}
