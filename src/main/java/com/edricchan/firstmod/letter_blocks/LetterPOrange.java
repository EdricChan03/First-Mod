package com.edricchan.firstmod.letter_blocks;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LetterPOrange extends Block {

	public LetterPOrange() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.FirstLetterBlocks.LETTER_P_ORANGE.getUnlocalizedName());
		setRegistryName(Reference.FirstLetterBlocks.LETTER_P_ORANGE.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(FirstMod.LETTER_BLOCKS_TAB);
		setHarvestLevel("pickaxe", 2);
	}

}
