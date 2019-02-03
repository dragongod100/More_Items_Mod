package com.dragongod100.kcraft;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = kcraft.MODID, name = kcraft.MODNAME, version = kcraft.VERSION)
public class kcraft
{
	
/* *******************************************************************
*/    public static final String MODID   = "moreItems";				/*
*/    public static final String MODNAME = "More Items Mod";		/*
*/    public static final String VERSION = "1.7.10 3.1A";   		/*
********************************************************************/

////////////////////////////////////////////////////////////////////////////////

@SidedProxy(clientSide="com.dragongod100.kcraft.proxies.ClientProxy",
	serverSide="com.dragongod100.kcraft.proxies.ServerProxy")
    public static CommonProxy proxy;
    
////////////////////////////////////////////////////////////////////////////////

    @Instance
    public static kcraft instance = new kcraft();

////////////////////////////////////////////////////////////////////////////////
        @EventHandler
        public void preInit(FMLPreInitializationEvent myMod)
        {
        	System.out.println("Called method: [preInit]");
        	proxy.preInit(myMod);
                    
        }
        
////////////////////////////////////////////////////////////////////////////////
        @EventHandler
        public void init(FMLInitializationEvent myMod)
        {
        	System.out.println("Called method: [init]");
        	proxy.init(myMod);
        	
        }
        
////////////////////////////////////////////////////////////////////////////////
        @EventHandler
        public void postInit(FMLPostInitializationEvent myMod)
        {
        	System.out.println("Called method: [postInit]");
        	proxy.postInit(myMod);
                    
        }

////////////////////////////////////////////////////////////////////////////////

}