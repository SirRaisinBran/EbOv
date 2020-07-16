package sirraisinbran.ebulliento.util;

import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import sirraisinbran.ebulliento.EbullientOverworld;
import sirraisinbran.ebulliento.objects.ModdedSpawnEggItem;

@Mod.EventBusSubscriber(modid = EbullientOverworld.modid, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
	
	@SubscribeEvent(priority = EventPriority.LOWEST)
	public static void onPostRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
		ModdedSpawnEggItem.initUnaddedEggs();
	}
	
}
