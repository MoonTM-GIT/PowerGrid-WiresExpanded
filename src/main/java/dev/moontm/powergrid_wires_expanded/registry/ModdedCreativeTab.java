package dev.moontm.powergrid_wires_expanded.registry;

import dev.moontm.powergrid_wires_expanded.WiresExpanded;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModdedCreativeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WiresExpanded.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TABS.register("wires_expanded_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModdedItems.COPPER_WIRE_50MM.get()))
            .title(Component.translatable("itemGroup.wires_expanded"))
            .displayItems((parameters, output) -> {
                ModdedItems.CREATIVE_TAB_ITEMS.forEach(output::accept);
            })
            .build());
}
