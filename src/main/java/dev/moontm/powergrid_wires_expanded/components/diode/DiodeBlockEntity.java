package dev.moontm.powergrid_wires_expanded.components.diode;

import dev.moontm.powergrid_wires_expanded.registry.ModdedBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import org.patryk3211.powergrid.electricity.base.ElectricBlockEntity;
import org.patryk3211.powergrid.electricity.base.ThermalBehaviour;
import org.patryk3211.powergrid.electricity.sim.special.PNJunctionWire;

public class DiodeBlockEntity extends ElectricBlockEntity {

    private static final double REVERSE_SATURATION_CURRENT = 5.47e-9;
    private static final double SERIES_RESISTANCE = 0.075;
    private static final double IDEALITY_FACTOR = 1.783;

    public static final double MAX_VOLTAGE = 1000.0;

    private PNJunctionWire diode;

    public DiodeBlockEntity(BlockPos pos, BlockState state) {
        super(ModdedBlockEntities.PHYSICAL_DIODE_ENTITY.get(), pos, state);
    }

    @Override
    public void buildCircuit(CircuitBuilder builder) {
        builder.setTerminalCount(2);

        diode = new PNJunctionWire(
                REVERSE_SATURATION_CURRENT,
                SERIES_RESISTANCE,
                22.0,
                IDEALITY_FACTOR,
                MAX_VOLTAGE,
                1e-6,
                builder.terminalNode(0),
                builder.terminalNode(1)
        );
        builder.add(diode);
    }

    @Override
    public ThermalBehaviour specifyThermalBehaviour() {
        return ThermalBehaviour.forMaxPower(
                this,
                0.75f,
                17.0f, // -> ~10A max Current
                175.0f
        );
    }

    @Override
    public void electricalTick() {
        if (diode == null)
            return;
        applyPower(diode);
    }
}
