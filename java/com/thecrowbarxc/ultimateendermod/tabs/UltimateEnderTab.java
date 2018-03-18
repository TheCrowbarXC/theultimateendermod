package com.thecrowbarxc.ultimateendermod.tabs;

import com.thecrowbarxc.ultimateendermod.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class UltimateEnderTab extends CreativeTabs
{
	public UltimateEnderTab(String label) { super("ultimateendertab"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.INGOT_ULTIMATE_ENDERIUM);}
}
