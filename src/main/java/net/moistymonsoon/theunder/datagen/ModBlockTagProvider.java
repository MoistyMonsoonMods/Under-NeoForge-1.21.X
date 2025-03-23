package net.moistymonsoon.theunder.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.moistymonsoon.theunder.TheUnder;
import net.moistymonsoon.theunder.block.ModBlocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TheUnder.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.LENTARITE.get())
                .add(ModBlocks.LENTARITE_BRICKS.get())
                .add(ModBlocks.CRACKED_LENTARITE_BRICKS.get())
                .add(ModBlocks.POLISHED_LENTARITE.get())
                .add(ModBlocks.CHISELED_LENTARITE.get())
                .add(ModBlocks.MOSSY_LENTARITE.get())
                .add(ModBlocks.CHLORITE.get())
                .add(ModBlocks.CHLORITE_BRICKS.get())
                .add(ModBlocks.SAPPHIRITE.get())
                .add(ModBlocks.SAPPHIRITE_BRICKS.get())
                .add(ModBlocks.POLISHED_SAPPHIRITE.get())
                .add(ModBlocks.POLISHED_SAPPHIRITE_BRICKS.get())
                .add(ModBlocks.POLISHED_SAPPHIRITE_TILES.get())
                .add(ModBlocks.CHISELED_SAPPHIRITE.get())
                .add(ModBlocks.GLACIAL_ICE.get())
                .add(ModBlocks.BRITESTONE.get())
                .add(ModBlocks.VOIDROCK.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.LENTARITE.get())
                .add(ModBlocks.LENTARITE_BRICKS.get())
                .add(ModBlocks.CRACKED_LENTARITE_BRICKS.get())
                .add(ModBlocks.POLISHED_LENTARITE.get())
                .add(ModBlocks.CHISELED_LENTARITE.get())
                .add(ModBlocks.MOSSY_LENTARITE.get())
                .add(ModBlocks.CHLORITE.get())
                .add(ModBlocks.CHLORITE_BRICKS.get())
                .add(ModBlocks.SAPPHIRITE.get())
                .add(ModBlocks.SAPPHIRITE_BRICKS.get())
                .add(ModBlocks.POLISHED_SAPPHIRITE.get())
                .add(ModBlocks.POLISHED_SAPPHIRITE_BRICKS.get())
                .add(ModBlocks.POLISHED_SAPPHIRITE_TILES.get())
                .add(ModBlocks.CHISELED_SAPPHIRITE.get())
                .add(ModBlocks.GLACIAL_ICE.get())
                .add(ModBlocks.BRITESTONE.get())
                .add(ModBlocks.VOIDROCK.get());
    }
}
