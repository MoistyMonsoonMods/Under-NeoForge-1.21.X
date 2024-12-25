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
        blockWithItem(ModBlocks.CHLORITE);
        blockWithItem(ModBlocks.SAPPHIRITE);
        blockWithItem(ModBlocks.GLACIAL_ICE);

    }

    private void blockWithItem(DeferredBlock<Block> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
