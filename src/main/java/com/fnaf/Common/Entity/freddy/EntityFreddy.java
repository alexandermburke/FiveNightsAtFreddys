package com.fnaf.Common.Entity.freddy;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityFreddy extends Entity {
	
	public EntityFreddy(World p_i1582_1_) {
		super(p_i1582_1_);
		// TODO Auto-generated constructor stub
	}

	public static void mainRegistry(){
		registerEntity();
	}
	
	public static void registerEntity(){
		
		createEntity(EntityFreddyMob.class, "Freddy", 0x7D6706, 0x9C8627);
		
	}

	public float rotationYaw;
	public Object boundingBox;
	/**
	 * Fisk, go look at some other mod's code, BTW dont forget to slam the door angrly on the way out
	 * @return
	 */
	
	//Sounds
	protected String getLivingSound()
	{
	    return "scare.ogg";
	}
	protected String getHurtSound()
	{
	    return "";
	}
	protected String getDeathSound()
	{
	    return "CROWD_SMALL_CHIL_EC049202.ogg";
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, com.fnaf.Common.mod.MAIN_FNAF.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest);
		
		createEgg(randomId, solidColor, spotColor);
		
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
		
	}

	public void setPosition(float f, int i, float g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void entityInit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound p_70037_1_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound p_70014_1_) {
		// TODO Auto-generated method stub
		
	}

}