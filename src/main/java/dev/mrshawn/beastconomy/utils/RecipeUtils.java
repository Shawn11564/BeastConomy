package dev.mrshawn.beastconomy.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;

import java.util.Map;

public class RecipeUtils {

	public static Map<ItemStack, Integer> getRecipeItems(Material material) {
		for (Recipe r : Bukkit.getRecipesFor(new ItemStack(material))) {
			if (r instanceof ShapedRecipe) {
				ShapedRecipe temp = (ShapedRecipe) r;
				temp.getIngredientMap();
			}
		}
	}

}
