package colden.worldwideweapons.items.weapons;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;


public class khopeshitem extends SwordItem {
    public khopeshitem( ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // Custom behavior for the Khopesh can be added here
        // For example, applying a knockback effect and disabling shields
        // Knockback effect
        target.addVelocity(
            -Math.sin(Math.toRadians(attacker.getYaw())) * -0.5,
            0.1,
            Math.cos(Math.toRadians(attacker.getYaw())) * -0.5
        );

        return super.postHit(stack, target, attacker);

    }


}
