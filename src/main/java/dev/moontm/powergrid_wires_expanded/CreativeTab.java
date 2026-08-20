package dev.moontm.powergrid_wires_expanded;

import dev.moontm.powergrid_wires_expanded.wires.WireItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;

public class CreativeTab {
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATIVE_TAB = WiresExpanded.CREATIVE_MODE_TABS.register("wires_expanded_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(WireItems.COPPER_WIRE_50MM.get()))
            .title(Component.translatable("itemGroup.wires_expanded"))
            .displayItems((parameters, output) -> {
                // Wires
                WireItems.WIRES.forEach(output::accept);
            })
            .build());
}
