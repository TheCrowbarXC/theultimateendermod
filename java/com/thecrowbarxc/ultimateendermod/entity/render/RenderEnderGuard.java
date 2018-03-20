package com.thecrowbarxc.ultimateendermod.entity.render;

import com.thecrowbarxc.ultimateendermod.entity.EntityEnderGuard;
import com.thecrowbarxc.ultimateendermod.entity.model.ModelEnderGuard;
import com.thecrowbarxc.ultimateendermod.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEnderGuard extends RenderLiving<EntityEnderGuard>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/ender_guard.png");

	public RenderEnderGuard(RenderManager manager) 
	{
		super(manager, new ModelEnderGuard(), 2.0F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityEnderGuard entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityEnderGuard entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}
