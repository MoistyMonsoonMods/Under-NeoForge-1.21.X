package net.moistymonsoon.theunder.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.moistymonsoon.theunder.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.LENTARITE.get());
        dropSelf(ModBlocks.LENTARITE_BRICKS.get());
        dropSelf(ModBlocks.CRACKED_LENTARITE_BRICKS.get());
        dropSelf(ModBlocks.POLISHED_LENTARITE.get());
        dropSelf(ModBlocks.CHISELED_LENTARITE.get());
        dropSelf(ModBlocks.LOAM.get());
        dropSelf(ModBlocks.SAPPHIRITE_BRICKS.get());
        dropSelf(ModBlocks.POLISHED_SAPPHIRITE.get());
        dropSelf(ModBlocks.POLISHED_SAPPHIRITE_BRICKS.get());
        dropSelf(ModBlocks.POLISHED_SAPPHIRITE_TILES.get());
        dropSelf(ModBlocks.CHISELED_SAPPHIRITE.get());
        dropSelf(ModBlocks.MOSSY_LENTARITE.get());
        dropSelf(ModBlocks.CHLORITE.get());
        dropSelf(ModBlocks.CHLORITE_BRICKS.get());
        dropSelf(ModBlocks.SAPPHIRITE.get());
        dropSelf(ModBlocks.GLACIAL_ICE.get());
        dropSelf(ModBlocks.BRITESTONE.get());
        dropSelf(ModBlocks.VOIDROCK.get());
        dropWhenSilkTouch(ModBlocks.FLESH_POROUS.get());
        dropWhenSilkTouch(ModBlocks.FLESH_CLUMP.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
