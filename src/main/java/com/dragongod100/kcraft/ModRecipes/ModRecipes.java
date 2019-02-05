package com.dragongod100.kcraft.ModRecipes;

import com.dragongod100.kcraft.ModBlocks.ModBlocks;
import com.dragongod100.kcraft.ModItems.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

import static net.minecraft.init.Blocks.*;
import static net.minecraft.init.Items.*;



public class ModRecipes
{
	public static void init()
	{
		////////////////////////////////////////////////////////////////////////
		//																	  //
		// Crafting recipes go below here									  //
		//																	  //
		////////////////////////////////////////////////////////////////////////

		//GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BlockSilver), new Object[] {ModItems.IngotSilver});
		//GameRegistry.addRecipe(new ItemStack(BlockSilver), new Object[] {"###", "###", "###", ModItems.IngotSilver});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockSilver),
			"XXX",
			"XXX",
			"XXX",

			'X', ModItems.ingotSilver);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.bindingWooden, 1),
			"s s",
			" s ",
			"s s",

			's', stick,
			'x', dirt);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.bladeWooden),
			" X ",
			" X ",
			" X ",

			'X', planks);
		////////////////////////////////////////////////////////////////////////
		//																	  //
		// Furnace recipes go below here									  //
		//																	  //
		////////////////////////////////////////////////////////////////////////
		//GameRegistry.addSmelting(input,
		//	new ItemStack(return), float exp);

	/*	GameRegistry.addSmelting(ModBlocks.oreSilver,
			new ItemStack(ModItems.ingotSilver), 1.0F);*/


	}
}
