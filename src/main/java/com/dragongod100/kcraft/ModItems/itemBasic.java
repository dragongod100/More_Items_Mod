package com.dragongod100.kcraft.ModItems;

import com.dragongod100.kcraft.kcraft;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;


public class itemBasic extends Item
{
	protected itemBasic(Item name, String unlocal)
	{
		name = new Item();
		name.setUnlocalizedName(unlocal);
		name.setCreativeTab(ModItems.tabMyMod);
		GameRegistry.registerItem(name, unlocal, name.getUnlocalizedName());
		name.setTextureName(kcraft.MODID +":" + unlocal);
	}
}
