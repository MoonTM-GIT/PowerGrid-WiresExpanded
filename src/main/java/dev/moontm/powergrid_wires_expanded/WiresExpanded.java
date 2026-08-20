package dev.moontm.powergrid_wires_expanded;

import com.mojang.logging.LogUtils;
import dev.moontm.powergrid_wires_expanded.registry.ModdedBlockEntities;
import dev.moontm.powergrid_wires_expanded.registry.ModdedBlocks;
import dev.moontm.powergrid_wires_expanded.registry.ModdedCreativeTab;
import dev.moontm.powergrid_wires_expanded.registry.ModdedItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(WiresExpanded.MODID)
public class WiresExpanded {

    public static final String MODID = "powergrid_wires_expanded";
    private static final Logger LOGGER = LogUtils.getLogger();

    public WiresExpanded(IEventBus modEventBus, ModContainer modContainer) {
        ModdedBlocks.BLOCKS.register(modEventBus);
        ModdedBlockEntities.BLOCK_ENTITIES.register(modEventBus);
        ModdedItems.ITEMS.register(modEventBus);
        ModdedCreativeTab.CREATIVE_MODE_TABS.register(modEventBus);
    }
}
