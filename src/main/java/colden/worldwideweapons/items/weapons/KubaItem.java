package colden.worldwideweapons.items.weapons;

import colden.worldwideweapons.effect.ModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class KubaItem extends SwordItem {
    public KubaItem(ToolMaterial toolMaterial,Settings settings){
        super(toolMaterial, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // Custom behavior for the Kuba can be added here
        // For example, applying a knockback effect and disabling shields
        // Knockback effect
        attacker.addStatusEffect(new StatusEffectInstance(ModEffects.BRAVERY, 30, 1), attacker);

        return super.postHit(stack, target, attacker);

    }

}
