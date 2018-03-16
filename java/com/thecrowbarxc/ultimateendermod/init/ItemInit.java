package com.thecrowbarxc.ultimateendermod.init;

import java.util.ArrayList;
import java.util.List;

import com.thecrowbarxc.ultimateendermod.objects.items.ItemBase;
import com.thecrowbarxc.ultimateendermod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();

	//Items
	public static final Item INGOT_ENDERIUM = new ItemBase("ingot_enderium");
	public static final Item INGOT_MUTATED_ENDERIUM = new ItemBase("ingot_mutated_enderium");
	public static final Item INGOT_CORRUPTED_ENDERIUM = new ItemBase("ingot_corrupted_enderium");
	public static final Item INGOT_ULTIMATE_ENDERIUM = new ItemBase("ingot_ultimate_enderium");
}
