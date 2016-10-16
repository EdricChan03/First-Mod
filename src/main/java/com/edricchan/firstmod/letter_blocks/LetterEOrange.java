package com.edricchan.firstmod.letter_blocks;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LetterEOrange extends Block {

	public LetterEOrange() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.FirstLetterBlocks.LETTER_E_ORANGE.getUnlocalizedName());
		setRegistryName(Reference.FirstLetterBlocks.LETTER_E_ORANGE.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(FirstMod.LETTER_BLOCKS_TAB);
		setHarvestLevel("pickaxe", 2);
	}

}
