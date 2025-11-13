package colden.worldwideweapons.data.provider;

import colden.worldwideweapons.WorldWideWeapons;
import colden.worldwideweapons.items.itemGroupInit;
import colden.worldwideweapons.items.itemInitializer;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.rmi.registry.Registry;
import java.util.concurrent.CompletableFuture;

public class WorldwideWeaponsEnglishLangProvider extends FabricLanguageProvider {
    public WorldwideWeaponsEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookuo) {
        super(dataOutput, "en_us", registryLookuo);
    }

    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if (text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            WorldWideWeapons.LOGGER.warn("Failed to add translation for text : {}", text.getString());
        }

    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(itemInitializer.IRON_KHOPESH, "Iron Khopesh");
        translationBuilder.add(itemInitializer.GOLDEN_KHOPESH, "Golden Khopesh");
        translationBuilder.add(itemInitializer.DIAMOND_KHOPESH, "Diamond Khopesh");
        translationBuilder.add(itemInitializer.NETHERITE_KHOPESH, "Netherite Khopesh");
        translationBuilder.add(itemInitializer.MACUAHUITL, "Macuahuitl");
        translationBuilder.add(itemInitializer.SQUID_TOOTH, "Squid Tooth");
        translationBuilder.add(itemInitializer.IRON_OMOZO, "Iron Omozo");
        translationBuilder.add(itemInitializer.GOLDEN_OMOZO, "Golden Omozo");
        translationBuilder.add(itemInitializer.DIAMOND_OMOZO, "Diamond Omozo");
        translationBuilder.add(itemInitializer.NETHERITE_OMOZO, "Netherite Omozo");
        translationBuilder.add(itemInitializer.IRON_KUBA, "Iron Kuba");
        translationBuilder.add(itemInitializer.GOLDEN_KUBA, "Golden Kuba");
        translationBuilder.add(itemInitializer.DIAMOND_KUBA, "Diamond Kuba");
        translationBuilder.add(itemInitializer.NETHERITE_KUBA, "Netherite Kuba");
        translationBuilder.add(itemInitializer.IRON_PANABAS, "Iron Panabas");
        translationBuilder.add(itemInitializer.GOLDEN_PANABAS, "Golden Panabas");
        translationBuilder.add(itemInitializer.DIAMOND_PANABAS, "Diamond Panabas");
        translationBuilder.add(itemInitializer.NETHERITE_PANABAS, "Netherite Panabas");
        translationBuilder.add(itemInitializer.IRON_BOLO_KNIFE, "Iron Bolo Knife");
        translationBuilder.add(itemInitializer.GOLDEN_BOLO_KNIFE, "Golden Bolo Knife");
        translationBuilder.add(itemInitializer.DIAMOND_BOLO_KNIFE, "Diamond Bolo Knife");
        translationBuilder.add(itemInitializer.NETHERITE_BOLO_KNIFE, "Netherite Bolo Knife");
        translationBuilder.add(itemInitializer.IRON_LEIOMANO, "Iron Leiomano");
        translationBuilder.add(itemInitializer.GOLDEN_LEIOMANO, "Golden Leiomano");
        translationBuilder.add(itemInitializer.DIAMOND_LEIOMANO, "Diamond Leiomano");
        translationBuilder.add(itemInitializer.NETHERITE_LEIOMANO, "Netherite Leiomano");
        translationBuilder.add(itemInitializer.KATAR, "Katar");

        translationBuilder.add(itemInitializer.IRON_GOU, "Iron Gou");
        translationBuilder.add(itemInitializer.GOLDEN_GOU, "Golden Gou");
        translationBuilder.add(itemInitializer.DIAMOND_GOU, "Diamond Gou");
        translationBuilder.add(itemInitializer.NETHERITE_GOU, "Netherite Gou");
        translationBuilder.add(itemInitializer.IRON_PADAO, "Iron Padao");
        translationBuilder.add(itemInitializer.GOLDEN_PADAO, "Golden Padao");
        translationBuilder.add(itemInitializer.DIAMOND_PADAO, "Diamond Padao");
        translationBuilder.add(itemInitializer.NETHERITE_PADAO, "Netherite Padao");

        translationBuilder.add(itemInitializer.IRON_LANCE, "Iron Lance");
        translationBuilder.add(itemInitializer.GOLDEN_LANCE, "Golden Lance");
        translationBuilder.add(itemInitializer.DIAMOND_LANCE, "Diamond Lance");
        translationBuilder.add(itemInitializer.NETHERITE_LANCE, "Netherite Lance");



        addText(translationBuilder, itemGroupInit.MY_TITLE, "Worldwide Weapons");
    }

}


