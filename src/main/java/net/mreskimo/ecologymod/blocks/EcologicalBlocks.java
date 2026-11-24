package net.mreskimo.ecologymod.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.mreskimo.ecologymod.EcologyMod;
import net.mreskimo.ecologymod.items.EcologicalItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EcologicalBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(EcologyMod.MOD_ID);

    public static final DeferredBlock<Block> BANDED_IRON = registerBlock("banded_iron",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));

    public static final DeferredBlock<Block> ORANGE_MOSS_BLOCK = registerBlock("orange_moss_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_BLOCK)));

    public static final DeferredBlock<Block> RED_MOSS_BLOCK = registerBlock("red_moss_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_BLOCK)));

    public static final DeferredBlock<Block> YELLOW_MOSS_BLOCK = registerBlock("yellow_moss_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_BLOCK)));

    public static final DeferredBlock<Block> WHITE_ICE = registerBlock("white_ice",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ICE)));



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        EcologicalItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}