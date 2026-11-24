package net.mreskimo.ecologymod.datagen;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.mreskimo.ecologymod.blocks.EcologicalBlocks;

import java.util.Set;

import static net.minecraft.world.level.block.Blocks.END_STONE;


public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        dropSelf(EcologicalBlocks.BANDED_IRON.get());
        dropSelf(EcologicalBlocks.RED_MOSS_BLOCK.get());
        dropSelf(EcologicalBlocks.ORANGE_MOSS_BLOCK.get());
        dropSelf(EcologicalBlocks.YELLOW_MOSS_BLOCK.get());
        dropSelf(EcologicalBlocks.WHITE_ICE.get());
     }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return EcologicalBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
