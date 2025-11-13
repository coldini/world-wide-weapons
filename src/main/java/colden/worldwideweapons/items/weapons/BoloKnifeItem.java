package colden.worldwideweapons.items.weapons;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.block.Block;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

import java.util.List;
import java.util.Map;

public class BoloKnifeItem extends SwordItem {
    private static final Map<Block, Block> FARMLANDS = Map.of(
            Blocks.DIRT, Blocks.FARMLAND,
            Blocks.COARSE_DIRT, Blocks.FARMLAND,
            Blocks.PODZOL, Blocks.FARMLAND,
            Blocks.GRASS_BLOCK, Blocks.FARMLAND
    );
    public BoloKnifeItem(ToolMaterial toolMaterial, Item.Settings settings){
        super(toolMaterial, settings);
    }

    public boolean isSuitableFor(BlockState state) {
        Block block = state.getBlock();
        return block == Blocks.DIRT || block == Blocks.COARSE_DIRT || block == Blocks.PODZOL || block == Blocks.GRASS_BLOCK;
    }
    @Override
    public ActionResult useOnBlock(net.minecraft.item.ItemUsageContext context) {
        BlockState state = context.getWorld().getBlockState(context.getBlockPos());
        Block farmland = FARMLANDS.get(state.getBlock());
        if (farmland != null) {
            // Only till if block above is air
            if (!context.getWorld().getBlockState(context.getBlockPos().up()).isAir()) {
                return ActionResult.PASS;
            }
            context.getWorld().setBlockState(
                    context.getBlockPos(),
                    farmland.getDefaultState(),
                    11
            );
            ItemStack stack = context.getStack();
            PlayerEntity player = context.getPlayer();
            if (player != null) {
                stack.damage(1, player, null);
            }
            return ActionResult.SUCCESS;
        }
        return super.useOnBlock(context);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.world-wide-weapons.bolo_knife.tooltip"));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
