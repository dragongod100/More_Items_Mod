package com.dragongod100.kcraft;

import com.dragongod100.kcraft.ModBlocks.ModBlocks;
import com.dragongod100.kcraft.ModItems.ModItems;
import com.dragongod100.kcraft.ModRecipes.ModRecipes;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


public class CommonProxy 
{

    public void preInit(FMLPreInitializationEvent e) 
    {
    	ModBlocks.init();
    }

    public void init(FMLInitializationEvent e) 
    {
        ModRecipes.init();
        ModItems.preInit();
    }

    public void postInit(FMLPostInitializationEvent e) 
    {

    }
    

}