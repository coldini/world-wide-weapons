package colden.worldwideweapons.data.provider;

import colden.worldwideweapons.items.itemInitializer;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.data.server.recipe.VanillaRecipeProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.SmithingTransformRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class WorldwideWeaponsRecipeProvider  extends FabricRecipeProvider {
    public WorldwideWeaponsRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter){
        // Add your recipes here






        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemInitializer.IRON_KHOPESH)
                .input('W', ConventionalItemTags.IRON_INGOTS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern(" WW")
                .pattern(" W ")
                .pattern("S  ")
                .criterion(hasTag(ConventionalItemTags.IRON_INGOTS), conditionsFromTag(ConventionalItemTags.IRON_INGOTS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter, "iron_khopesh");
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemInitializer.GOLDEN_KHOPESH)
                .input('W', ConventionalItemTags.GOLD_INGOTS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern(" WW")
                .pattern(" W ")
                .pattern("S  ")
                .criterion(hasTag(ConventionalItemTags.GOLD_INGOTS), conditionsFromTag(ConventionalItemTags.GOLD_INGOTS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter, "golden_khopesh");
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemInitializer.DIAMOND_KHOPESH)
                .input('W', ConventionalItemTags.DIAMOND_GEMS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern(" WW")
                .pattern(" W ")
                .pattern("S  ")
                .criterion(hasTag(ConventionalItemTags.DIAMOND_GEMS), conditionsFromTag(ConventionalItemTags.DIAMOND_GEMS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter, "diamond_khopesh");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemInitializer.MACUAHUITL)
                .input('O', ConventionalItemTags.OBSIDIANS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .input('W', ItemTags.PLANKS)
                .pattern("OWO")
                .pattern("OWO")
                .pattern(" S ")
                .criterion(hasTag(ConventionalItemTags.OBSIDIANS), conditionsFromTag(ConventionalItemTags.OBSIDIANS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .criterion(hasTag(ItemTags.PLANKS), conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, "macuahuitl");
        SmithingTransformRecipeJsonBuilder.create(

                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), // template
                        Ingredient.ofItems(itemInitializer.DIAMOND_KHOPESH),
                        // base
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,// addition
                        itemInitializer.NETHERITE_KHOPESH                           // result

                )
                .criterion("has_diamond_khopesh", conditionsFromItem(itemInitializer.DIAMOND_KHOPESH))
                .criterion("has_netherite_ingot", conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, "netherite_khopesh_from_smithing");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemInitializer.IRON_OMOZO)
                .input('W', ConventionalItemTags.IRON_INGOTS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .input('I', ConventionalItemTags.NUGGETS)
                .pattern("IW ")
                .pattern(" W ")
                .pattern(" S ")
                .criterion(hasTag(ConventionalItemTags.IRON_INGOTS), conditionsFromTag(ConventionalItemTags.IRON_INGOTS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter, "iron_omozo");
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemInitializer.GOLDEN_OMOZO)
                .input('W', ConventionalItemTags.GOLD_INGOTS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .input('I', ConventionalItemTags.NUGGETS)
                .pattern("IW ")
                .pattern(" W ")
                .pattern(" S ")
                .criterion(hasTag(ConventionalItemTags.GOLD_INGOTS), conditionsFromTag(ConventionalItemTags.GOLD_INGOTS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter, "golden_omozo");
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemInitializer.DIAMOND_OMOZO)
                .input('W', ConventionalItemTags.DIAMOND_GEMS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .input('I', ConventionalItemTags.NUGGETS)
                .pattern("IW ")
                .pattern(" W ")
                .pattern(" S ")
                .criterion(hasTag(ConventionalItemTags.DIAMOND_GEMS), conditionsFromTag(ConventionalItemTags.DIAMOND_GEMS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter, "diamond_omozo");
        SmithingTransformRecipeJsonBuilder.create(

                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), // template
                        Ingredient.ofItems(itemInitializer.DIAMOND_OMOZO),
                        // base
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,// addition
                        itemInitializer.NETHERITE_OMOZO                           // result

                );


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemInitializer.IRON_KUBA)
                .input('W', ConventionalItemTags.IRON_INGOTS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("WWW")
                .pattern(" W ")
                .pattern(" S ")
                .criterion(hasTag(ConventionalItemTags.IRON_INGOTS), conditionsFromTag(ConventionalItemTags.IRON_INGOTS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter, "iron_kuba");
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemInitializer.GOLDEN_KUBA)
                .input('W', ConventionalItemTags.GOLD_INGOTS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("WWW")
                .pattern(" W ")
                .pattern(" S ")
                .criterion(hasTag(ConventionalItemTags.GOLD_INGOTS), conditionsFromTag(ConventionalItemTags.GOLD_INGOTS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter, "golden_kuba");
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemInitializer.DIAMOND_KUBA)
                .input('W', ConventionalItemTags.DIAMOND_GEMS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("WWW")
                .pattern(" W ")
                .pattern(" S ")
                .criterion(hasTag(ConventionalItemTags.DIAMOND_GEMS), conditionsFromTag(ConventionalItemTags.DIAMOND_GEMS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter, "diamond_kuba");
        SmithingTransformRecipeJsonBuilder.create(

                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), // template
                        Ingredient.ofItems(itemInitializer.DIAMOND_KUBA),
                        // base
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,// addition
                        itemInitializer.NETHERITE_KUBA                           // result

        );

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemInitializer.IRON_PANABAS)
                .input('W', ConventionalItemTags.IRON_INGOTS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern(" WW")
                .pattern(" W ")
                .pattern(" S ")
                .criterion(hasTag(ConventionalItemTags.IRON_INGOTS), conditionsFromTag(ConventionalItemTags.IRON_INGOTS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter, "iron_panabas_right");
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemInitializer.IRON_PANABAS)
                .input('W', ConventionalItemTags.IRON_INGOTS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("WW ")
                .pattern(" W ")
                .pattern(" S ")
                .criterion(hasTag(ConventionalItemTags.IRON_INGOTS), conditionsFromTag(ConventionalItemTags.IRON_INGOTS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter, "iron_panabas_left");
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemInitializer.GOLDEN_PANABAS)
                .input('W', ConventionalItemTags.GOLD_INGOTS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern(" WW")
                .pattern(" W ")
                .pattern(" S ")
                .criterion(hasTag(ConventionalItemTags.GOLD_INGOTS), conditionsFromTag(ConventionalItemTags.GOLD_INGOTS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter, "golden_panabas_right");
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemInitializer.GOLDEN_PANABAS)
                .input('W', ConventionalItemTags.GOLD_INGOTS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("WW ")
                .pattern(" W ")
                .pattern(" S ")
                .criterion(hasTag(ConventionalItemTags.GOLD_INGOTS), conditionsFromTag(ConventionalItemTags.GOLD_INGOTS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter, "golden_panabas_left");
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemInitializer.DIAMOND_PANABAS)
                .input('W', ConventionalItemTags.DIAMOND_GEMS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern(" WW")
                .pattern(" W ")
                .pattern(" S ")
                .criterion(hasTag(ConventionalItemTags.DIAMOND_GEMS), conditionsFromTag(ConventionalItemTags.DIAMOND_GEMS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter, "diamond_panabas_right");
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemInitializer.DIAMOND_PANABAS)
                .input('W', ConventionalItemTags.DIAMOND_GEMS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("WW ")
                .pattern(" W ")
                .pattern(" S ")
                .criterion(hasTag(ConventionalItemTags.DIAMOND_GEMS), conditionsFromTag(ConventionalItemTags.DIAMOND_GEMS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter, "diamond_panabas_left");
        SmithingTransformRecipeJsonBuilder.create(

                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), // template
                        Ingredient.ofItems(itemInitializer.DIAMOND_PANABAS),
                        // base
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,// addition
                        itemInitializer.NETHERITE_PANABAS                           // result

                );

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemInitializer.IRON_BOLO_KNIFE)
                .input('W', ConventionalItemTags.IRON_INGOTS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("  W")
                .pattern(" W ")
                .pattern(" S ")
                .criterion(hasTag(ConventionalItemTags.IRON_INGOTS), conditionsFromTag(ConventionalItemTags.IRON_INGOTS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter, "iron_bolo_knife");
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemInitializer.GOLDEN_BOLO_KNIFE)
                .input('W', ConventionalItemTags.GOLD_INGOTS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("  W")
                .pattern(" W ")
                .pattern(" S ")
                .criterion(hasTag(ConventionalItemTags.GOLD_INGOTS), conditionsFromTag(ConventionalItemTags.GOLD_INGOTS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter, "golden_bolo_knife");
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, itemInitializer.DIAMOND_BOLO_KNIFE)
                .input('W', ConventionalItemTags.DIAMOND_GEMS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("  W")
                .pattern(" W ")
                .pattern(" S ")
                .criterion(hasTag(ConventionalItemTags.DIAMOND_GEMS), conditionsFromTag(ConventionalItemTags.DIAMOND_GEMS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter, "diamond_bolo_knife");
        SmithingTransformRecipeJsonBuilder.create(

                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), // template
                        Ingredient.ofItems(itemInitializer.DIAMOND_BOLO_KNIFE),
                        // base
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.COMBAT,// addition
                        itemInitializer.NETHERITE_BOLO_KNIFE                           // result

                ).criterion("has_diamond_bolo_knife", conditionsFromItem(itemInitializer.DIAMOND_BOLO_KNIFE));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, itemInitializer.SMITHING_TEMPLATE_KHOPESH)
                .input('S', ConventionalItemTags.SANDSTONE_BLOCKS)
                .input('I', ConventionalItemTags.IRON_INGOTS)
                .input('W', ItemTags.SWORDS)
                .pattern("IWI")
                .pattern("ISI")
                .pattern("III")
                .criterion(hasTag(ConventionalItemTags.IRON_INGOTS), conditionsFromTag(ConventionalItemTags.IRON_INGOTS))
                .criterion(hasTag(ConventionalItemTags.SANDSTONE_BLOCKS), conditionsFromTag(ConventionalItemTags.SANDSTONE_BLOCKS))
                .criterion(hasTag(ItemTags.SWORDS), conditionsFromTag(ItemTags.SWORDS))
                .offerTo(exporter, "khopesh-smithing-template");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, itemInitializer.SMITHING_TEMPLATE_KHOPESH)
                        .input('T', itemInitializer.SMITHING_TEMPLATE_KHOPESH)
                        .input('I', ConventionalItemTags.IRON_INGOTS)
                        .input('S', ConventionalItemTags.SANDSTONE_BLOCKS);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, itemInitializer.SMITHING_TEMPLATE_BOLO)
                .input('V', ConventionalItemTags.CACTUS_CROPS)
                .input('I', ConventionalItemTags.IRON_INGOTS)
                .input('W', ItemTags.SWORDS)
                .pattern("IWI")
                .pattern("IVI")
                .pattern("III")
                .criterion(hasTag(ConventionalItemTags.IRON_INGOTS), conditionsFromTag(ConventionalItemTags.IRON_INGOTS))
                .criterion(hasTag(ConventionalItemTags.CACTUS_CROPS), conditionsFromTag(ConventionalItemTags.CACTUS_CROPS))
                .criterion(hasTag(ItemTags.SWORDS), conditionsFromTag(ItemTags.SWORDS))
                .offerTo(exporter, "bolo-knife-smithing-template");



    }


    private static String hasTag(TagKey<Item> tag){
        return "has_" + tag.id().toString();
    }
}
