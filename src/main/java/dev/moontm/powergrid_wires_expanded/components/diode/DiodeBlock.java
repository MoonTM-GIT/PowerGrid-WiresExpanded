package dev.moontm.powergrid_wires_expanded.components.diode;

import com.simibubi.create.foundation.block.IBE;
import dev.moontm.powergrid_wires_expanded.registry.ModdedBlockEntities;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.patryk3211.powergrid.electricity.base.*;
import org.patryk3211.powergrid.electricity.info.Current;
import org.patryk3211.powergrid.electricity.info.IHaveElectricProperties;
import org.patryk3211.powergrid.electricity.info.Voltage;

import java.util.List;

public class DiodeBlock
        extends HorizontalElectricBlock
        implements IBE<DiodeBlockEntity>, IHaveElectricProperties {

    private static final TerminalBoundingBox[] TERMINALS_NORTH =
            new TerminalBoundingBox[] {
                    // Terminal 0 = anode
                    new TerminalBoundingBox(
                            IDecoratedTerminal.POSITIVE,
                            7, 3, 0,
                            9, 5, 3

                    ).withColor(IDecoratedTerminal.RED),

                    // Terminal 1 = cathode
                    new TerminalBoundingBox(
                            IDecoratedTerminal.NEGATIVE,
                            7, 3, 13,
                            9, 5, 16
                    ).withColor(IDecoratedTerminal.BLUE)
            };

    public DiodeBlock(Properties properties) {
        super(properties);
        setTerminalCollection(
                horizontalNorthTerminals(
                        this,
                        TERMINALS_NORTH,
                        box(5, 1, 2, 11, 7, 14)
                )
        );
    }

    @Override
    public void appendProperties(
            ItemStack stack,
            Player player,
            List<Component> tooltip
    ) {
        Voltage.rated(1000, player, tooltip);
        Current.max(10, player, tooltip);
    }

    @Override
    public Class<DiodeBlockEntity> getBlockEntityClass() {
        return DiodeBlockEntity.class;
    }

    @Override
    public BlockEntityType<? extends DiodeBlockEntity> getBlockEntityType() {
        return ModdedBlockEntities.PHYSICAL_DIODE_ENTITY.get();
    }
}
