package com.thecrowbarxc.ultimateendermod.util.handlers;

import com.thecrowbarxc.ultimateendermod.init.BlockInit;
import com.thecrowbarxc.ultimateendermod.init.EntityInit;
import com.thecrowbarxc.ultimateendermod.init.ItemInit;
import com.thecrowbarxc.ultimateendermod.util.interfaces.IHasModel;
import com.thecrowbarxc.ultimateendermod.world.gen.WorldGenCustomOres;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber	
public class RegistryHandlers 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) 
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) 
	{
		for(Item item : ItemInit.ITEMS) 
		{
			if(item instanceof IHasModel) 
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS)
		
			if(block instanceof IHasModel) 
			{
				((IHasModel)block).registerModels();
			}
		}
	
	public static void preInitRegistries()
    {
        EntityInit.registerEntities();
        RenderHandler.registerEntityRenders();
    }
    
    public static void InitRegistries()
    {
        SoundsHandler.registerSounds();
    }
    
    public static void postInitRegistries()
    {
        
    }
    
    public static void otherRegistries()
    {
    	GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
    }
}
