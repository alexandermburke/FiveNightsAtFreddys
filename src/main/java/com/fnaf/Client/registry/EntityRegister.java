package com.fnaf.Client.registry;

import com.fnaf.Common.Entity.Camera.EntityCameraMob;
import com.fnaf.Common.Entity.Nightmare.Bonnie.EntityNightmareBonnieMob;
import com.fnaf.Common.Entity.Nightmare.Freddy.EntityNightmareFreddyMob;
import com.fnaf.Common.Entity.Phantom.bb.EntityPhantomBalloonBoyMob;
import com.fnaf.Common.Entity.Phantom.chica.EntityPhantomChicaMob;
import com.fnaf.Common.Entity.Phantom.foxy.EntityPhantomFoxy;
import com.fnaf.Common.Entity.Phantom.foxy.EntityPhantomFoxyMob;
import com.fnaf.Common.Entity.Phantom.mangle.EntityPhantomMangleMob;
import com.fnaf.Common.Entity.WitheredBonnie.EntityWitheredBonnieMob;
import com.fnaf.Common.Entity.WitheredChica.EntityWitheredChicaMob;
import com.fnaf.Common.Entity.WitheredFoxy.EntityWitheredFoxyMob;
import com.fnaf.Common.Entity.WitheredFreddy.EntityWitheredFreddy;
import com.fnaf.Common.Entity.WitheredFreddy.EntityWitheredFreddyMob;
import com.fnaf.Common.Entity.balloonboy.EntityBalloonBoy;
import com.fnaf.Common.Entity.balloonboy.EntityBalloonBoyMob;
import com.fnaf.Common.Entity.bonnie.EntityBonnieMob;
import com.fnaf.Common.Entity.chica.EntityChicaMob;
import com.fnaf.Common.Entity.fnati.NM.EntityNegativeMickeyMob;
import com.fnaf.Common.Entity.foxy.EntityFoxyMob;
import com.fnaf.Common.Entity.freddy.EntityFreddyMob;
import com.fnaf.Common.Entity.goldenfreddy.EntityGoldenFreddyMob;
import com.fnaf.Common.Entity.mangle.EntityMangleMob;
import com.fnaf.Common.Entity.plushie.bonnie.EntityBonniePlushie;
import com.fnaf.Common.Entity.puppet.EntityPuppetMob;
import com.fnaf.Common.Entity.springtrap.EntitySpringtrap;
import com.fnaf.Common.Entity.springtrap.EntitySpringtrapMob;
import com.fnaf.Common.Entity.toybonnie.EntityToyBonnieMob;
import com.fnaf.Common.Entity.toychica.EntityToyChicaMob;
import com.fnaf.Common.Entity.toyfreddy.EntityToyFreddyMob;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityRegister {

	
	

	public static void registerEntity(){
			
		createEntity(EntityBalloonBoyMob.class, "BalloonBoy", 0xF20521, 0x2011CF);
		createEntity(EntityNightmareBonnieMob.class, "nightmare Bonnie", 0xF20521, 0x2011CF);
/*		createEntity(EntityBonnieMob.class, "Bonnie", 0x525051, 0xEBEBEB);
		createEntity(EntityChicaMob.class, "Chica", 0xDEF22C, 0x707070);
		createEntity(EntityFoxyMob.class, "Foxy", 0xE64B17, 0xF56B3D);
		createEntity(EntityFreddyMob.class, "Freddy", 0x7D6706, 0x9C8627);
		createEntity(EntityGoldenFreddyMob.class, "GoldenFreddy", 0xBDC700, 0xE2ED0C);
		createEntity(EntityMangleMob.class, "Mangle", 0xEFF0DF, 0xF20568);
		createEntity(EntityPuppetMob.class, "Puppet", 0x525051, 0xFAFAFA);
		createEntity(EntitySpringtrapMob.class, "SpringTrap", 0xEFF0DF, 0x6B522C);
		createEntity(EntityToyBonnieMob.class, "ToyBonnie", 0x5CBEFA, 0xF53649);
		createEntity(EntityToyChicaMob.class, "ToyChica", 0xF7F702, 0xF702BE);
		createEntity(EntityToyFreddyMob.class, "ToyFreddy", 0xA88808, 0xAB922E);
		createEntity(EntityWitheredBonnieMob.class, "Withered Bonnie", 0x525023, 0xEBEBEB);
		createEntity(EntityWitheredChicaMob.class, "Withered Chica", 0x525023, 0xEBEBEB);
		createEntity(EntityWitheredFreddyMob.class, "Withered Freddy", 0x525023, 0xEBEBEB);
		createEntity(EntityWitheredFoxyMob.class, "Withered Foxy", 0x525023, 0xEBEBEB);
		createEntity(EntityPhantomBalloonBoyMob.class, "Phantom BB", 0x525023, 0xEBEBEB);
		createEntity(EntityPhantomChicaMob.class, "Phantom Chica", 0x525023, 0xEBEBEB);
		createEntity(EntityPhantomFoxyMob.class, "Phantom Foxy", 0x000000, 0x000000);
		createEntity(EntityPhantomMangleMob.class, "Phantom Mangle", 0x525023, 0xEBEBEB);
		createEntity(EntityNegativeMickeyMob.class, "Negative Mickey", 0x525023, 0xFEFFFC);
		createEntity(EntityCameraMob.class, "Camera", 0x525023, 0xFEFFFC); */
		createEntity(EntityBonniePlushie.class, "Bonnie Plushie", 0xE64B17, 0xF56B3D);
		createEntity(EntityNightmareFreddyMob.class, "NightMare Freddy", 0xE64B17, 0xF56B3D);
		
		
		
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, com.fnaf.Common.main.main_fnaf.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest);
		
		createEgg(randomId, solidColor, spotColor);
		
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
		
	}


















	public static Entity entity() {
		return entity();
	}

	
	public static void mainRegistry(){
		registerEntity();
	}

}
