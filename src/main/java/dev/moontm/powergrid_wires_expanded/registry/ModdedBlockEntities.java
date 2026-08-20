package dev.moontm.powergrid_wires_expanded.registry;

import dev.moontm.powergrid_wires_expanded.WiresExpanded;
import dev.moontm.powergrid_wires_expanded.components.diode.DiodeBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModdedBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(
                    BuiltInRegistries.BLOCK_ENTITY_TYPE,
                    WiresExpanded.MODID
            );

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DiodeBlockEntity>> PHYSICAL_DIODE_ENTITY =
            BLOCK_ENTITIES.register(
                    "physical_diode_entity",
                    () -> BlockEntityType.Builder.of(
                            DiodeBlockEntity::new,
                            ModdedBlocks.PHYSICAL_DIODE.get()
                    ).build(null)
            );
}