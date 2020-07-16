package sirraisinbran.ebulliento.client.entity.render;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import sirraisinbran.ebulliento.init.EntitiesInit;

@OnlyIn(Dist.CLIENT)
public class RenderRegistry {

	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntitiesInit.FISHLIN_ENTITY.get(), new FishlinEntityRender.RenderFactory());
	}
}
