package com.thecrowbarxc.ultimateendermod.init;

import java.util.ArrayList;
import java.util.List;

import com.thecrowbarxc.ultimateendermod.objects.blocks.BlockBase;
import com.thecrowbarxc.ultimateendermod.objects.blocks.BlockOres;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_ENDERIUM = new BlockBase("block_enderium", Material.IRON);
	public static final Block BLOCK_MUTATED_ENDERIUM = new BlockBase("block_mutated_enderium", Material.IRON);
	public static final Block BLOCK_CORRUPTED_ENDERIUM = new BlockBase("block_corrupted_enderium", Material.IRON);
	public static final Block BLOCK_ULTIMATE_ENDERIUM = new BlockBase("block_ultimate_enderium", Material.IRON);
	public static final Block BLOCK_MUTATED_ENDSTONE = new BlockBase("block_mutated_endstone", Material.CLAY);
	public static final Block BLOCK_CORRUPTED_ENDSTONE = new BlockBase("block_corrupted_endstone", Material.CLAY);
	public static final Block BLOCK_ULTIMATE_ENDSTONE = new BlockBase("block_ultimate_endstone", Material.CLAY);
	
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
}
