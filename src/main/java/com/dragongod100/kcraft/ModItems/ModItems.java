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
		bindingWooden = new itemBasic(bindingWooden,"bindingWooden");
		hiltWooden = 	new itemBasic(hiltWooden,"hiltWooden");
		bladeWooden = 	new itemBasic(bladeWooden,"bladeWooden");
		nuggetSilver = 	new itemBasic(nuggetSilver,"nuggetSilver");
		ingotSilver = 	new itemBasic(ingotSilver,"ingotSilver");

	}
}
