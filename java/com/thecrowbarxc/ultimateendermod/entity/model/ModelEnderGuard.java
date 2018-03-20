package com.thecrowbarxc.ultimateendermod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelEnderman - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelEnderGuard extends ModelBase {
    public ModelRenderer RightArm;
    public ModelRenderer LowerRightLeg;
    public ModelRenderer Head;
    public ModelRenderer Torso;
    public ModelRenderer LeftArm;
    public ModelRenderer LowerLeftLeg;
    public ModelRenderer Jaw;
    public ModelRenderer UpperRightLeg;
    public ModelRenderer UpperLeftLeg;

    public ModelEnderGuard() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.LowerRightLeg = new ModelRenderer(this, 56, 0);
        this.LowerRightLeg.setRotationPoint(-2.0F, 4.0F, -3.5F);
        this.LowerRightLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 20, 2, 0.0F);
        this.setRotateAngle(LowerRightLeg, 0.18203784098300857F, 0.0F, 0.0F);
        this.LeftArm = new ModelRenderer(this, 56, 0);
        this.LeftArm.mirror = true;
        this.LeftArm.setRotationPoint(5.0F, -19.0F, -2.0F);
        this.LeftArm.addBox(-1.0F, -2.0F, -1.0F, 2, 35, 2, 0.0F);
        this.setRotateAngle(LeftArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.UpperRightLeg = new ModelRenderer(this, 32, -1);
        this.UpperRightLeg.setRotationPoint(-3.0F, 10.0F, -1.0F);
        this.UpperRightLeg.addBox(0.0F, 0.0F, 0.0F, 2, 16, 2, 0.0F);
        this.setRotateAngle(UpperRightLeg, -0.31869712141416456F, 0.0F, 0.0F);
        this.UpperLeftLeg = new ModelRenderer(this, 32, -1);
        this.UpperLeftLeg.setRotationPoint(1.0F, 10.0F, -1.0F);
        this.UpperLeftLeg.addBox(0.0F, 0.0F, 0.0F, 2, 16, 2, 0.0F);
        this.setRotateAngle(UpperLeftLeg, -0.31869712141416456F, 0.0F, 0.0F);
        this.LowerLeftLeg = new ModelRenderer(this, 56, 0);
        this.LowerLeftLeg.mirror = true;
        this.LowerLeftLeg.setRotationPoint(2.0F, 4.0F, -3.5F);
        this.LowerLeftLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 20, 2, 0.0F);
        this.setRotateAngle(LowerLeftLeg, 0.18203784098300857F, 0.0F, 0.0F);
        this.RightArm = new ModelRenderer(this, 56, 0);
        this.RightArm.setRotationPoint(-5.0F, -19.0F, -2.0F);
        this.RightArm.addBox(-1.0F, -2.0F, -1.0F, 2, 35, 2, 0.0F);
        this.setRotateAngle(RightArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.Torso = new ModelRenderer(this, 32, 16);
        this.Torso.setRotationPoint(0.0F, -21.5F, -2.0F);
        this.Torso.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.setRotateAngle(Torso, 0.136659280431156F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, -20.5F, -2.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(Head, 0.136659280431156F, 0.0F, 0.0F);
        this.Jaw = new ModelRenderer(this, 0, 16);
        this.Jaw.setRotationPoint(0.0F, -20.6F, -2.0F);
        this.Jaw.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(Jaw, 0.136659280431156F, 0.0F, 0.0F);
        this.Jaw.addChild(this.UpperRightLeg);
        this.Jaw.addChild(this.UpperLeftLeg);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.LowerRightLeg.render(f5);
        this.LeftArm.render(f5);
        this.LowerLeftLeg.render(f5);
        this.RightArm.render(f5);
        this.Torso.render(f5);
        this.Head.render(f5);
        this.Jaw.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
