package colden.worldwideweapons.effect;

import colden.worldwideweapons.WorldWideWeapons;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;

public class Reach extends StatusEffect {
    public Reach(StatusEffectCategory category, int color) {
        super(category, color);
        this.addAttributeModifier(EntityAttributes.PLAYER_ENTITY_INTERACTION_RANGE, Identifier.of(WorldWideWeapons.MOD_ID, "reach"), 200.0, EntityAttributeModifier.Operation.ADD_VALUE);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }


}
