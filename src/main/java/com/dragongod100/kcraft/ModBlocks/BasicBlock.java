package com.dragongod100.kcraft.ModBlocks;


import com.dragongod100.kcraft.ModItems.ModItems;
import com.dragongod100.kcraft.kcraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BasicBlock extends Block 
{

    protected BasicBlock(String unlocalizedName, Material material)
    {
        super(material);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(kcraft.MODID + ":" + unlocalizedName);
        this.setCreativeTab(ModItems.tabMyMod);
        this.setHardness(2.0F);
        this.setResistance(6.0F);
        this.setLightLevel(0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setStepSound(soundTypeMetal);
    }

}