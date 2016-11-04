package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterQ extends Item {

	public ItemLetterQ() {
		setUnlocalizedName(Reference.FirstLetters.ITEM_LETTER_Q.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.ITEM_LETTER_Q.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}