package colden.worldwideweapons.items;

import colden.worldwideweapons.WorldWideWeapons;
import colden.worldwideweapons.items.weapons.*;
import net.minecraft.item.Item;

import net.minecraft.item.MaceItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class itemInitializer {



    public static final khopeshitem IRON_KHOPESH = register("iron_khopesh", new khopeshitem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(
            khopeshitem.createAttributeModifiers(ToolMaterials.IRON, 4, -2.6F)
    ).maxCount(1)));
    public static final khopeshitem GOLDEN_KHOPESH = register("golden_khopesh", new khopeshitem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(
            khopeshitem.createAttributeModifiers(ToolMaterials.GOLD,4, -2.6F)
    ).maxCount(1)));
    public static final khopeshitem DIAMOND_KHOPESH = register("diamond_khopesh", new khopeshitem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(
            khopeshitem.createAttributeModifiers(ToolMaterials.DIAMOND, 4, -2.6F)
    ).maxCount(1)));
    public static final khopeshitem NETHERITE_KHOPESH = register("netherite_khopesh", new khopeshitem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(
            khopeshitem.createAttributeModifiers(ToolMaterials.NETHERITE, 4, -2.6F)
    ).maxCount(1).fireproof()));
    public static final Item SQUID_TOOTH = register("squid_tooth", new Item(new Item.Settings().maxCount(16)));
    public static final MaceItem MACUAHUITL = register("macuahuitl", new Macuahuitlitem( new Item.Settings()
            .attributeModifiers((Macuahuitlitem.createAttributeModifiers())).maxCount(1)));


    public static final OmozoItem IRON_OMOZO = register("iron_omozo", new OmozoItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(
            OmozoItem.createAttributeModifiers(ToolMaterials.IRON, 4, -2.7F)
    ).maxCount(1)));
    public static final OmozoItem GOLDEN_OMOZO = register("golden_omozo", new OmozoItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(
            OmozoItem.createAttributeModifiers(ToolMaterials.GOLD, 4, -2.7F)
    ).maxCount(1)));
    public static final OmozoItem DIAMOND_OMOZO = register("diamond_omozo", new OmozoItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(
            OmozoItem.createAttributeModifiers(ToolMaterials.DIAMOND, 4, -2.7F)
    ).maxCount(1)));
    public static final OmozoItem NETHERITE_OMOZO = register("netherite_omozo", new OmozoItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(
            OmozoItem.createAttributeModifiers(ToolMaterials.NETHERITE, 4, -2.7F)
    ).maxCount(1).fireproof()));


    public static KubaItem IRON_KUBA = register("iron_kuba", new KubaItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(
            KubaItem.createAttributeModifiers(ToolMaterials.IRON, 5, -2.7F)
    ).maxCount(1)));
    public static KubaItem GOLDEN_KUBA = register("golden_kuba", new KubaItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(
            KubaItem.createAttributeModifiers(ToolMaterials.GOLD, 5, -2.7F)
    ).maxCount(1)));
    public static KubaItem DIAMOND_KUBA = register("diamond_kuba", new KubaItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(
            KubaItem.createAttributeModifiers(ToolMaterials.DIAMOND, 5, -2.7F)
    ).maxCount(1)));
    public static KubaItem NETHERITE_KUBA = register("netherite_kuba", new KubaItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(
            KubaItem.createAttributeModifiers(ToolMaterials.NETHERITE, 5, -2.7F)
    ).maxCount(1).fireproof()));



    public static PanabasItem IRON_PANABAS = register("iron_panabas", new PanabasItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(
            PanabasItem.createAttributeModifiers(ToolMaterials.IRON, 7, -2.8F)).maxCount(1)));
    public static PanabasItem GOLDEN_PANABAS = register("golden_panabas", new PanabasItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(
            PanabasItem.createAttributeModifiers(ToolMaterials.GOLD, 7, -2.8F)).maxCount(1)));
    public static PanabasItem DIAMOND_PANABAS = register("diamond_panabas", new PanabasItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(
            PanabasItem.createAttributeModifiers(ToolMaterials.DIAMOND, 7, -2.8F)).maxCount(1)));
    public static PanabasItem NETHERITE_PANABAS = register("netherite_panabas", new PanabasItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(
            PanabasItem.createAttributeModifiers(ToolMaterials.NETHERITE, 7, -2.8F)).maxCount(1).fireproof()));


    public static BoloKnifeItem IRON_BOLO_KNIFE = register("iron_bolo_knife", new BoloKnifeItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(
            BoloKnifeItem.createAttributeModifiers(ToolMaterials.IRON, 2, -0.5F)).maxCount(1)));
    public static BoloKnifeItem GOLDEN_BOLO_KNIFE = register("golden_bolo_knife", new BoloKnifeItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(
            BoloKnifeItem.createAttributeModifiers(ToolMaterials.GOLD, 2, -0.5F)).maxCount(1)));
    public static BoloKnifeItem DIAMOND_BOLO_KNIFE = register("diamond_bolo_knife", new BoloKnifeItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(
            BoloKnifeItem.createAttributeModifiers(ToolMaterials.DIAMOND, 2, -0.5F)).maxCount(1)));
    public static BoloKnifeItem NETHERITE_BOLO_KNIFE = register("netherite_bolo_knife", new BoloKnifeItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(
            BoloKnifeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 2, -0.5F)).maxCount(1).fireproof()));

    // Register more items here as needed


    public static LeiomanoItem IRON_LEIOMANO = register("iron_leiomano", new LeiomanoItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(
            LeiomanoItem.createAttributeModifiers(ToolMaterials.IRON, 4, -2.4F)
    ).maxCount(1)));
    public static LeiomanoItem GOLDEN_LEIOMANO = register("golden_leiomano", new LeiomanoItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(
            LeiomanoItem.createAttributeModifiers(ToolMaterials.GOLD, 4, -2.4F)
    ).maxCount(1)));
    public static LeiomanoItem DIAMOND_LEIOMANO = register("diamond_leiomano", new LeiomanoItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(
            LeiomanoItem.createAttributeModifiers(ToolMaterials.DIAMOND, 4, -2.4F)
    ).maxCount(1)));
    public static LeiomanoItem NETHERITE_LEIOMANO = register("netherite_leiomano", new LeiomanoItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(
            LeiomanoItem.createAttributeModifiers(ToolMaterials.NETHERITE, 4, -2.4F)
    ).maxCount(1).fireproof()));


    public static KatarItem KATAR = register("katar", new KatarItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(
            KatarItem.createAttributeModifiers(ToolMaterials.DIAMOND, 3, -2.5F)
    ).maxCount(1)));

    public static GouItem IRON_GOU = register("iron_gou", new GouItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(
            GouItem.createAttributeModifiers(ToolMaterials.IRON, 5, -2.5F)
    )));
    public static GouItem GOLDEN_GOU = register("golden_gou", new GouItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(
            GouItem.createAttributeModifiers(ToolMaterials.GOLD, 5, -2.5F)
    )));
    public static GouItem DIAMOND_GOU = register("diamond_gou", new GouItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(
            GouItem.createAttributeModifiers(ToolMaterials.DIAMOND, 5, -2.5F)
    )));
    public static GouItem NETHERITE_GOU = register("netherite_gou", new GouItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(
            GouItem.createAttributeModifiers(ToolMaterials.NETHERITE, 5, -2.5F)
    )));

    public static PadaoItem IRON_PADAO = register("iron_padao", new PadaoItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(
            PadaoItem.createAttributeModifiers(ToolMaterials.IRON, 2, -2.7F)
    )));
    public static PadaoItem GOLDEN_PADAO = register("golden_padao", new PadaoItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(
            PadaoItem.createAttributeModifiers(ToolMaterials.GOLD, 2, -2.7F)
    )));
    public static PadaoItem DIAMOND_PADAO = register("diamond_padao", new PadaoItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(
            PadaoItem.createAttributeModifiers(ToolMaterials.DIAMOND, 2, -2.7F)
    )));
    public static PadaoItem NETHERITE_PADAO = register("netherite_padao", new PadaoItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(
            PadaoItem.createAttributeModifiers(ToolMaterials.NETHERITE, 2, -2.7F)
    )));

    public static LanceItem IRON_LANCE = register("iron_lance", new LanceItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(
            LanceItem.createAttributeModifiers(ToolMaterials.IRON, 4, -2.6F)
    )));
    public static LanceItem GOLDEN_LANCE = register("golden_lance", new LanceItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(
            LanceItem.createAttributeModifiers(ToolMaterials.GOLD, 4, -2.6F)
    )));
    public static LanceItem DIAMOND_LANCE = register("diamond_lance", new LanceItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(
            LanceItem.createAttributeModifiers(ToolMaterials.DIAMOND, 4, -2.6F)
    )));
    public static LanceItem NETHERITE_LANCE = register("netherite_lance", new LanceItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(
            LanceItem.createAttributeModifiers(ToolMaterials.NETHERITE, 4, -2.6F)
    )));















    //Custom Smithing Templates for weapon Transforms
    public static Item SMITHING_TEMPLATE_KHOPESH = register("khopesh_smithing_template", new Item(new Item.Settings()));

    public static Item SMITHING_TEMPLATE_OMOZO = register("omozo_smithing_template", new Item(new Item.Settings()));
    public static Item SMITHING_TEMPLATE_KUBA = register("kuba_smithing_template", new Item(new Item.Settings()));
    public static Item SMITHING_TEMPLATE_GOU = register("gou_smithing_template", new Item(new Item.Settings()));
    public static Item SMITHING_TEMPLATE_PANABAS = register("panabas_smithing_template", new Item(new Item.Settings()));
    public static Item SMITHING_TEMPLATE_PADAO = register("padao_smithing_template", new Item(new Item.Settings()));
    public static Item SMITHING_TEMPLATE_MACUAHUITL = register("macuahuitl_smithing_template", new Item(new Item.Settings()));
    public static Item SMITHING_TEMPLATE_LEIOANO = register("leiomano_smithing_template", new Item(new Item.Settings()));
    public static Item SMITHING_TEMPLATE_LANCE = register("lance_smithing_template", new Item(new Item.Settings()));
    public static Item SMITHING_TEMPLATE_KATAR =register("katar_smithing_template", new Item(new Item.Settings()));
    public static Item SMITHING_TEMPLATE_KANABO = register("kanabo_smithing_template", new Item(new Item.Settings()));
    public static Item SMITHING_TEMPLATE_BOLO = register("bolo_knife_smithing_template", new Item(new Item.Settings()));




        public static void load(){}
    public static final <T extends Item>T register(String name, T item){
        return Registry.register(Registries.ITEM, WorldWideWeapons.id(name), item);
    }


}
