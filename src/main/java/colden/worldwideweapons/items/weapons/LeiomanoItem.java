package colden.worldwideweapons.items.weapons;

import colden.worldwideweapons.effect.ModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class LeiomanoItem extends SwordItem {
    public LeiomanoItem(ToolMaterial toolMaterial, Settings settings){
        super(toolMaterial, settings);
    }


    @Override
    public int getEnchantability() {
        return 30; // High enchantability value
    }


    @Override
    public boolean postHit(ItemStack stack, LivingEntity target,LivingEntity attacker) {

        target.addStatusEffect(new StatusEffectInstance(ModEffects.BLEEDING, 20, 1), attacker);

        return true;
    }
}
