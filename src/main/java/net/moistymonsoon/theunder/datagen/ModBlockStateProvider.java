package net.moistymonsoon.theunder.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.moistymonsoon.theunder.TheUnder;
import net.moistymonsoon.theunder.block.ModBlocks;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TheUnder.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.LENTARITE);
        blockWithItem(ModBlocks.LENTARITE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_LENTARITE_BRICKS);
        blockWithItem(ModBlocks.POLISHED_LENTARITE);
        blockWithItem(ModBlocks.CHISELED_LENTARITE);
        blockWithItem(ModBlocks.CHLORITE);
        blockWithItem(ModBlocks.CHLORITE_BRICKS);
        blockWithItem(ModBlocks.SAPPHIRITE);
        blockWithItem(ModBlocks.SAPPHIRITE_BRICKS);
        blockWithItem(ModBlocks.POLISHED_SAPPHIRITE);
        blockWithItem(ModBlocks.POLISHED_SAPPHIRITE_BRICKS);
        blockWithItem(ModBlocks.POLISHED_SAPPHIRITE_TILES);
        blockWithItem(ModBlocks.CHISELED_SAPPHIRITE);
        blockWithItem(ModBlocks.LOAM);
        blockWithItem(ModBlocks.GLACIAL_ICE);
        blockWithItem(ModBlocks.FLESH_POROUS);
        blockWithItem(ModBlocks.FLESH_CLUMP);
        blockWithItem(ModBlocks.BRITESTONE);
        blockWithItem(ModBlocks.VOIDROCK);

    }

    private void blockWithItem(DeferredBlock<Block> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
