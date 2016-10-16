package com.edricchan.firstmod;


import com.edricchan.firstmod.init.ModBlocks;
import com.edricchan.firstmod.init.ModCrafting;
import com.edricchan.firstmod.init.ModFoods;
import com.edricchan.firstmod.init.ModItems;
import com.edricchan.firstmod.init.ModLetterColourBlocks;
import com.edricchan.firstmod.init.ModLetterBlocks;
import com.edricchan.firstmod.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name= Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class FirstMod {
	// Create a new instance
	@Instance
	public static FirstMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	// Creative Mode Tab
	public static final CreativeTabs MAIN_TAB = new FirstModTab();
	public static final CreativeTabs FOOD_TAB = new FoodTab();
	public static final CreativeTabs LETTER_BLOCKS_TAB = new LetterBlocksTab();
	public static final CreativeTabs LETTERS_TAB = new LettersTab();
	public static final CreativeTabs LETTER_COLOUR_BLOCK_TAB = new LetterColourBlocksTab();
	// Initialize
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("Pre Init");
		
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		ModLetterBlocks.init();
		ModLetterBlocks.register();
		
		ModFoods.init();
		ModFoods.register();
		
		ModLetterColourBlocks.init();
		ModLetterColourBlocks.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		System.out.println("Init");
		proxy.init();
		
		// Some achievements
		
		
		ModCrafting.register();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("Post Init");
	}
}
