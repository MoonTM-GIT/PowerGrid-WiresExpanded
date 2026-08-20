package dev.moontm.powergrid_wires_expanded.components.diode;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import org.patryk3211.powergrid.electricity.info.ElectricPropertiesUtils;
import org.patryk3211.powergrid.electricity.info.IHaveElectricProperties;

import java.util.List;

public class DiodeBlockItem extends BlockItem {

    public DiodeBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, context, tooltip, flag);
        if (getBlock() instanceof IHaveElectricProperties properties) {
            ElectricPropertiesUtils.modify(
                    properties,
                    stack,
                    Minecraft.getInstance().player,
                    flag,
                    tooltip
            );
        }
    }
}
