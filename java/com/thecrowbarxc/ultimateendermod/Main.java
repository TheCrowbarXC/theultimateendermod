package com.thecrowbarxc.ultimateendermod;


import java.rmi.registry.RegistryHandler;

import com.thecrowbarxc.ultimateendermod.proxy.CommonProxy;
import com.thecrowbarxc.ultimateendermod.tabs.UltimateEnderTab;
import com.thecrowbarxc.ultimateendermod.util.Reference;
import com.thecrowbarxc.ultimateendermod.util.handlers.RegistryHandlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	public static final CreativeTabs ultimateendertab = new UltimateEnderTab("ultimateendertab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		RegistryHandlers.preInitRegistries();
		RegistryHandlers.otherRegistries();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		RegistryHandlers.InitRegistries();
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		RegistryHandlers.postInitRegistries();
	}
}
