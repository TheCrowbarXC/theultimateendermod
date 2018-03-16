package com.thecrowbarxc.ultimateendermod.init;

import java.util.ArrayList;
import java.util.List;

import com.thecrowbarxc.ultimateendermod.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_ENDERIUM = new BlockBase("block_enderium", Material.ROCK);
}
