package com.thecrowbarxc.ultimateendermod.init;

import java.util.ArrayList;
import java.util.List;

import com.thecrowbarxc.ultimateendermod.objects.armour.ArmourBase;
import com.thecrowbarxc.ultimateendermod.objects.items.ItemBase;
import com.thecrowbarxc.ultimateendermod.objects.tools.ToolHoe;
import com.thecrowbarxc.ultimateendermod.objects.tools.ToolPickaxe;
import com.thecrowbarxc.ultimateendermod.objects.tools.ToolShovel;
import com.thecrowbarxc.ultimateendermod.objects.tools.ToolSword;
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
	
	//Tools
	public static final Item AXE_ENDERIUM = new ToolAxe("axe_enderium");
	public static final Item PICKAXE_ENDERIUM = new ToolPickaxe("pickaxe_enderium");
	public static final Item HOE_ENDERIUM = new ToolHoe("hoe_enderium");
	public static final Item SHOVEL_ENDERIUM = new ToolShovel("shovel_enderium");
	public static final Item SWORD_ENDERIUM = new ToolSword("sword_enderium");
	
	//Armor
	public static final Item HELMET_ENDERIUM = new ArmourBase("helmet_enderium");
	public static final Item CHESTPLATE_ENDERIUM = new ArmourBase("chestplate_enderium");
	public static final Item LEGGINGS_ENDERIUM = new ArmourBase("leggings_enderium");
	public static final Item BOOTS_ENDERIUM = new ArmourBase("boots_enderium");
}
