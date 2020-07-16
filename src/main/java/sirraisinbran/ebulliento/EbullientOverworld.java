package sirraisinbran.ebulliento;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import sirraisinbran.ebulliento.client.entity.render.RenderRegistry;
import sirraisinbran.ebulliento.init.Blocks;
import sirraisinbran.ebulliento.init.EntitiesInit;
import sirraisinbran.ebulliento.init.Items;
import sirraisinbran.ebulliento.world.gen.CinnabarOreGen;

@Mod("ebulliento")
@Mod.EventBusSubscriber(modid = EbullientOverworld.modid, bus = Bus.MOD)
public class EbullientOverworld {
	
	public static EbullientOverworld instance;
	public static final String modid = "ebulliento";
	private static final Logger logger = LogManager.getLogger(modid);
	
	public EbullientOverworld() {
		instance = this;
		
		final IEventBus ebEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		ebEventBus.addListener(this::setup);
		ebEventBus.addListener(this::clientRegistries);
		
		Items.ITEMS.register(ebEventBus);
		Blocks.BLOCKS.register(ebEventBus);
		EntitiesInit.ENTITY_TYPES.register(ebEventBus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		Blocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().group(ItemGroup.BUILDING_BLOCKS);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		logger.info("Setup method registered.");
	}
	
	private void clientRegistries(final FMLClientSetupEvent event) {
		RenderRegistry.registerEntityRenders();
		logger.info("clientRegistries method registered.");
	}
	
	@SubscribeEvent
	public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
		CinnabarOreGen.generateOre();
	}
	
}
