package dev.moontm.powergrid_wires_expanded.wires;

import dev.moontm.powergrid_wires_expanded.WiresExpanded;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.ArrayList;
import java.util.List;

public class WireItems {

    public static final List<DeferredItem<Item>> COPPER_WIRES = new ArrayList<>();

    private static DeferredItem<Item> copperWire(String id) {
        DeferredItem<Item> item = WiresExpanded.ITEMS.register(id, () -> new Item(new Item.Properties()));
        COPPER_WIRES.add(item);
        return item;
    }

    // Copper Wires
    public static final DeferredItem<Item> COPPER_WIRE_25MM = copperWire("copper_wire_25mm");
    public static final DeferredItem<Item> COPPER_WIRE_50MM = copperWire("copper_wire_50mm");
    public static final DeferredItem<Item> COPPER_WIRE_100MM = copperWire("copper_wire_100mm");
    public static final DeferredItem<Item> COPPER_WIRE_200MM = copperWire("copper_wire_200mm");
}
