package com.thecrowbarxc.ultimateendermod.init;

import java.util.ArrayList;
import java.util.List;

import com.thecrowbarxc.ultimateendermod.objects.armour.ArmourBase;
import com.thecrowbarxc.ultimateendermod.objects.items.ItemBase;
import com.thecrowbarxc.ultimateendermod.objects.tools.ToolAxe;
import com.thecrowbarxc.ultimateendermod.objects.tools.ToolHoe;
import com.thecrowbarxc.ultimateendermod.objects.tools.ToolPickaxe;
import com.thecrowbarxc.ultimateendermod.objects.tools.ToolShovel;
import com.thecrowbarxc.ultimateendermod.objects.tools.ToolSword;
import com.thecrowbarxc.ultimateendermod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();

	//Materials
	public static final ToolMaterial TOOL_ENDERIUM = EnumHelper.addToolMaterial("tool_enderium", 4, 2000, 10.0F, 5.0F, 15);
	public static final ArmorMaterial ARMOUR_ENDERIUM = EnumHelper.addArmorMaterial("armour_enderium", Reference.MOD_ID + ":enderium", 45, new int[]{4, 8, 10, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
	public static final ToolMaterial TOOL_MUTATED_ENDERIUM = EnumHelper.addToolMaterial("tool_mutated_enderium", 6, 3000, 20.0F, 10.0F, 30);
	public static final ArmorMaterial ARMOUR_MUTATED_ENDERIUM = EnumHelper.addArmorMaterial("armour_mutated_enderium", Reference.MOD_ID + ":mutated_enderium", 60, new int[]{5, 12, 15, 6}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8.0F);
	public static final ToolMaterial TOOL_CORRUPTED_ENDERIUM = EnumHelper.addToolMaterial("tool_corrupted_enderium", 8, 5000, 35.0F, 20.0F, 45);
	public static final ArmorMaterial ARMOUR_CORRUPTED_ENDERIUM = EnumHelper.addArmorMaterial("armour_corrupted_enderium", Reference.MOD_ID + ":corrupted_enderium", 60, new int[]{7, 20, 25, 8}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 16.0F);
	public static final ToolMaterial TOOL_ULTIMATE_ENDERIUM = EnumHelper.addToolMaterial("tool_ultimate_enderium", 10, 7500, 60.0F, 35.0F, 60);
	public static final ArmorMaterial ARMOUR_ULTIMATE_ENDERIUM = EnumHelper.addArmorMaterial("armour_ultimate_enderium", Reference.MOD_ID + ":ultimate_enderium", 60, new int[]{12, 30, 40, 15}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 32.0F);
	
	//Items
	public static final Item INGOT_ENDERIUM = new ItemBase("ingot_enderium");
	public static final Item INGOT_MUTATED_ENDERIUM = new ItemBase("ingot_mutated_enderium");
	public static final Item INGOT_CORRUPTED_ENDERIUM = new ItemBase("ingot_corrupted_enderium");
	public static final Item INGOT_ULTIMATE_ENDERIUM = new ItemBase("ingot_ultimate_enderium");
	public static final Item PIECE_MUTATED = new ItemBase("piece_mutated");
	public static final Item SHARD_MUTATED = new ItemBase("shard_mutated");
	public static final Item CHUNK_MUTATED = new ItemBase("chunk_mutated");
	public static final Item FLINT_ENDERIUM = new ItemBase("flint_enderium");
	public static final Item IGNITER_MUTATED = new ItemBase("igniter_mutated");
	
	//Tools
	public static final Item AXE_ENDERIUM = new ToolAxe("axe_enderium", TOOL_ENDERIUM);
	public static final Item PICKAXE_ENDERIUM = new ToolPickaxe("pickaxe_enderium", TOOL_ENDERIUM);
	public static final Item HOE_ENDERIUM = new ToolHoe("hoe_enderium", TOOL_ENDERIUM);
	public static final Item SHOVEL_ENDERIUM = new ToolShovel("shovel_enderium", TOOL_ENDERIUM);
	public static final Item SWORD_ENDERIUM = new ToolSword("sword_enderium", TOOL_ENDERIUM);
	public static final Item AXE_MUTATED_ENDERIUM = new ToolAxe("axe_mutated_enderium", TOOL_MUTATED_ENDERIUM);
	public static final Item PICKAXE_MUTATED_ENDERIUM = new ToolPickaxe("pickaxe_mutated_enderium", TOOL_MUTATED_ENDERIUM);
	public static final Item SWORD_MUTATED_ENDERIUM = new ToolSword("sword_mutated_enderium", TOOL_MUTATED_ENDERIUM);
	public static final Item SHOVEL_MUTATED_ENDERIUM = new ToolShovel("shovel_mutated_enderium", TOOL_MUTATED_ENDERIUM);
	public static final Item HOE_MUTATED_ENDERIUM = new ToolHoe("hoe_mutated_enderium", TOOL_MUTATED_ENDERIUM);
	public static final Item PICKAXE_CORRUPTED_ENDERIUM = new ToolPickaxe("pickaxe_corrupted_enderium", TOOL_CORRUPTED_ENDERIUM);
	public static final Item SWORD_CORRUPTED_ENDERIUM = new ToolSword("sword_corrupted_enderium", TOOL_CORRUPTED_ENDERIUM);
	public static final Item AXE_CORRUPTED_ENDERIUM = new ToolAxe("axe_corrupted_enderium", TOOL_CORRUPTED_ENDERIUM);
	public static final Item SHOVEL_CORRUPTED_ENDERIUM = new ToolShovel("shovel_corrupted_enderium", TOOL_CORRUPTED_ENDERIUM);
	public static final Item HOE_CORRUPTED_ENDERIUM = new ToolHoe("hoe_corrupted_enderium", TOOL_CORRUPTED_ENDERIUM);
	public static final Item PICKAXE_ULTIMATE_ENDERIUM = new ToolPickaxe("pickaxe_ultimate_enderium", TOOL_ULTIMATE_ENDERIUM);
	public static final Item SWORD_ULTIMATE_ENDERIUM = new ToolSword("sword_ultimate_enderium", TOOL_ULTIMATE_ENDERIUM);
	public static final Item AXE_ULTIMATE_ENDERIUM = new ToolAxe("axe_ultimate_enderium", TOOL_ULTIMATE_ENDERIUM);
	public static final Item SHOVEL_ULTIMATE_ENDERIUM = new ToolShovel("shovel_ultimate_enderium", TOOL_ULTIMATE_ENDERIUM);
	public static final Item HOE_ULTIMATE_ENDERIUM = new ToolHoe("hoe_ultimate_enderium", TOOL_ULTIMATE_ENDERIUM);
	
	//Armor
	public static final Item HELMET_ENDERIUM = new ArmourBase("helmet_enderium", ARMOUR_ENDERIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_ENDERIUM = new ArmourBase("chestplate_enderium", ARMOUR_ENDERIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_ENDERIUM = new ArmourBase("leggings_enderium", ARMOUR_ENDERIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_ENDERIUM = new ArmourBase("boots_enderium", ARMOUR_ENDERIUM, 1, EntityEquipmentSlot.FEET);
	public static final Item HELMET_MUTATED_ENDERIUM = new ArmourBase("helmet_mutated_enderium", ARMOUR_MUTATED_ENDERIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_MUTATED_ENDERIUM = new ArmourBase("chestplate_mutated_enderium", ARMOUR_MUTATED_ENDERIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_MUTATED_ENDERIUM = new ArmourBase("leggings_mutated_enderium", ARMOUR_MUTATED_ENDERIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_MUTATED_ENDERIUM = new ArmourBase("boots_mutated_enderium", ARMOUR_MUTATED_ENDERIUM, 1, EntityEquipmentSlot.FEET);
	public static final Item HELMET_CORRUPTED_ENDERIUM = new ArmourBase("helmet_corrupted_enderium", ARMOUR_CORRUPTED_ENDERIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_CORRUPTED_ENDERIUM = new ArmourBase("chestplate_corrupted_enderium", ARMOUR_CORRUPTED_ENDERIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_CORRUPTED_ENDERIUM = new ArmourBase("leggings_corrupted_enderium", ARMOUR_CORRUPTED_ENDERIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_CORRUPTED_ENDERIUM = new ArmourBase("boots_corrupted_enderium", ARMOUR_CORRUPTED_ENDERIUM, 1, EntityEquipmentSlot.FEET);
	public static final Item HELMET_ULTIMATE_ENDERIUM = new ArmourBase("helmet_ultimate_enderium", ARMOUR_ULTIMATE_ENDERIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_ULTIMATE_ENDERIUM = new ArmourBase("chestplate_ultimate_enderium", ARMOUR_ULTIMATE_ENDERIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_ULTIMATE_ENDERIUM = new ArmourBase("leggings_ultimate_enderium", ARMOUR_ULTIMATE_ENDERIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_ULTIMATE_ENDERIUM = new ArmourBase("boots_ultimate_enderium", ARMOUR_ULTIMATE_ENDERIUM, 1, EntityEquipmentSlot.FEET);
}
