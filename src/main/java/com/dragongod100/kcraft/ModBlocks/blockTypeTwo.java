package com.dragongod100.kcraft.ModBlocks;


import com.dragongod100.kcraft.ModItems.ModItems;
import com.dragongod100.kcraft.kcraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockTypeTwo extends Block
{

    protected blockTypeTwo(String unlocalizedName,
                           Material material,
                           float hard,
                           float resi,
                           float ligh,
                           int lightO,
                           int harvest)
    {
        super(material);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(kcraft.MODID + ":" + unlocalizedName);
        this.setCreativeTab(ModItems.tabMyMod);
        this.setHardness(hard);
        this.setResistance(resi);
        this.setLightLevel(ligh);
        this.setLightOpacity(lightO);
        this.setHarvestLevel("shovel", harvest);
        this.setStepSound(soundTypeSand);
    }
    
}