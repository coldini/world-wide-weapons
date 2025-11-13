package colden.worldwideweapons.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;

public class BraveryEffect extends StatusEffect {
    public BraveryEffect(StatusEffectCategory category, int color) {
        super(category, color);
        this.addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, Identifier.of("worldwideweapons", "bravery_strength"), 120, EntityAttributeModifier.Operation.ADD_VALUE); // Strength
        this.addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, Identifier.of("worldwideweapons", "bravery_haste"), 0.6, EntityAttributeModifier.Operation.ADD_VALUE); // Haste
        this.addAttributeModifier(EntityAttributes.GENERIC_ARMOR, Identifier.of("worldwideweapons", "bravery_resistance"), 2.0, EntityAttributeModifier.Operation.ADD_VALUE);

    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean applyUpdateEffect(net.minecraft.entity.LivingEntity entity, int amplifier) {
        // Custom behavior for the Bravery effect can be added here
        // For example, increasing attack damage or resistance

        return super.applyUpdateEffect(entity, amplifier);
    }
}
