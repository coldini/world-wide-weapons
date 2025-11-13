package colden.worldwideweapons.items.weapons;

import colden.worldwideweapons.effect.ModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class OmozoItem extends SwordItem {
    public OmozoItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // Custom behavior for the Khopesh can be added here
        // For example, applying a knockback effect and disabling shields
        // Knockback effect
        target.addStatusEffect(new StatusEffectInstance(ModEffects.PEPPERFUL, 12, 1), attacker);

        return super.postHit(stack, target, attacker);

    }
}
