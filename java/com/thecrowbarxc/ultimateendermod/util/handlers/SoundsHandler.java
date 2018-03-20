package com.thecrowbarxc.ultimateendermod.util.handlers;

import com.thecrowbarxc.ultimateendermod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler 
{
	public static SoundEvent ENTITY_ENDER_GUARD_AMBIENT, ENTITY_ENDER_GUARD_HURT1, ENTITY_ENDER_GUARD_HURT2, ENTITY_ENDER_GUARD_HURT3, ENTITY_ENDER_GUARD_DEATH, ENTITY_ENDER_GUARD_STARE;
	
	public static final SoundEvent[] enderGuardHurt = new SoundEvent[3];
	
	public static final SoundEvent[] enderGuardAmbient = new SoundEvent[4];
	
	public static void registerSounds()
	{
		ENTITY_ENDER_GUARD_DEATH = registerSound("entity.ender_guard.death");
		ENTITY_ENDER_GUARD_STARE = registerSound("entity.ender_guard.stare");
		enderGuardHurt[0] = registerSound("entity.ender_guard.hurt1");
		enderGuardHurt[1] = registerSound("entity.ender_guard.hurt2");
		enderGuardHurt[2] = registerSound("entity.ender_guard.hurt3");
		enderGuardAmbient[0] = registerSound("entity.ender_guard_ambient1");
		enderGuardAmbient[1] = registerSound("entity.ender_guard_ambient2");
		enderGuardAmbient[2] = registerSound("entity.ender_guard_ambient3");
		enderGuardAmbient[3] = registerSound("entity.ender_guard_ambient4");
	}
	
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
	
	
}
