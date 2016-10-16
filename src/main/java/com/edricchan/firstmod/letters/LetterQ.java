package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class LetterQ extends Item {

	public LetterQ() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_Q.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_Q.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
