package colden.worldwideweapons.items;

import colden.worldwideweapons.WorldWideWeapons;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class itemGroupInit {
    public static final Text MY_TITLE =  Text.translatable("Worldwide Weapons");

    public static final ItemGroup WORLDWIDE_WEAPONS = register("worldwide_weapons",
            FabricItemGroup.builder()
                    .displayName(MY_TITLE)
                    .icon(() -> itemInitializer.IRON_KHOPESH.getDefaultStack())
                    .entries((displayContext, entries) -> {
                        addTagGroupToEntries(entries, "khopesh");
                        addTagGroupToEntries(entries, "omozo");
                        addTagGroupToEntries(entries, "kuba");
                        addTagGroupToEntries(entries, "leiomono");
                        addTagGroupToEntries(entries, "panabas");
                        addTagGroupToEntries(entries, "bolo_knife");
                        addTagGroupToEntries(entries, "gou");
                        addTagGroupToEntries(entries, "katar");
                        addTagGroupToEntries(entries, "padao");
                        addTagGroupToEntries(entries, "lance");
                        addTagGroupToEntries(entries, "macuahuitl");
                        addTagGroupToEntries(entries, "templates");


                    })

                    .build());
    public  static <T extends ItemGroup> T register(String name, T itemGroup){
        return Registry.register(Registries.ITEM_GROUP, WorldWideWeapons.id(name), itemGroup);
    }
    public static void addTagGroupToEntries(ItemGroup.Entries entries, String tagName){
        TagKey<Item> tag = TagKey.of(RegistryKeys.ITEM, Identifier.of(WorldWideWeapons.MOD_ID, tagName));
        for (Item item : Registries.ITEM.stream().filter(i -> i.getDefaultStack().isIn(tag)).toList()) {
            entries.add(item);
        }    }
    public static void load() {
    }
}
