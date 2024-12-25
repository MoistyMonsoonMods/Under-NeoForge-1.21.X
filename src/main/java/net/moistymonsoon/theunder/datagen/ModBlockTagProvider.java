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
                .add(ModBlocks.CHLORITE.get())
                .add(ModBlocks.SAPPHIRITE.get())
                .add(ModBlocks.GLACIAL_ICE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.LENTARITE.get())
                .add(ModBlocks.CHLORITE.get())
                .add(ModBlocks.SAPPHIRITE.get())
                .add(ModBlocks.GLACIAL_ICE.get());
    }
}
