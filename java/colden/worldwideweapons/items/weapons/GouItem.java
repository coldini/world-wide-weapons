package colden.worldwideweapons.items.weapons;

import colden.worldwideweapons.effect.ModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class GouItem extends SwordItem {
    public GouItem(ToolMaterial toolMaterial, Settings settings){
        super(toolMaterial, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker){
    if(attacker.getOffHandStack().getItem() instanceof GouItem &&
    attacker.getMainHandStack().getItem() instanceof GouItem){
        target.addStatusEffect(new StatusEffectInstance(ModEffects.STUNNED, 32, 1), attacker);

    }
    target.disablesShield();
    return super.postHit(stack,target, attacker);
    }
}
