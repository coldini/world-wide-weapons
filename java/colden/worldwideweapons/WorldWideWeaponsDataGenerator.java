package colden.worldwideweapons;

import colden.worldwideweapons.data.provider.WorldwideWeaponsEnglishLangProvider;
import colden.worldwideweapons.data.provider.WorldwideWeaponsItemTagProvider;
import colden.worldwideweapons.data.provider.WorldwideWeaponsModelProvider;
import colden.worldwideweapons.data.provider.WorldwideWeaponsRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;

public class WorldWideWeaponsDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(WorldwideWeaponsModelProvider::new);
        pack.addProvider(WorldwideWeaponsItemTagProvider::new);
        pack.addProvider(WorldwideWeaponsEnglishLangProvider::new);
        pack.addProvider(WorldwideWeaponsRecipeProvider::new);
        // Add other providers as needed
    }
    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        // No custom registries to build for this mod

    }
}
