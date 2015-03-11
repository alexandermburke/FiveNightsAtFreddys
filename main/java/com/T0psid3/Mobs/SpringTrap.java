package com.T0psid3.Mobs;

import java.util.Random;

import com.T0psid3.ModelSpringtrap;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SpringTrap	{
	//this anamantronic has no AI

public static int mobid = 0;
public static Object instance;

public void load(){}

	public void generateNether(World world, Random random, int chunkX, int chunkZ){}
		public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
			public int addFuel(ItemStack fuel){
					return 0;
}
@SideOnly(Side.CLIENT)
	public void registerRenderers(){
		RenderingRegistry.registerEntityRenderingHandler(SpringTrap.EntitySpringTrap.class, new RenderLiving(new ModelSpringtrap(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("bon bon texture.png");}});
}
public void serverLoad(FMLServerStartingEvent event){}
@SuppressWarnings("unchecked")
public void preInit(FMLPreInitializationEvent event){
	int entityID = EntityRegistry.findGlobalUniqueEntityId();
	mobid = entityID;
	EntityRegistry.registerGlobalEntityID(SpringTrap.EntitySpringTrap.class, "SpringTrap", entityID);
	EntityRegistry.registerModEntity(SpringTrap.EntitySpringTrap.class, "SpringTrap", entityID, instance, 2, 1, true);
	EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, (255 << 16) + (255 << 8) + 255, (255 << 16) + (255 << 8) + 255));
	EntityRegistry.addSpawn(SpringTrap.EntitySpringTrap.class, 20, 3, 30, EnumCreatureType.monster ,BiomeGenBase.extremeHills);   
}
public static class EntitySpringTrap extends EntityMob 
{
	World world = null;
    public EntitySpringTrap(World var1)
    {
        super(var1);
        world = var1;
        experienceValue = 1000;
        this.isImmuneToFire = true;
        addRandomArmor();
    	
    }

    

protected void applyEntityAttributes(){
super.applyEntityAttributes();
this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(10.00D);
this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1000D);
if(this.getEntityAttribute(SharedMonsterAttributes.attackDamage)!=null)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(50D);
}


    public boolean hasCustomNameTag(){
return true;
}


    
protected void addRandomArmor(){

}


	//Ai Enabled?
	public boolean isAIEnabled()
	{
		   return false;
	}
	//Items Dropped
    protected void dropFewItems(boolean var1, int var2)
    {
        this.entityDropItem(new ItemStack(Items.experience_bottle), 0.0F);
    }
    //Sounds?
    protected String getLivingSound()
    {
        return "";
    }
    protected String getHurtSound()
    {
        return "";
    }
    protected String getDeathSound()
    {
        return "";
    }
    protected String getSwimmingSound()
    {
    	return "";
    }
    
    
    // anything else?
    
    
    

	protected void fall(float l){
		super.fall(l);	
	}
	public void onCriticalHit(Entity entity2) {
		
	}

	public void onKillEntity(EntityLiving entityLiving){
		
	}

	public boolean interact(EntityPlayer entity2){
		return true;
	}

	public String getEntityName(){
		return "SpringTrap";
	}
	
}}
//Model COPYRIGHTED If you copy and paste any of this model into your fnaf mod we can take your mod down as fast as it went up!

