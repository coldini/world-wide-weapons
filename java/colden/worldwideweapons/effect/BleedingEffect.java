package colden.worldwideweapons.effect;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class BleedingEffect extends StatusEffect {
    public BleedingEffect() {
        super(StatusEffectCategory.HARMFUL, 0x8B0000); // Dark red color
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i = 25 >> amplifier;
        if (i > 0) {
            return duration % i == 0;
        } else {
            return true;
        }
    }
    public boolean applyUpdateEffect(net.minecraft.entity.LivingEntity entity, int amplifier) {
        if (entity.age % 40 == 0) { // Apply damage every 2 seconds (40 ticks)
            entity.damage(entity.getDamageSources().magic() , 1.0F + amplifier); // Damage scales with amplifier
        }
        return super.applyUpdateEffect(entity, amplifier);
    }
}
