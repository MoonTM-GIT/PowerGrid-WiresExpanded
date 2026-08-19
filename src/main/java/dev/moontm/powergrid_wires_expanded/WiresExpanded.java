package dev.moontm.powergrid_wires_expanded;

import com.mojang.logging.LogUtils;
import dev.moontm.powergrid_wires_expanded.wires.WireItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

@Mod(WiresExpanded.MODID)
public class WiresExpanded {
    public static final String MODID = "powergrid_wires_expanded";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public WiresExpanded(IEventBus modEventBus, ModContainer modContainer) {
        //force class init so deferred registration works
        WireItems.COPPER_WIRES.getFirst();
        CreativeTab.CREATIVE_TAB.getId();

        ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
