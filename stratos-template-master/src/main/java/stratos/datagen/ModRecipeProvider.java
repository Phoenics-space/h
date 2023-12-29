package stratos.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import stratos.Items.ModItems;
import stratos.block.ModBlocks;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ModItems.RUBY,
            ModBlocks.RUBY_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 100, "ruby");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS,
                ModBlocks.RUBY_BLOCK);

        createTrapdoorRecipe(ModBlocks.AIR_MAHOE_PLANKS, Ingredient.ofItems(ModBlocks.AIR_MAHOE_PLANKS));

        createFenceRecipe(ModBlocks.AIR_MAHOE_PLANKS,Ingredient.ofItems(ModBlocks.AIR_MAHOE_PLANKS));

        createFenceGateRecipe(ModBlocks.AIR_MAHOE_PLANKS,Ingredient.ofItems(ModBlocks.AIR_MAHOE_PLANKS));

        createDoorRecipe(ModBlocks.AIR_MAHOE_PLANKS, Ingredient.ofItems(ModBlocks.AIR_MAHOE_PLANKS))


        ;
    }
}

