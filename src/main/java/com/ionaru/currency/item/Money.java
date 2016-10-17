package com.ionaru.currency.item;

import java.util.List;
import java.util.Random;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

import com.ionaru.currency.common.Currency;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Money extends Item {

	boolean hasFlipped = false;

	public Money() {

	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("Currency" + ":"
				+ this.getUnlocalizedName().substring(5));
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack,
			EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		if (par1ItemStack.getItem() == Currency.Penny) {
			par3List.add("0.01 Credits");
		} else if (par1ItemStack.getItem() == Currency.DoublePenny) {
			par3List.add("0.02 Credits");
		} else if (par1ItemStack.getItem() == Currency.Nickel) {
			par3List.add("0.05 Credits");
		} else if (par1ItemStack.getItem() == Currency.Dime) {
			par3List.add("0.10 Credits");
		} else if (par1ItemStack.getItem() == Currency.Quarter) {
			par3List.add("0.25 Credits");
		} else if (par1ItemStack.getItem() == Currency.HalfCredit) {
			par3List.add("0.50 Credits");
		} else if (par1ItemStack.getItem() == Currency.Credit) {
			par3List.add("1 Credit");
		} else if (par1ItemStack.getItem() == Currency.DoubleCredit) {
			par3List.add("2 Credits");
		} else if (par1ItemStack.getItem() == Currency.CreditBill5) {
			par3List.add("5 Credits");
		} else if (par1ItemStack.getItem() == Currency.CreditBill10) {
			par3List.add("10 Credits");
		} else if (par1ItemStack.getItem() == Currency.CreditBill25) {
			par3List.add("25 Credits");
		} else if (par1ItemStack.getItem() == Currency.CreditBill50) {
			par3List.add("50 Credits");
		} else if (par1ItemStack.getItem() == Currency.CreditBill100) {
			par3List.add("100 Credits");
		} else if (par1ItemStack.getItem() == Currency.CreditBill200) {
			par3List.add("200 Credits");
		} else if (par1ItemStack.getItem() == Currency.CreditBill500) {
			par3List.add("500 Credits");
		} else if (par1ItemStack.getItem() == Currency.IronCard) {
			par3List.add("1.000 Credits");
			par3List.add("(One Thousand)");
		} else if (par1ItemStack.getItem() == Currency.SteelCard) {
			par3List.add("5.000 Credits");
			par3List.add("(5 Thousand)");
		} else if (par1ItemStack.getItem() == Currency.BronzeCard) {
			par3List.add("10.000 Credits");
			par3List.add("(10 Thousand)");
		} else if (par1ItemStack.getItem() == Currency.SilverCard) {
			par3List.add("50.000 Credits");
			par3List.add("(50 Thousand)");
		} else if (par1ItemStack.getItem() == Currency.GoldCard) {
			par3List.add("100.000 Credits");
			par3List.add("(100 Thousand)");
		} else if (par1ItemStack.getItem() == Currency.PlatinumCard) {
			par3List.add("500.000 Credits");
			par3List.add("(500 Thousand)");
		} else if (par1ItemStack.getItem() == Currency.DiamondCard) {
			par3List.add("1.000.000 Credits");
			par3List.add("(One Million)");
		} else if (par1ItemStack.getItem() == Currency.OsmiumCard) {
			par3List.add("5.000.000 Credits");
			par3List.add("(5 Million)");
		} else if (par1ItemStack.getItem() == Currency.TungstenCard) {
			par3List.add("10.000.000 Credits");
			par3List.add("(10 Million)");
		} else if (par1ItemStack.getItem() == Currency.MithrilCard) {
			par3List.add("50.000.000 Credits");
			par3List.add("(50 Million)");
		} else if (par1ItemStack.getItem() == Currency.AdamantiumCard) {
			par3List.add("100.000.000 Credits");
			par3List.add("(100 Million)");
		} else if (par1ItemStack.getItem() == Currency.TartariteCard) {
			par3List.add("500.000.000 Credits");
			par3List.add("(500 Million)");
		} else if (par1ItemStack.getItem() == Currency.IridiumCard) {
			par3List.add("1.000.000.000 Credits");
			par3List.add("(One Billion)");
		}
	}
}
