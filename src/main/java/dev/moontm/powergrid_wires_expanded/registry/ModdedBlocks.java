package dev.moontm.powergrid_wires_expanded.registry;

import dev.moontm.powergrid_wires_expanded.WiresExpanded;
import dev.moontm.powergrid_wires_expanded.components.diode.DiodeBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModdedBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(WiresExpanded.MODID);

    public static final DeferredBlock<DiodeBlock> PHYSICAL_DIODE =
            BLOCKS.register(
                    "physical_diode",
                    () -> new DiodeBlock(
                            BlockBehaviour.Properties.of()
                                    .strength(1.5f)
                    )
            );
}
