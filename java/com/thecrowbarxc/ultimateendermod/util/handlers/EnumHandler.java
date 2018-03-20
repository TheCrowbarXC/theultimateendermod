package com.thecrowbarxc.ultimateendermod.util.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler 
{	
	public static enum EnumType implements IStringSerializable 
	{
		ENDERIUM(0, "enderium"),
		MUTATED_ENDERIUM(1, "mutated_enderium"),
		CORRUPTED_ENDERIUM(2, "corrupted_enderium"),
		ULTIMATE_ENDERIUM(3, "ultimate_enderium");
		
		private static final EnumType[] META_LOOKUP = new EnumType[values().length];
		private final int meta;
		private final String name, unlocalizedName;
		
		private EnumType(int meta, String name)
		{
			this(meta, name, name);
		}
		
		private EnumType(int meta, String name, String unlocalizedName)
		{
			this.meta = meta;
			this.name= name;
			this.unlocalizedName = unlocalizedName;
		}
		
		@Override
		public String getName() 
		{
			return this.name;
		}
		
		public int getMeta() 
		{
			return this.meta;
		}
		
		public String getUnlocalizedName() {
			return this.unlocalizedName;
		}
		
		@Override
		public String toString() 
		{
			return this.name;
		}
		
		public static EnumType byMetadata(int meta)
		{
			return META_LOOKUP[meta];
		}
		
		static
		{
			for(EnumType enumtype : values ())
			{
				META_LOOKUP[enumtype.getMeta()] = enumtype;
			}
		}
	}
}
