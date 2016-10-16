package com.edricchan.firstmod.letter_blocks;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LetterFOrange extends Block {

	public LetterFOrange() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.FirstLetterBlocks.LETTER_F_ORANGE.getUnlocalizedName());
		setRegistryName(Reference.FirstLetterBlocks.LETTER_F_ORANGE.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(FirstMod.LETTER_BLOCKS_TAB);
		setHarvestLevel("pickaxe", 2);
	}

}
