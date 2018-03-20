package com.thecrowbarxc.ultimateendermod.util.handlers;

import com.thecrowbarxc.ultimateendermod.entity.EntityEnderGuard;
import com.thecrowbarxc.ultimateendermod.entity.render.RenderEnderGuard;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderGuard.class, new IRenderFactory<EntityEnderGuard>()
		{
			@Override
			public Render<? super EntityEnderGuard> createRenderFor(RenderManager manager)
			{
				return new RenderEnderGuard(manager);
			}
		});
	}
}
