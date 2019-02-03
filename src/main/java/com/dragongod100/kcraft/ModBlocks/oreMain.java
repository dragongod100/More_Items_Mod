package com.dragongod100.kcraft.ModBlocks;

import com.dragongod100.kcraft.kcraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class oreMain extends Block
{
	
    protected oreMain(String unlocalizedName,
                      Material mat,
                      float hardness,
                      int lvl)
    {
        super(mat);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(kcraft.MODID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setStepSound(soundTypeStone);
        this.setHardness(hardness);
        this.setResistance(20.0f);
        this.setHarvestLevel("pickaxe", lvl);
	}

}