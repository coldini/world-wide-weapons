package colden.worldwideweapons.effect;

import colden.worldwideweapons.WorldWideWeapons;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class ModEffects {

    public static final RegistryEntry<StatusEffect> PEPPERFUL = registerStatusEffect("pepperful",
            new PepperfulEffects(StatusEffectCategory.HARMFUL, 0xFF4500)
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, Identifier.of(WorldWideWeapons.MOD_ID, "pepperful"), -0.4F,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> BRAVERY = registerStatusEffect("bravery",
            new BraveryEffect(StatusEffectCategory.BENEFICIAL, 0xFFD700)
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, Identifier.of(WorldWideWeapons.MOD_ID, "bravery_strength"), 2.0,
                            EntityAttributeModifier.Operation.ADD_VALUE) // Strength
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, Identifier.of(WorldWideWeapons.MOD_ID, "bravery_haste"), 0.6,
                            EntityAttributeModifier.Operation.ADD_VALUE) // Haste
                    .addAttributeModifier(EntityAttributes.GENERIC_ARMOR, Identifier.of(WorldWideWeapons.MOD_ID, "bravery_resistance"), 2.0,
                            EntityAttributeModifier.Operation.ADD_VALUE));// Resistance

    public static final RegistryEntry<StatusEffect> BLEEDING = registerStatusEffect("bleeding",
            new BleedingEffect()
    );

    public static final EntityAttributeModifier BROKEN_BONES_MODIFIER =
            new EntityAttributeModifier(
                    Identifier.of(WorldWideWeapons.MOD_ID, "broken_bones"),
                    -0.5,
                    EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL
            );

    public static final RegistryEntry<StatusEffect> BROKEN_BONES = registerStatusEffect("broken_bones",
            new BrokenBonesEffect(StatusEffectCategory.HARMFUL, 0x1E90FF)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, Identifier.of(WorldWideWeapons.MOD_ID, "broken_bones"), -0.2F,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));


    public static final RegistryEntry<StatusEffect> REACH = registerStatusEffect("reach",
            new Reach(StatusEffectCategory.BENEFICIAL, 0xADD8E6)
                    .addAttributeModifier(EntityAttributes.PLAYER_ENTITY_INTERACTION_RANGE, Identifier.of(WorldWideWeapons.MOD_ID, "reach"), 1.0,
                            EntityAttributeModifier.Operation.ADD_VALUE));

    public static final RegistryEntry<StatusEffect> POLEARM_REACH = registerStatusEffect("polearm_reach",
            new PolearmReach(StatusEffectCategory.BENEFICIAL, 0x90EE90)
                    .addAttributeModifier(EntityAttributes.PLAYER_ENTITY_INTERACTION_RANGE, Identifier.of(WorldWideWeapons.MOD_ID, "polearm_reach"), 2.0,
                            EntityAttributeModifier.Operation.ADD_VALUE));

    public static final RegistryEntry<StatusEffect> STUNNED = registerStatusEffect("stunned",
            new StunnedEffect(StatusEffectCategory.HARMFUL, 0x808080)
    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, Identifier.of(WorldWideWeapons.MOD_ID, "stunned"), -0.75F,
            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, Identifier.of(WorldWideWeapons.MOD_ID, "stunned"), -0.5F,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect){
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(WorldWideWeapons.MOD_ID, name), statusEffect);
    }
    public static void registerEffects() {
        // This method can be used to register custom effects if needed
        WorldWideWeapons.LOGGER.info("Registering Mod Effects");
    }

}
