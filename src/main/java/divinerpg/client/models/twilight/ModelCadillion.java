package divinerpg.client.models.twilight;// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.*;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCadillion extends SegmentedModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Horn_r1;
	private final ModelRenderer Mouth;
	private final ModelRenderer Body;
	private final ModelRenderer FrontRightLeg;
	private final ModelRenderer FrontLeftLeg;
	private final ModelRenderer BackRightLeg;
	private final ModelRenderer BackLeftLeg;
	private final ModelRenderer bb_main;
	private final ModelRenderer RightEar_r1;
	private final ModelRenderer LeftEar_r1;

	public ModelCadillion() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 24.0F, 0.0F);
		Head.setTextureOffset(33, 33).addBox(-4.0F, -24.0F, -14.0F, 8.0F, 8.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(54, 12).addBox(-3.0F, -21.0F, -17.0F, 6.0F, 4.0F, 3.0F, 0.0F, false);

		Horn_r1 = new ModelRenderer(this);
		Horn_r1.setRotationPoint(0.0F, -21.9528F, -12.7743F);
		Head.addChild(Horn_r1);
		setRotationAngle(Horn_r1, 0.3927F, 0.0F, 0.0F);
		Horn_r1.setTextureOffset(14, 56).addBox(-1.0F, -7.5F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		Mouth = new ModelRenderer(this);
		Mouth.setRotationPoint(0.0F, -16.5F, -15.5F);
		Head.addChild(Mouth);
		Mouth.setTextureOffset(0, 15).addBox(-3.0F, -0.5F, -1.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 9.5F, 0.75F);
		Body.setTextureOffset(0, 31).addBox(-4.0F, -4.5F, -8.75F, 8.0F, 8.0F, 17.0F, 0.0F, false);
		Body.setTextureOffset(0, 0).addBox(-5.5F, -5.5F, -9.25F, 11.0F, 12.0F, 19.0F, 0.0F, false);

		FrontRightLeg = new ModelRenderer(this);
		FrontRightLeg.setRotationPoint(-3.0F, 13.0F, -6.0F);
		FrontRightLeg.setTextureOffset(50, 50).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);

		FrontLeftLeg = new ModelRenderer(this);
		FrontLeftLeg.setRotationPoint(3.0F, 13.0F, -6.0F);
		FrontLeftLeg.setTextureOffset(41, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);

		BackRightLeg = new ModelRenderer(this);
		BackRightLeg.setRotationPoint(-3.0F, 13.0F, 8.0F);
		BackRightLeg.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);

		BackLeftLeg = new ModelRenderer(this);
		BackLeftLeg.setRotationPoint(3.0F, 13.0F, 8.0F);
		BackLeftLeg.setTextureOffset(0, 31).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		RightEar_r1 = new ModelRenderer(this);
		RightEar_r1.setRotationPoint(-8.0F, -21.0F, -10.0F);
		bb_main.addChild(RightEar_r1);
		setRotationAngle(RightEar_r1, 0.0F, 0.0F, -0.1309F);
		RightEar_r1.setTextureOffset(55, 31).addBox(0.0F, -6.47F, 1.0F, 6.0F, 7.0F, 0.0F, 0.0F, false);

		LeftEar_r1 = new ModelRenderer(this);
		LeftEar_r1.setRotationPoint(3.0F, -21.0F, -10.0F);
		bb_main.addChild(LeftEar_r1);
		setRotationAngle(LeftEar_r1, 0.0F, 0.0F, 0.1309F);
		LeftEar_r1.setTextureOffset(1, 56).addBox(-1.0F, -7.0F, 1.0F, 6.0F, 7.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

//	@Override
//	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
//		Head.render(matrixStack, buffer, packedLight, packedOverlay);
//		Body.render(matrixStack, buffer, packedLight, packedOverlay);
//		FrontRightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
//		FrontLeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
//		BackRightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
//		BackLeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
//		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
//	}

	@Override
	public Iterable<ModelRenderer> getParts() {
		return ImmutableList.of(Head, Body, FrontRightLeg, FrontLeftLeg, BackRightLeg, BackLeftLeg, bb_main);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

}