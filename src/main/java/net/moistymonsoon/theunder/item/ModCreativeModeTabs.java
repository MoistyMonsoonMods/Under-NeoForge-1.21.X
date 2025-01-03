package net.moistymonsoon.theunder.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.moistymonsoon.theunder.TheUnder;
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
                        output.accept(ModItems.SILVER_INGOT);
                        output.accept(ModItems.RAW_SILVER);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
