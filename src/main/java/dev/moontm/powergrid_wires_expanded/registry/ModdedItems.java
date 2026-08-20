package dev.moontm.powergrid_wires_expanded.registry;

import dev.moontm.powergrid_wires_expanded.WiresExpanded;
import dev.moontm.powergrid_wires_expanded.components.diode.DiodeBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModdedItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WiresExpanded.MODID);
    public static final List<DeferredItem<? extends Item>> CREATIVE_TAB_ITEMS = new ArrayList<>();

    private static <T extends Item> DeferredItem<T> register(String name, boolean creative, Supplier<T> item) {
        DeferredItem<T> registered = ITEMS.register(name, item);
        if(creative) CREATIVE_TAB_ITEMS.add(registered);
        return registered;
    }

    public static final DeferredItem<BlockItem> PHYSICAL_DIODE_ITEM =
            register("physical_diode", true, () -> new DiodeBlockItem(
                            ModdedBlocks.PHYSICAL_DIODE.get(),
                            new Item.Properties()
                    )
            );

    // Wires
    // Copper
    public static final DeferredItem<Item> COPPER_WIRE_25MM = register("copper_wire_25mm", true, () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_WIRE_50MM = register("copper_wire_50mm", true, () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_WIRE_100MM = register("copper_wire_100mm", true, () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_WIRE_200MM = register("copper_wire_200mm", true, () -> new Item(new Item.Properties()));

    // Insulated Copper
    public static final DeferredItem<Item> INSULATED_COPPER_WIRE_25MM = register("insulated_copper_wire_25mm", true, () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INSULATED_COPPER_WIRE_50MM = register("insulated_copper_wire_50mm", true, () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INSULATED_COPPER_WIRE_100MM = register("insulated_copper_wire_100mm", true, () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INSULATED_COPPER_WIRE_200MM = register("insulated_copper_wire_200mm", true, () -> new Item(new Item.Properties()));

    // Iron
    public static final DeferredItem<Item> IRON_WIRE_50MM = register("iron_wire_50mm", true, () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_WIRE_100MM = register("iron_wire_100mm", true, () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_WIRE_200MM = register("iron_wire_200mm", true, () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_WIRE_400MM = register("iron_wire_400mm", true, () -> new Item(new Item.Properties()));
}
