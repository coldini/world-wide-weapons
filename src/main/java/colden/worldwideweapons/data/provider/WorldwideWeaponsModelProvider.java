package colden.worldwideweapons.data.provider;

import colden.worldwideweapons.items.itemInitializer;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class WorldwideWeaponsModelProvider extends FabricModelProvider {
    public WorldwideWeaponsModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // Implement your block state model generation logic here
        // Example: blockStateModelGenerator.registerSimpleCubeAll(BlockInit.EXAMPLE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Implement your item model generation logic here
        // Example: itemModelGenerator.register(ItemInit.EXAMPLE_ITEM, Models.GENERATED);
        itemModelGenerator.register(itemInitializer.IRON_KHOPESH, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.GOLDEN_KHOPESH, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.DIAMOND_KHOPESH, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.NETHERITE_KHOPESH, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.SQUID_TOOTH, Models.GENERATED);
        itemModelGenerator.register(itemInitializer.MACUAHUITL, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.IRON_OMOZO, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.GOLDEN_OMOZO, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.DIAMOND_OMOZO, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.NETHERITE_OMOZO, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.IRON_KUBA, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.GOLDEN_KUBA, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.DIAMOND_KUBA, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.NETHERITE_KUBA, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.IRON_PANABAS, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.GOLDEN_PANABAS, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.DIAMOND_PANABAS, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.NETHERITE_PANABAS, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.IRON_BOLO_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.GOLDEN_BOLO_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.DIAMOND_BOLO_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.NETHERITE_BOLO_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.IRON_LEIOMANO, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.GOLDEN_LEIOMANO, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.DIAMOND_LEIOMANO, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.NETHERITE_LEIOMANO, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.IRON_GOU, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.GOLDEN_GOU, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.DIAMOND_GOU, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.NETHERITE_GOU, Models.HANDHELD);

        itemModelGenerator.register(itemInitializer.IRON_PADAO, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.GOLDEN_PADAO, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.DIAMOND_PADAO, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.NETHERITE_PADAO, Models.HANDHELD);

        itemModelGenerator.register(itemInitializer.IRON_LANCE, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.GOLDEN_LANCE, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.DIAMOND_LANCE, Models.HANDHELD);
        itemModelGenerator.register(itemInitializer.NETHERITE_LANCE, Models.HANDHELD);



        itemModelGenerator.register(itemInitializer.KATAR, Models.HANDHELD);

    }

}
