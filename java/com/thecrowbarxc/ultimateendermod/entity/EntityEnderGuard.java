package com.thecrowbarxc.ultimateendermod.entity;

import java.util.Random;

import com.thecrowbarxc.ultimateendermod.util.handlers.SoundsHandler;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityEnderGuard extends EntityEnderman
{

	public EntityEnderGuard(World worldIn) 
	{
		super(worldIn);
	}
	
	@Override
	public void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.35D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(70.0D);
	}
	
	@Override
	protected SoundEvent getAmbientSound()
	{
		Random rand = new Random();
	    int randomNum = rand.nextInt((3 - 1) + 1) + 1;
		return SoundsHandler.enderGuardAmbient[randomNum];
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source)
	{
		Random rand = new Random();
	    int randomNum = rand.nextInt((2 - 1) + 1) + 1;
		return SoundsHandler.enderGuardHurt[randomNum];
	}
	
	@Override
	protected SoundEvent getDeathSound()
	{
		return SoundsHandler.ENTITY_ENDER_GUARD_DEATH;
	}
	
	protected SoundEvent getStareSound()
	{
		return SoundsHandler.ENTITY_ENDER_GUARD_STARE;
	}
	
	
}
