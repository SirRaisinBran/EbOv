package sirraisinbran.ebulliento.init;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import sirraisinbran.ebulliento.EbullientOverworld;
import sirraisinbran.ebulliento.entities.FishlinEntity;

public class EntitiesInit {

	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,
			EbullientOverworld.modid);
	public static final String FISHLIN_NAME = "fishlin";

	public static final RegistryObject<EntityType<FishlinEntity>> FISHLIN_ENTITY = ENTITY_TYPES.register(
			FISHLIN_NAME,
			() -> EntityType.Builder.<FishlinEntity>create(FishlinEntity::new, EntityClassification.CREATURE).size(0.6F, 2.9F)
					.build(new ResourceLocation(EbullientOverworld.modid, FISHLIN_NAME).toString()));

}
