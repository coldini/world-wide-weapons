package colden.worldwideweapons.data.provider;

import colden.worldwideweapons.WorldWideWeapons;
import colden.worldwideweapons.items.itemInitializer;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class WorldwideWeaponsItemTagProvider extends FabricTagProvider<Item> {
    public WorldwideWeaponsItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        // Add your item tag configurations here
        getOrCreateTagBuilder(ItemTags.SWORDS)

                .add(itemInitializer.IRON_KHOPESH)
                .add(itemInitializer.GOLDEN_KHOPESH)
                .add(itemInitializer.DIAMOND_KHOPESH)

                .add(itemInitializer.IRON_OMOZO)
                .add(itemInitializer.GOLDEN_OMOZO)
                .add(itemInitializer.DIAMOND_OMOZO)
                .add(itemInitializer.NETHERITE_OMOZO)
                .add(itemInitializer.NETHERITE_KHOPESH)

                .add(itemInitializer.IRON_KUBA)
                .add(itemInitializer.GOLDEN_KUBA)
                .add(itemInitializer.DIAMOND_KUBA)
                .add(itemInitializer.NETHERITE_KUBA)

                .add(itemInitializer.IRON_PANABAS)
                .add(itemInitializer.GOLDEN_PANABAS)
                .add(itemInitializer.DIAMOND_PANABAS)
                .add(itemInitializer.NETHERITE_PANABAS)

                .add(itemInitializer.IRON_BOLO_KNIFE)
                .add(itemInitializer.GOLDEN_BOLO_KNIFE)
                .add(itemInitializer.DIAMOND_BOLO_KNIFE)
                .add(itemInitializer.NETHERITE_BOLO_KNIFE)

                .add(itemInitializer.IRON_LEIOMANO)
                .add(itemInitializer.GOLDEN_LEIOMANO)
                .add(itemInitializer.DIAMOND_LEIOMANO)
                .add(itemInitializer.NETHERITE_LEIOMANO)
                .add(itemInitializer.KATAR)
                .add(itemInitializer.IRON_GOU)
                .add(itemInitializer.GOLDEN_GOU)
                .add(itemInitializer.DIAMOND_GOU)
                .add(itemInitializer.NETHERITE_GOU);


        getOrCreateTagBuilder(ItemTags.AXES)

                .add(itemInitializer.IRON_PANABAS)
                .add(itemInitializer.GOLDEN_PANABAS)
                .add(itemInitializer.DIAMOND_PANABAS)
                .add(itemInitializer.NETHERITE_PANABAS);
        getOrCreateTagBuilder(ItemTags.HOES)

                .add(itemInitializer.IRON_BOLO_KNIFE)
                .add(itemInitializer.GOLDEN_BOLO_KNIFE)
                .add(itemInitializer.DIAMOND_BOLO_KNIFE)
                .add(itemInitializer.NETHERITE_BOLO_KNIFE);

        getOrCreateTagBuilder(ItemTags.MACE_ENCHANTABLE)
                .add(itemInitializer.MACUAHUITL);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, WorldWideWeapons.id("khopesh")))
            .add(itemInitializer.IRON_KHOPESH)
            .add(itemInitializer.GOLDEN_KHOPESH)
            .add(itemInitializer.DIAMOND_KHOPESH)
            .add(itemInitializer.NETHERITE_KHOPESH);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM,  WorldWideWeapons.id("omozo")))
                .add(itemInitializer.IRON_OMOZO)
                .add(itemInitializer.GOLDEN_OMOZO)
                .add(itemInitializer.DIAMOND_OMOZO)
                .add(itemInitializer.NETHERITE_OMOZO);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, WorldWideWeapons.id("leiomano")))
                .add(itemInitializer.IRON_LEIOMANO)
                .add(itemInitializer.GOLDEN_LEIOMANO)
                .add(itemInitializer.DIAMOND_LEIOMANO)
                .add(itemInitializer.NETHERITE_LEIOMANO);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, WorldWideWeapons.id("panabas")))
                .add(itemInitializer.IRON_PANABAS)
                .add(itemInitializer.GOLDEN_PANABAS)
                .add(itemInitializer.DIAMOND_PANABAS)
                .add(itemInitializer.NETHERITE_PANABAS);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, WorldWideWeapons.id("bolo_knife")))
                .add(itemInitializer.IRON_BOLO_KNIFE)
                .add(itemInitializer.GOLDEN_BOLO_KNIFE)
                .add(itemInitializer.DIAMOND_BOLO_KNIFE)
                .add(itemInitializer.NETHERITE_BOLO_KNIFE);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, WorldWideWeapons.id("kuba")))
                .add(itemInitializer.IRON_KUBA)
                .add(itemInitializer.GOLDEN_KUBA)
                .add(itemInitializer.DIAMOND_KUBA)
                .add(itemInitializer.NETHERITE_KUBA);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, WorldWideWeapons.id("katar")))
                .add(itemInitializer.KATAR);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, WorldWideWeapons.id("gou")))
                .add(itemInitializer.IRON_GOU)
                .add(itemInitializer.GOLDEN_GOU)
                .add(itemInitializer.DIAMOND_GOU)
                .add(itemInitializer.NETHERITE_GOU);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, WorldWideWeapons.id("macuahuitl")))
                .add(itemInitializer.MACUAHUITL);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, WorldWideWeapons.id("padao")))
                .add(itemInitializer.IRON_PADAO)
                .add(itemInitializer.GOLDEN_PADAO)
                .add(itemInitializer.DIAMOND_PADAO)
                .add(itemInitializer.NETHERITE_PADAO);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, WorldWideWeapons.id("lance")))
                .add(itemInitializer.IRON_LANCE)
                .add(itemInitializer.GOLDEN_LANCE)
                .add(itemInitializer.DIAMOND_LANCE)
                .add(itemInitializer.NETHERITE_LANCE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, WorldWideWeapons.id("templates")))
                .add(itemInitializer.SMITHING_TEMPLATE_BOLO)
                .add(itemInitializer.SMITHING_TEMPLATE_GOU)
                .add(itemInitializer.SMITHING_TEMPLATE_KANABO)
                .add(itemInitializer.SMITHING_TEMPLATE_KATAR)
                .add(itemInitializer.SMITHING_TEMPLATE_KHOPESH)
                .add(itemInitializer.SMITHING_TEMPLATE_KUBA)
                .add(itemInitializer.SMITHING_TEMPLATE_LANCE)
                .add(itemInitializer.SMITHING_TEMPLATE_LEIOANO)
                .add(itemInitializer.SMITHING_TEMPLATE_MACUAHUITL)
                .add(itemInitializer.SMITHING_TEMPLATE_OMOZO)
                .add(itemInitializer.SMITHING_TEMPLATE_PADAO)
                .add(itemInitializer.SMITHING_TEMPLATE_PANABAS);







    }
}
