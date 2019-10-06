package dev.mrshawn.beastconomy.engine.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.*;

import java.util.ArrayList;
import java.util.List;

public class BItem {

	private Material material;
	private double cost;
	public boolean hasRecipe;
	private List<ItemStack> recipeItems;
	private int recipeResultAmount;

	public BItem(Material material) {
		this.material = material;
		hasRecipe = Bukkit.getRecipesFor(new ItemStack(material)).size() > 0;
		if (hasRecipe) {
			initRecipes();
		}
	}

	private void initRecipes() {
		recipeItems = new ArrayList<>();
		for (Recipe r : Bukkit.getRecipesFor(new ItemStack(material))) {
			recipeResultAmount = r.getResult().getAmount();
		}
	}
}
