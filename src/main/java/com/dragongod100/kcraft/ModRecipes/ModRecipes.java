package com.dragongod100.kcraft.ModRecipes;

import com.dragongod100.kcraft.ModBlocks.ModBlocks;
import com.dragongod100.kcraft.ModItems.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;




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
		/*GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockSilver, 1),
				"XXX",
				"XXX",
				"XXX",
				'X', ModItems.ingotSilver);*/
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSilver),
			"H H",
			"IVI",
			"HPH",
			'H', Items.diamond,
			'I', Blocks.dirt,
			'V', Items.bucket,
			'P', Blocks.activator_rail);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.bindingWooden, 1),
			"s s", " s ", "s s", 's', Items.stick);

		GameRegistry.addShapedRecipe(new ItemStack(ModItems.bladeWooden, 1),
			" X ", " X ", " X ", 'X', Items.stick);
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
