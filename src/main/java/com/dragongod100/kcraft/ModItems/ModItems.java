package com.dragongod100.kcraft.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class ModItems 
{
	public static Item hiltWooden;
	public static Item bladeWooden;
	public static Item bindingWooden;
	public static Item nuggetSilver;
	public static Item ingotSilver;

	public static final CreativeTabs tabMyMod = new CreativeTabs("K-Craft")
	{
		@Override public Item getTabIconItem()
		{
			return(hiltWooden);
		}
	};
	public static final void preInit()
	{
		bindingWooden = new itemBase(bindingWooden,"bindingWooden");
		hiltWooden = 	new itemBase(hiltWooden,"hiltWooden");
		bladeWooden = 	new itemBase(bladeWooden,"bladeWooden");
		nuggetSilver = 	new itemBase(nuggetSilver,"nuggetSilver");
		ingotSilver = 	new itemBase(ingotSilver,"ingotSilver");

	}
}
