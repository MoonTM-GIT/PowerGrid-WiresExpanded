package dev.moontm.powergrid_wires_expanded.wires;

import dev.moontm.powergrid_wires_expanded.WiresExpanded;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.ArrayList;
import java.util.List;

public class WireItems {

    public static final List<DeferredItem<Item>> WIRES = new ArrayList<>();

    private static DeferredItem<Item> wire(String id) {
        DeferredItem<Item> item = WiresExpanded.ITEMS.register(id, () -> new Item(new Item.Properties()));
        WIRES.add(item);
        return item;
    }

    // Copper Wires
    public static final DeferredItem<Item> COPPER_WIRE_25MM = wire("copper_wire_25mm");
    public static final DeferredItem<Item> COPPER_WIRE_50MM = wire("copper_wire_50mm");
    public static final DeferredItem<Item> COPPER_WIRE_100MM = wire("copper_wire_100mm");
    public static final DeferredItem<Item> COPPER_WIRE_200MM = wire("copper_wire_200mm");

    // Insulated Copper Wires
    public static final DeferredItem<Item> INSULATED_COPPER_WIRE_25MM = wire("insulated_copper_wire_25mm");
    public static final DeferredItem<Item> INSULATES_COPPER_WIRE_50MM = wire("insulated_copper_wire_50mm");
    public static final DeferredItem<Item> INSULATED_COPPER_WIRE_100MM = wire("insulated_copper_wire_100mm");
    public static final DeferredItem<Item> INSULATED_COPPER_WIRE_200MM = wire("insulated_copper_wire_200mm");

    // Iron Wire
    public static final DeferredItem<Item> IRON_WIRE_50MM = wire("iron_wire_50mm");
    public static final DeferredItem<Item> IRON_WIRE_100MM = wire("iron_wire_100mm");
    public static final DeferredItem<Item> IRON_WIRE_200MM = wire("iron_wire_200mm");
    public static final DeferredItem<Item> IRON_WIRE_400MM = wire("iron_wire_400mm");
}
