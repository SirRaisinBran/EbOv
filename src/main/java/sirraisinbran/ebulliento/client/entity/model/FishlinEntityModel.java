package sirraisinbran.ebulliento.client.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import sirraisinbran.ebulliento.entities.FishlinEntity;

@OnlyIn(Dist.CLIENT)
public class FishlinEntityModel extends EntityModel<FishlinEntity>{

	private final ModelRenderer TopFin;
	private final ModelRenderer BackFin;
	private final ModelRenderer Fin1;
	private final ModelRenderer Fin2;
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public FishlinEntityModel() {
		textureWidth = 64;
		textureHeight = 64;

		TopFin = new ModelRenderer(this);
		TopFin.setRotationPoint(1.2F, 23.2F, 0.9F);
		TopFin.setTextureOffset(0, 0).addBox(-2.2F, -38.2F, -2.9F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		TopFin.setTextureOffset(0, 0).addBox(-1.7F, -39.2F, 0.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		BackFin = new ModelRenderer(this);
		BackFin.setRotationPoint(1.2F, 23.2F, 0.9F);
		BackFin.setTextureOffset(23, 0).addBox(-1.7F, -32.9F, 3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		BackFin.setTextureOffset(30, 0).addBox(-1.7F, -33.9F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		BackFin.setTextureOffset(37, 0).addBox(-1.7F, -34.9F, 4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		BackFin.setTextureOffset(45, 0).addBox(-1.7F, -30.9F, 4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		Fin1 = new ModelRenderer(this);
		Fin1.setRotationPoint(1.2F, 23.2F, 0.9F);
		setRotationAngle(Fin1, 0.0F, 0.3665F, 0.0F);
		Fin1.setTextureOffset(0, 7).addBox(1.9F, -33.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		Fin2 = new ModelRenderer(this);
		Fin2.setRotationPoint(1.6F, 23.2F, 2.0F);
		setRotationAngle(Fin2, 0.0F, -0.3665F, 0.0F);
		Fin2.setTextureOffset(0, 14).addBox(-5.9F, -33.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 49).addBox(-3.0F, -14.0F, -4.0F, 6.0F, 7.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(0, 39).addBox(-3.0F, -6.0F, -4.0F, 6.0F, 1.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(22, 8).addBox(-3.0F, -7.0F, 3.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(22, 11).addBox(-3.0F, -7.0F, -4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(38, 9).addBox(-2.5F, -7.0F, -3.0F, 5.0F, 1.0F, 6.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(44, 53).addBox(-3.0F, -5.0F, -2.0F, 6.0F, 7.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(45, 41).addBox(-3.0F, 2.0F, -2.0F, 6.0F, 8.0F, 3.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(30, 46).addBox(-1.0F, -7.0F, -2.0F, 3.0F, 15.0F, 3.0F, 0.0F, false);
		RightArm.setTextureOffset(1, 23).addBox(0.5F, -0.7F, 1.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		RightArm.setTextureOffset(11, 25).addBox(0.5F, 2.3F, 1.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(37, 20).addBox(-2.0F, -7.0F, -2.0F, 3.0F, 15.0F, 3.0F, 0.0F, false);
		LeftArm.setTextureOffset(33, 19).addBox(-0.5F, 2.3F, 1.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);
		LeftArm.setTextureOffset(30, 28).addBox(-0.5F, -0.7F, 1.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(17, 21).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 14.0F, 3.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(52, 21).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 14.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		TopFin.render(matrixStack, buffer, packedLight, packedOverlay);
		BackFin.render(matrixStack, buffer, packedLight, packedOverlay);
		Fin1.render(matrixStack, buffer, packedLight, packedOverlay);
		Fin2.render(matrixStack, buffer, packedLight, packedOverlay);
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(FishlinEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// TODO Auto-generated method stub
		
	}
}
