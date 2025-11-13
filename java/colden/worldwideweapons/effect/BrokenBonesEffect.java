package colden.worldwideweapons.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class BrokenBonesEffect extends StatusEffect {
    public BrokenBonesEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override

        public boolean applyUpdateEffect(LivingEntity entity, int amplifier){
            // Slow movement
            if (!entity.getAttributeInstance(net.minecraft.entity.attribute.EntityAttributes.GENERIC_MOVEMENT_SPEED).hasModifier(ModEffects.BROKEN_BONES_MODIFIER.id())) {
                entity.getAttributeInstance(net.minecraft.entity.attribute.EntityAttributes.GENERIC_MOVEMENT_SPEED)
                        .addPersistentModifier(ModEffects.BROKEN_BONES_MODIFIER);
            }

            // Reduce jump height: needs a Mixin on LivingEntity#jump() to multiply upward velocity
        return super.applyUpdateEffect(entity, amplifier);
        }





    }




