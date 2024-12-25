package net.moistymonsoon.theunder.datagen;

import net.minecraft.data.PackOutput;
import net.moistymonsoon.theunder.TheUnder;
import net.moistymonsoon.theunder.item.ModItems;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TheUnder.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.SILVER_INGOT.get());
        basicItem(ModItems.RAW_SILVER.get());
    }
}
