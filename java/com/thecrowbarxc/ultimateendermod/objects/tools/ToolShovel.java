package com.thecrowbarxc.ultimateendermod.objects.tools;

import com.thecrowbarxc.ultimateendermod.Main;
import com.thecrowbarxc.ultimateendermod.init.ItemInit;
import com.thecrowbarxc.ultimateendermod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ToolShovel extends ItemSpade implements IHasModel
{
	public ToolShovel(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ultimateendertab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}