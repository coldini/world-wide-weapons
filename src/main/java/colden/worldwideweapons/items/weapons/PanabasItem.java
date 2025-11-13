package colden.worldwideweapons.items.weapons;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;

import java.util.Map;

public class    PanabasItem extends SwordItem {
    private static final Map<Block, Block> STRIPPABLES = Map.of(
            Blocks.OAK_LOG, Blocks.STRIPPED_OAK_LOG,
            Blocks.SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG,
            Blocks.BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG,
            Blocks.JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG

    );
    public static final Map<Block, Block> STRIPPABLES_WOOD = Map.of(
            Blocks.DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_WOOD,
            Blocks.ACACIA_LOG, Blocks.STRIPPED_ACACIA_WOOD,
            Blocks.CHERRY_LOG, Blocks.STRIPPED_CHERRY_LOG

    );

    public PanabasItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.disablesShield();
        return true;
    }


    public boolean isSuitableFor(BlockState state) {
        Block block = state.getBlock();
        return block == Blocks.OAK_LOG || block == Blocks.SPRUCE_LOG || block == Blocks.BIRCH_LOG ||
                block == Blocks.JUNGLE_LOG || block == Blocks.ACACIA_LOG || block == Blocks.DARK_OAK_LOG ||
                block == Blocks.OAK_WOOD || block == Blocks.SPRUCE_WOOD || block == Blocks.BIRCH_WOOD ||
                block == Blocks.JUNGLE_WOOD || block == Blocks.ACACIA_WOOD || block == Blocks.DARK_OAK_WOOD;
    }


    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        if (isSuitableFor(state)) {
            return this.getMaterial().getMiningSpeedMultiplier();
        }
        return super.getMiningSpeed(stack, state);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockState state = context.getWorld().getBlockState(context.getBlockPos());
        Block stripped = STRIPPABLES.get(state.getBlock());
        // Try to get from the second map if not found in the first
        if (stripped == null) {
            stripped = STRIPPABLES_WOOD.get(state.getBlock());
        }
        // If still not found, return super
        if (stripped != null) {
            context.getWorld().setBlockState(
                    context.getBlockPos(),
                    stripped.getDefaultState().with(Properties.AXIS, state.get(Properties.AXIS)),
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
}

