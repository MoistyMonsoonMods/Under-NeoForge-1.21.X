package net.moistymonsoon.theunder.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.moistymonsoon.theunder.TheUnder;
import net.moistymonsoon.theunder.block.ModBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheUnder.MOD_ID);

    public static final Supplier<CreativeModeTab> UNDER_TAB =
            CREATIVE_MODE_TABS.register("under_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.theunder.under_tab"))
                    .icon(() -> new ItemStack(ModItems.SILVER_INGOT.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.LENTARITE);
                        output.accept(ModBlocks.LENTARITE_BRICKS);
                        output.accept(ModBlocks.CRACKED_LENTARITE_BRICKS);
                        output.accept(ModBlocks.POLISHED_LENTARITE);
                        output.accept(ModBlocks.CHISELED_LENTARITE);
                        output.accept(ModBlocks.MOSSY_LENTARITE);
                        output.accept(ModBlocks.LOAM);
                        output.accept(ModBlocks.CHLORITE);
                        output.accept(ModBlocks.CHLORITE_BRICKS);
                        output.accept(ModBlocks.SAPPHIRITE);
                        output.accept(ModBlocks.SAPPHIRITE_BRICKS);
                        output.accept(ModBlocks.POLISHED_SAPPHIRITE);
                        output.accept(ModBlocks.POLISHED_SAPPHIRITE_BRICKS);
                        output.accept(ModBlocks.POLISHED_SAPPHIRITE_TILES);
                        output.accept(ModBlocks.CHISELED_SAPPHIRITE);
                        output.accept(ModBlocks.GLACIAL_ICE);
                        output.accept(ModBlocks.FLESH_POROUS);
                        output.accept(ModBlocks.FLESH_CLUMP);

                        output.accept(ModItems.SILVER_INGOT);
                        output.accept(ModItems.RAW_SILVER);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
