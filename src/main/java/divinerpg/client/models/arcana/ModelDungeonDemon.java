package divinerpg.client.models.arcana;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.*;

public class ModelDungeonDemon<T extends Entity> extends SegmentedModel<T> 
{
    //fields
	ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer headp2;
    ModelRenderer headp3;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer backplate;
    ModelRenderer restplate;
    ModelRenderer connector;
    ModelRenderer shape9;
    ModelRenderer shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;

    public ModelDungeonDemon()
    {
    	textureWidth = 64;
        textureHeight = 32;
        head = new ModelRenderer(this, 32, 0);
        head.addBox(-4F, -10F, -4F, 8, 10, 8);
        head.setRotationPoint(0F, 0F, 0F);
        head.setTextureSize(64, 32);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        body = new ModelRenderer(this, 16, 16);
        body.addBox(-4F, 0F, -2F, 8, 5, 4);
        body.setRotationPoint(0F, 9F, 2F);
        body.setTextureSize(64, 32);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        rightarm = new ModelRenderer(this, 40, 16);
        rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
        rightarm.setRotationPoint(-5F, 7F, 0F);
        rightarm.setTextureSize(64, 32);
        rightarm.mirror = true;
        setRotation(rightarm, 0F, 0F, 0F);
        leftarm = new ModelRenderer(this, 40, 16);
        leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
        leftarm.setRotationPoint(5F, 7F, 0F);
        leftarm.setTextureSize(64, 32);
        leftarm.mirror = true;
        setRotation(leftarm, 0F, 0F, 0F);
        rightleg = new ModelRenderer(this, 0, 16);
        rightleg.addBox(-2F, 0F, -2F, 4, 7, 4);
        rightleg.setRotationPoint(-2F, 17F, 0F);
        rightleg.setTextureSize(64, 32);
        rightleg.mirror = true;
        setRotation(rightleg, 0F, 0F, 0F);
        leftleg = new ModelRenderer(this, 0, 16);
        leftleg.addBox(-2F, 0F, -2F, 4, 7, 4);
        leftleg.setRotationPoint(2F, 17F, 0F);
        leftleg.setTextureSize(64, 32);
        leftleg.mirror = true;
        setRotation(leftleg, 0F, 0F, 0F);
        headp2 = new ModelRenderer(this, 0, 0);
        headp2.addBox(-5F, 0F, -4F, 10, 5, 8);
        headp2.setRotationPoint(0F, -10F, 0F);
        headp2.setTextureSize(64, 32);
        headp2.mirror = true;
        setRotation(headp2, (float)Math.PI, 0F, 0F);
        headp3 = new ModelRenderer(this, 0, 0);
        headp3.addBox(-5F, -5F, -4F, 10, 5, 8);
        headp3.setRotationPoint(0F, 5F, 0F);
        headp3.setTextureSize(64, 32);
        headp3.mirror = true;
        setRotation(headp3, 0F, 0F, 0F);
        Shape1 = new ModelRenderer(this, 46, 14);
        Shape1.addBox(0F, 0F, 0F, 1, 17, 1);
        Shape1.setRotationPoint(0F, 4F, 4F);
        Shape1.setTextureSize(64, 32);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, -((float)Math.PI / 2F));
        Shape2 = new ModelRenderer(this, 46, 14);
        Shape2.addBox(0F, 0F, 0F, 1, 17, 1);
        Shape2.setRotationPoint(0F, -2F, 4F);
        Shape2.setTextureSize(64, 32);
        Shape2.mirror = true;
        setRotation(Shape2, 0F, 0F, -((float)Math.PI / 2F));
        Shape3 = new ModelRenderer(this, 46, 14);
        Shape3.addBox(0F, 0F, 0F, 1, 17, 1);
        Shape3.setRotationPoint(0F, 0F, 4F);
        Shape3.setTextureSize(64, 32);
        Shape3.mirror = true;
        setRotation(Shape3, 0F, 0F, -((float)Math.PI / 2F));
        Shape4 = new ModelRenderer(this, 46, 14);
        Shape4.addBox(0F, 0F, 0F, 1, 17, 1);
        Shape4.setRotationPoint(0F, 2F, 4F);
        Shape4.setTextureSize(64, 32);
        Shape4.mirror = true;
        setRotation(Shape4, 0F, 0F, -((float)Math.PI / 2F));
        Shape5 = new ModelRenderer(this, 46, 14);
        Shape5.addBox(0F, 0F, 0F, 1, 17, 1);
        Shape5.setRotationPoint(0F, 10F, 4F);
        Shape5.setTextureSize(64, 32);
        Shape5.mirror = true;
        setRotation(Shape5, 0F, 0F, -((float)Math.PI / 2F));
        Shape6 = new ModelRenderer(this, 46, 14);
        Shape6.addBox(0F, 0F, 0F, 1, 17, 1);
        Shape6.setRotationPoint(0F, 12F, 4F);
        Shape6.setTextureSize(64, 32);
        Shape6.mirror = true;
        setRotation(Shape6, 0F, 0F, -((float)Math.PI / 2F));
        Shape7 = new ModelRenderer(this, 46, 14);
        Shape7.addBox(0F, 0F, 0F, 1, 17, 1);
        Shape7.setRotationPoint(0F, 8F, 4F);
        Shape7.setTextureSize(64, 32);
        Shape7.mirror = true;
        setRotation(Shape7, 0F, 0F, -((float)Math.PI / 2F));
        Shape8 = new ModelRenderer(this, 46, 14);
        Shape8.addBox(0F, 0F, 0F, 1, 17, 1);
        Shape8.setRotationPoint(0F, 6F, 4F);
        Shape8.setTextureSize(64, 32);
        Shape8.mirror = true;
        setRotation(Shape8, 0F, 0F, -((float)Math.PI / 2F));
        backplate = new ModelRenderer(this, 16, 16);
        backplate.addBox(-4F, 0F, -2F, 8, 12, 4);
        backplate.setRotationPoint(0F, 5F, 0F);
        backplate.setTextureSize(64, 32);
        backplate.mirror = true;
        setRotation(backplate, 0F, 0F, 0F);
        restplate = new ModelRenderer(this, 16, 16);
        restplate.addBox(-4F, 0F, -2F, 8, 12, 4);
        restplate.setRotationPoint(0F, -3F, 6F);
        restplate.setTextureSize(64, 32);
        restplate.mirror = true;
        setRotation(restplate, 0F, 0F, 0F);
        connector = new ModelRenderer(this, 16, 16);
        connector.addBox(-4F, 0F, -2F, 8, 5, 4);
        connector.setRotationPoint(0F, 9F, 6F);
        connector.setTextureSize(64, 32);
        connector.mirror = true;
        setRotation(connector, 0F, 0F, 0F);
        shape9 = new ModelRenderer(this, 46, 14);
        shape9.addBox(0F, 0F, 0F, 1, 17, 1);
        shape9.setRotationPoint(1F, -3F, 5F);
        shape9.setTextureSize(64, 32);
        shape9.mirror = true;
        setRotation(shape9, 0F, 0F, ((float)Math.PI / 2F));
        shape10 = new ModelRenderer(this, 46, 14);
        shape10.addBox(0F, 0F, 0F, 1, 17, 1);
        shape10.setRotationPoint(1F, -1F, 5F);
        shape10.setTextureSize(64, 32);
        shape10.mirror = true;
        setRotation(shape10, 0F, 0F, ((float)Math.PI / 2F));
        Shape11 = new ModelRenderer(this, 46, 14);
        Shape11.addBox(0F, 0F, 0F, 1, 17, 1);
        Shape11.setRotationPoint(1F, 1F, 5F);
        Shape11.setTextureSize(64, 32);
        Shape11.mirror = true;
        setRotation(Shape11, 0F, 0F, ((float)Math.PI / 2F));
        Shape12 = new ModelRenderer(this, 46, 14);
        Shape12.addBox(0F, 0F, 0F, 1, 17, 1);
        Shape12.setRotationPoint(1F, 3F, 5F);
        Shape12.setTextureSize(64, 32);
        Shape12.mirror = true;
        setRotation(Shape12, 0F, 0F, ((float)Math.PI / 2F));
        Shape13 = new ModelRenderer(this, 46, 14);
        Shape13.addBox(0F, 0F, 0F, 1, 17, 1);
        Shape13.setRotationPoint(1F, 5F, 5F);
        Shape13.setTextureSize(64, 32);
        Shape13.mirror = true;
        setRotation(Shape13, 0F, 0F, ((float)Math.PI / 2F));
        Shape14 = new ModelRenderer(this, 46, 14);
        Shape14.addBox(0F, 0F, 0F, 1, 17, 1);
        Shape14.setRotationPoint(1F, 7F, 5F);
        Shape14.setTextureSize(64, 32);
        Shape14.mirror = true;
        setRotation(Shape14, 0F, 0F, ((float)Math.PI / 2F));
        Shape15 = new ModelRenderer(this, 46, 14);
        Shape15.addBox(0F, 0F, 0F, 1, 17, 1);
        Shape15.setRotationPoint(1F, 9F, 5F);
        Shape15.setTextureSize(64, 32);
        Shape15.mirror = true;
        setRotation(Shape15, 0F, 0F, ((float)Math.PI / 2F));
        Shape16 = new ModelRenderer(this, 46, 14);
        Shape16.addBox(0F, 0F, 0F, 1, 17, 1);
        Shape16.setRotationPoint(1F, 11F, 5F);
        Shape16.setTextureSize(64, 32);
        Shape16.mirror = true;
        setRotation(Shape16, 0F, 0F, ((float)Math.PI / 2F));
    }
    
    @Override
    public Iterable<ModelRenderer> getParts() {
        return ImmutableList.of(head, body, rightarm, leftarm, rightleg, leftleg, headp2, headp3, Shape1, Shape2, Shape3, Shape4, Shape5, Shape6, Shape7, Shape8, backplate, restplate, connector, shape9, shape10, Shape11, Shape12, Shape13, Shape14, Shape15, Shape16);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		this.head.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
        this.head.rotateAngleX = headPitch / (180F / (float)Math.PI);
        this.headp2.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
        this.headp2.rotateAngleX = headPitch / (180F / (float)Math.PI);
        this.headp3.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
        this.headp3.rotateAngleX = headPitch / (180F / (float)Math.PI);
        this.rightarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F;
        this.leftarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;
        this.rightarm.rotateAngleZ = 0.0F;
        this.leftarm.rotateAngleZ = 0.0F;
        this.rightleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.rightleg.rotateAngleY = 0.0F;
        this.leftleg.rotateAngleY = 0.0F;
        this.rightarm.rotateAngleY = 0.0F;
        this.leftarm.rotateAngleY = 0.0F;
        this.rightarm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.leftarm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.rightarm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.leftarm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
	}
}