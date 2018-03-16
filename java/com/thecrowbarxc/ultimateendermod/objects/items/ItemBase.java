package com.thecrowbarxc.ultimateendermod.objects.items;

import com.thecrowbarxc.ultimateendermod.Main;
import com.thecrowbarxc.ultimateendermod.init.ItemInit;
import com.thecrowbarxc.ultimateendermod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase (String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
