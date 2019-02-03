package com.dragongod100.kcraft.ModItems;

import com.dragongod100.kcraft.kcraft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class ModItems 
{
	public static Item hiltWooden;
	public static Item bladeWooden;
	public static Item I3;
	public static Item I4;
	public static Item I5;
	public static Item I6;
	public static Item I7;
	public static Item I8;
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
		I3 = new itemBase(I3,"I3");
		hiltWooden = new itemBase(hiltWooden,"HiltWooden");
		bladeWooden = new itemBase(bladeWooden,"bladeWooden");
		nuggetSilver = new itemBase(nuggetSilver,"nuggetSilver");
		ingotSilver = new itemBase(ingotSilver,"ingotSilver");

	}
}
