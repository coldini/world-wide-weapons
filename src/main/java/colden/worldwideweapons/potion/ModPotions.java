package colden.worldwideweapons.potion;


import colden.worldwideweapons.WorldWideWeapons;
import colden.worldwideweapons.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {
    public static final RegistryEntry<Potion> PEPPERFUL = registerPotion("pepperful", new Potion(new StatusEffectInstance(ModEffects.PEPPERFUL, 1200, 0)));
    public static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(WorldWideWeapons.MOD_ID, name), potion);
    }
    public static void register(){
        WorldWideWeapons.LOGGER.info("regoistering mod potions for " + WorldWideWeapons.MOD_ID);
    }


}
