package com.dragongod100.kcraft.ModItems;

import com.dragongod100.kcraft.kcraft;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;


public class itemBase extends Item
{
	protected itemBase(Item name, String unlocal)
	{
		name = new Item();
		name.setUnlocalizedName(unlocal);
		name.setCreativeTab(ModItems.tabMyMod);
		name.setTextureName(kcraft.MODID + ":" + unlocal);
		GameRegistry.registerItem(name, unlocal);
	}
}