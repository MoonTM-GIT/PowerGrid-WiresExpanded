package dev.moontm.powergrid_wires_expanded.wires;

import dev.moontm.powergrid_wires_expanded.WiresExpanded;
import dev.moontm.powergrid_wires_expanded.wires.copper.CopperWire100mm;
import dev.moontm.powergrid_wires_expanded.wires.copper.CopperWire200mm;
import dev.moontm.powergrid_wires_expanded.wires.copper.CopperWire25mm;
import dev.moontm.powergrid_wires_expanded.wires.copper.CopperWire50mm;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

public class WireItems {

    // Copper Wires
    public static final DeferredItem<Item> COPPER_WIRE_25MM = WiresExpanded.ITEMS.register("copper_wire_25mm", CopperWire25mm::new);
    public static final DeferredItem<Item> COPPER_WIRE_50MM = WiresExpanded.ITEMS.register("copper_wire_50mm", CopperWire50mm::new);
    public static final DeferredItem<Item> COPPER_WIRE_100MM = WiresExpanded.ITEMS.register("copper_wire_100mm", CopperWire100mm::new);
    public static final DeferredItem<Item> COPPER_WIRE_200MM = WiresExpanded.ITEMS.register("copper_wire_200mm", CopperWire200mm::new);
}
