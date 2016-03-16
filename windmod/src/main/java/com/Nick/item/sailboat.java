package com.Nick.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
public class sailboat {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	public static Item sailboat;
	public static void initializeItem(){
		sailboat = new Item().setUnlocalizedName("sailboat").setCreativeTab(CreativeTabs.tabTransport);
	}
	public static void registerItem(){
		GameRegistry.registerItem(sailboat, sailboat.getUnlocalizedName());
	}
}
