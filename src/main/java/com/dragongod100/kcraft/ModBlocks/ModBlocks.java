package com.dragongod100.kcraft.ModBlocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

public final class ModBlocks 
{
    public static BasicBlock blockSilver;
    public static blockTypeTwo I2;
    public static oreMain oreSilver;
    public static BasicBlock B4;
    public static BasicBlock B5;
    public static BasicBlock B6;
    public static BasicBlock B7;
    public static BasicBlock B8;
    public static BasicBlock B9;
    public static BasicBlock B10;
    
	public static final void init()
	{
        GameRegistry.registerBlock
            (blockSilver = new BasicBlock("blockSilver",
                    Material.iron), "BlockSilver");

        OreDictionary.registerOre("blockSilver", blockSilver);



        GameRegistry.registerBlock(oreSilver = new oreMain(
            "oreSilver",
            Material.iron,
            2.4f, 2),
            "oreSilver");
    }

}
