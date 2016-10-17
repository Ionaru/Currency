package com.ionaru.currency.common;

import com.ionaru.currency.item.Money;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemRegistrator {
	
	public static void register(Item item, String UnlocalizedName, String InGameName) {
		//In load
		GameRegistry.registerItem(item, UnlocalizedName);
		LanguageRegistry.addName(new ItemStack(item), InGameName);
		item.setCreativeTab(Currency.TabCurrency);
		System.out.println( "[" + Currency.modid + "] [INFO] " + InGameName + " loaded.");
	}

}
