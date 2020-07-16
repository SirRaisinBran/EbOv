package sirraisinbran.ebulliento.client.entity.render;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import sirraisinbran.ebulliento.EbullientOverworld;
import sirraisinbran.ebulliento.client.entity.model.FishlinEntityModel;
import sirraisinbran.ebulliento.entities.FishlinEntity;

@OnlyIn(Dist.CLIENT)
public class FishlinEntityRender extends LivingRenderer<FishlinEntity, FishlinEntityModel>{

	public FishlinEntityRender(EntityRendererManager manager) {
		super(manager, new FishlinEntityModel(), 1.0f);
	}

	@Override
	public ResourceLocation getEntityTexture(FishlinEntity entity) {
		return new ResourceLocation(EbullientOverworld.modid, "textures/entity/fishlinhunter1.png");
	}
	
	public static class RenderFactory implements IRenderFactory<FishlinEntity> {

		@Override
		public EntityRenderer<? super FishlinEntity> createRenderFor(EntityRendererManager manager) {
			return new FishlinEntityRender(manager);
		}
		
	}

}
