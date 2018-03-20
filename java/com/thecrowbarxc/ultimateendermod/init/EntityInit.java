package com.thecrowbarxc.ultimateendermod.init;

import com.thecrowbarxc.ultimateendermod.Main;
import com.thecrowbarxc.ultimateendermod.entity.EntityEnderGuard;
import com.thecrowbarxc.ultimateendermod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	public static void registerEntities()
	{
		registerEntity("ender_guard", EntityEnderGuard.class, Reference.ENTITY_ENDER_GUARD, 50, 3945119, 9253535);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
