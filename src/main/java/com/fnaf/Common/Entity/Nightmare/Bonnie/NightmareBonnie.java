package com.fnaf.Common.Entity.Nightmare.Bonnie;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * Nightmare Bonnie - Cuchololol
 * Created using Tabula 4.1.1
 */
public class NightmareBonnie extends ModelBase {
    public ModelRenderer EndoBody;
    public ModelRenderer RightShoulder;
    public ModelRenderer LeftShoulder;
    public ModelRenderer RightEndoLeg1;
    public ModelRenderer LeftEndoLeg1;
    public ModelRenderer Body;
    public ModelRenderer Neck;
    public ModelRenderer Hip1;
    public ModelRenderer EndoBody2;
    public ModelRenderer Bowtie1;
    public ModelRenderer Bowtie2;
    public ModelRenderer Bowtie3;
    public ModelRenderer Bowtie4;
    public ModelRenderer Bowtie5;
    public ModelRenderer Head1;
    public ModelRenderer RightEye;
    public ModelRenderer LeftEye;
    public ModelRenderer Head2;
    public ModelRenderer Head3;
    public ModelRenderer Head4;
    public ModelRenderer Head5;
    public ModelRenderer Head6;
    public ModelRenderer UpperJaw1;
    public ModelRenderer LowerJaw1;
    public ModelRenderer Head10;
    public ModelRenderer UpperTeeth1;
    public ModelRenderer Head7;
    public ModelRenderer Head8;
    public ModelRenderer Head9;
    public ModelRenderer RightEar1;
    public ModelRenderer LeftEar1;
    public ModelRenderer RightEar2;
    public ModelRenderer RightEar3;
    public ModelRenderer LeftEar2;
    public ModelRenderer LeftEar3;
    public ModelRenderer Nose;
    public ModelRenderer UpperJaw2;
    public ModelRenderer RightWhiskers;
    public ModelRenderer LeftWhiskers;
    public ModelRenderer LowerJaw2;
    public ModelRenderer LowerTeeth1;
    public ModelRenderer LowerTeeth2;
    public ModelRenderer UpperTeeth2;
    public ModelRenderer Hip2;
    public ModelRenderer RightEndoArm1;
    public ModelRenderer RightEndoArm2;
    public ModelRenderer RightArm1;
    public ModelRenderer RightArm2;
    public ModelRenderer RightHand;
    public ModelRenderer RightThumb;
    public ModelRenderer RightFingers;
    public ModelRenderer LeftEndoArm1;
    public ModelRenderer LeftEndoArm2;
    public ModelRenderer LeftArm1;
    public ModelRenderer LeftArm2;
    public ModelRenderer LeftHand;
    public ModelRenderer LeftThumb;
    public ModelRenderer LeftFingers;
    public ModelRenderer RightLeg1;
    public ModelRenderer RightEndoLeg2;
    public ModelRenderer RightLeg2;
    public ModelRenderer RightEndoFeet;
    public ModelRenderer RightFeet;
    public ModelRenderer RightFeetFinger1;
    public ModelRenderer RightFeetFinger2;
    public ModelRenderer RightFeetFinger3;
    public ModelRenderer LeftLeg1;
    public ModelRenderer LeftEndoLeg2;
    public ModelRenderer LeftLeg2;
    public ModelRenderer LeftEndoFeet;

    public NightmareBonnie() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.LowerTeeth1 = new ModelRenderer(this, 53, 88);
        this.LowerTeeth1.setRotationPoint(0.0F, -1.0F, -2.5F);
        this.LowerTeeth1.addBox(-4.0F, 0.0F, -5.0F, 8, 1, 6, 0.0F);
        this.Bowtie2 = new ModelRenderer(this, 68, 57);
        this.Bowtie2.setRotationPoint(0.8F, -0.1F, -0.8F);
        this.Bowtie2.addBox(0.0F, -0.5F, 0.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Bowtie2, 0.0F, 0.0F, -0.18203784098300857F);
        this.Head4 = new ModelRenderer(this, 24, 56);
        this.Head4.setRotationPoint(3.5F, -5.0F, -3.0F);
        this.Head4.addBox(-0.5F, -3.0F, -1.0F, 1, 3, 2, 0.0F);
        this.Nose = new ModelRenderer(this, 15, 40);
        this.Nose.setRotationPoint(0.0F, -1.1F, -2.2F);
        this.Nose.addBox(-1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Nose, -0.136659280431156F, 0.0F, 0.0F);
        this.LeftArm2 = new ModelRenderer(this, 79, 34);
        this.LeftArm2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.LeftArm2.addBox(-2.0F, -2.0F, -2.0F, 4, 6, 4, 0.0F);
        this.Head5 = new ModelRenderer(this, 7, 48);
        this.Head5.setRotationPoint(0.0F, -5.0F, -2.0F);
        this.Head5.addBox(-4.0F, -2.0F, 0.0F, 8, 2, 4, 0.0F);
        this.EndoBody2 = new ModelRenderer(this, 10, 107);
        this.EndoBody2.setRotationPoint(0.0F, -1.4F, 2.5F);
        this.EndoBody2.addBox(-1.5F, 0.0F, 0.0F, 3, 14, 1, 0.0F);
        this.RightWhiskers = new ModelRenderer(this, 0, 0);
        this.RightWhiskers.setRotationPoint(-1.0F, -0.3F, -3.0F);
        this.RightWhiskers.addBox(-4.0F, -1.0F, 0.0F, 4, 2, 0, 0.0F);
        this.setRotateAngle(RightWhiskers, 0.0F, -0.136659280431156F, -0.045553093477052F);
        this.UpperTeeth2 = new ModelRenderer(this, 84, 82);
        this.UpperTeeth2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.UpperTeeth2.addBox(-2.0F, 0.0F, -2.0F, 4, 1, 4, 0.0F);
        this.LeftShoulder = new ModelRenderer(this, 112, 31);
        this.LeftShoulder.setRotationPoint(4.0F, -11.0F, 0.0F);
        this.LeftShoulder.addBox(0.0F, -1.0F, -2.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(LeftShoulder, 0.0F, 0.0F, -0.22759093446006054F);
        this.Head8 = new ModelRenderer(this, 0, 29);
        this.Head8.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Head8.addBox(-3.0F, -1.0F, -6.0F, 7, 1, 6, 0.0F);
        this.LeftEndoArm1 = new ModelRenderer(this, 102, 8);
        this.LeftEndoArm1.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.LeftEndoArm1.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
        this.setRotateAngle(LeftEndoArm1, 0.0F, 0.0F, -0.091106186954104F);
        this.Bowtie3 = new ModelRenderer(this, 68, 57);
        this.Bowtie3.setRotationPoint(0.8F, 0.1F, -0.8F);
        this.Bowtie3.addBox(0.0F, -0.5F, 0.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Bowtie3, 0.0F, 0.0F, 0.18203784098300857F);
        this.Head6 = new ModelRenderer(this, 0, 43);
        this.Head6.setRotationPoint(0.0F, -4.0F, 2.0F);
        this.Head6.addBox(-3.5F, -1.5F, 0.0F, 7, 3, 1, 0.0F);
        this.LeftEar1 = new ModelRenderer(this, 55, 0);
        this.LeftEar1.setRotationPoint(2.5F, -1.0F, 1.0F);
        this.LeftEar1.addBox(-2.0F, -4.5F, -1.0F, 3, 5, 2, 0.0F);
        this.setRotateAngle(LeftEar1, 0.0F, 0.0F, 0.091106186954104F);
        this.UpperJaw2 = new ModelRenderer(this, 36, 40);
        this.UpperJaw2.setRotationPoint(0.0F, 2.0F, -1.0F);
        this.UpperJaw2.addBox(-3.5F, -1.7F, -2.0F, 7, 1, 2, 0.0F);
        this.LeftArm1 = new ModelRenderer(this, 79, 21);
        this.LeftArm1.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.LeftArm1.addBox(-2.5F, -3.0F, -2.5F, 5, 7, 5, 0.0F);
        this.Head9 = new ModelRenderer(this, 30, 57);
        this.Head9.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.Head9.addBox(-3.5F, -1.0F, -2.0F, 7, 1, 6, 0.0F);
        this.RightShoulder = new ModelRenderer(this, 96, 0);
        this.RightShoulder.setRotationPoint(-4.0F, -11.0F, 0.0F);
        this.RightShoulder.addBox(-4.0F, -1.0F, -2.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(RightShoulder, 0.0F, 0.0F, 0.22759093446006054F);
        this.RightEar1 = new ModelRenderer(this, 40, 0);
        this.RightEar1.setRotationPoint(-2.5F, -1.0F, 1.0F);
        this.RightEar1.addBox(-1.0F, -4.5F, -1.0F, 3, 5, 2, 0.0F);
        this.setRotateAngle(RightEar1, 0.27314402793711257F, 0.0F, -0.045553093477052F);
        this.RightFeetFinger3 = new ModelRenderer(this, 0, 8);
        this.RightFeetFinger3.setRotationPoint(0.0F, 0.3F, -4.5F);
        this.RightFeetFinger3.addBox(-1.0F, -1.0F, -2.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(RightFeetFinger3, -0.136659280431156F, 0.0F, -0.045553093477052F);
        this.Bowtie5 = new ModelRenderer(this, 68, 57);
        this.Bowtie5.setRotationPoint(-0.8F, 0.1F, -0.8F);
        this.Bowtie5.addBox(-3.0F, -0.5F, 0.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Bowtie5, 0.0F, 0.0F, -0.18203784098300857F);
        this.LowerJaw2 = new ModelRenderer(this, 36, 33);
        this.LowerJaw2.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.LowerJaw2.addBox(-4.0F, 0.0F, -2.0F, 8, 2, 2, 0.0F);
        this.RightEndoArm2 = new ModelRenderer(this, 104, 21);
        this.RightEndoArm2.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.RightEndoArm2.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(RightEndoArm2, 0.0F, 0.0F, -0.22759093446006054F);
        this.LeftThumb = new ModelRenderer(this, 41, 22);
        this.LeftThumb.setRotationPoint(-1.0F, 1.0F, -2.0F);
        this.LeftThumb.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(LeftThumb, 0.0F, 0.0F, 0.18203784098300857F);
        this.Bowtie4 = new ModelRenderer(this, 68, 57);
        this.Bowtie4.setRotationPoint(-0.8F, -0.1F, -0.8F);
        this.Bowtie4.addBox(-3.0F, -0.5F, 0.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(Bowtie4, 0.0F, 0.0F, 0.18203784098300857F);
        this.LeftLeg1 = new ModelRenderer(this, 38, 65);
        this.LeftLeg1.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.LeftLeg1.addBox(-2.5F, -3.0F, -2.5F, 5, 9, 5, 0.0F);
        this.RightThumb = new ModelRenderer(this, 30, 22);
        this.RightThumb.setRotationPoint(1.0F, 1.0F, -2.0F);
        this.RightThumb.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(RightThumb, 0.0F, 0.0F, -0.18203784098300857F);
        this.RightEar3 = new ModelRenderer(this, 41, 16);
        this.RightEar3.setRotationPoint(0.0F, -4.0F, 1.0F);
        this.RightEar3.addBox(-1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(RightEar3, 0.5009094953223726F, 0.0F, 0.0F);
        this.LowerJaw1 = new ModelRenderer(this, 32, 48);
        this.LowerJaw1.setRotationPoint(0.0F, -2.0F, 2.0F);
        this.LowerJaw1.addBox(-4.5F, 0.0F, -6.0F, 9, 2, 6, 0.0F);
        this.setRotateAngle(LowerJaw1, 0.40980330836826856F, 0.0F, 0.0F);
        this.LeftFingers = new ModelRenderer(this, 33, 24);
        this.LeftFingers.setRotationPoint(1.0F, 2.5F, 0.0F);
        this.LeftFingers.addBox(-0.5F, 0.0F, -2.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(LeftFingers, 0.0F, 0.0F, 0.18203784098300857F);
        this.RightHand = new ModelRenderer(this, 114, 2);
        this.RightHand.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.RightHand.addBox(-1.5F, -0.5F, -2.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(RightHand, 0.0F, -0.5462880558742251F, 0.0F);
        this.RightLeg2 = new ModelRenderer(this, 14, 80);
        this.RightLeg2.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.RightLeg2.addBox(-2.0F, -2.0F, -2.0F, 4, 7, 4, 0.0F);
        this.LeftEar2 = new ModelRenderer(this, 56, 9);
        this.LeftEar2.setRotationPoint(-0.5F, -4.5F, 0.0F);
        this.LeftEar2.addBox(-1.5F, -4.0F, -1.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(LeftEar2, 0.8651597102135892F, 0.0F, 0.0F);
        this.LeftEndoLeg2 = new ModelRenderer(this, 0, 78);
        this.LeftEndoLeg2.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.LeftEndoLeg2.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(LeftEndoLeg2, 0.091106186954104F, 0.0F, 0.0F);
        this.RightFeetFinger1 = new ModelRenderer(this, 0, 17);
        this.RightFeetFinger1.setRotationPoint(-2.0F, 0.3F, -4.0F);
        this.RightFeetFinger1.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(RightFeetFinger1, -0.136659280431156F, 0.18203784098300857F, 0.0F);
        this.RightLeg1 = new ModelRenderer(this, 14, 65);
        this.RightLeg1.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.RightLeg1.addBox(-2.5F, -3.0F, -2.5F, 5, 9, 5, 0.0F);
        this.LowerTeeth2 = new ModelRenderer(this, 57, 79);
        this.LowerTeeth2.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.LowerTeeth2.addBox(-2.5F, 0.0F, -2.0F, 5, 1, 5, 0.0F);
        this.RightArm2 = new ModelRenderer(this, 57, 34);
        this.RightArm2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.RightArm2.addBox(-2.0F, -2.0F, -2.0F, 4, 6, 4, 0.0F);
        this.LeftEndoLeg1 = new ModelRenderer(this, 0, 66);
        this.LeftEndoLeg1.setRotationPoint(3.5F, 4.6F, 0.0F);
        this.LeftEndoLeg1.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
        this.setRotateAngle(LeftEndoLeg1, -0.045553093477052F, 0.0F, 0.0F);
        this.LeftWhiskers = new ModelRenderer(this, 4, 2);
        this.LeftWhiskers.setRotationPoint(1.0F, -0.3F, -3.0F);
        this.LeftWhiskers.addBox(0.0F, -1.0F, 0.0F, 4, 2, 0, 0.0F);
        this.setRotateAngle(LeftWhiskers, 0.0F, 0.136659280431156F, 0.045553093477052F);
        this.RightEndoFeet = new ModelRenderer(this, 0, 93);
        this.RightEndoFeet.setRotationPoint(0.0F, 9.5F, 0.5F);
        this.RightEndoFeet.addBox(-2.0F, 0.0F, -5.0F, 4, 2, 6, 0.0F);
        this.setRotateAngle(RightEndoFeet, -0.045553093477052F, 0.0F, 0.0F);
        this.LeftLeg2 = new ModelRenderer(this, 38, 80);
        this.LeftLeg2.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.LeftLeg2.addBox(-2.0F, -2.0F, -2.0F, 4, 7, 4, 0.0F);
        this.Head1 = new ModelRenderer(this, 0, 55);
        this.Head1.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Head1.addBox(-4.5F, -5.0F, -4.0F, 9, 3, 6, 0.0F);
        this.Head3 = new ModelRenderer(this, 0, 52);
        this.Head3.setRotationPoint(-3.5F, -5.0F, -3.0F);
        this.Head3.addBox(-0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F);
        this.RightEye = new ModelRenderer(this, 62, 71);
        this.RightEye.setRotationPoint(-1.8F, -6.2F, -2.5F);
        this.RightEye.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.RightEar2 = new ModelRenderer(this, 40, 9);
        this.RightEar2.setRotationPoint(0.5F, -4.5F, 0.0F);
        this.RightEar2.addBox(-1.5F, -4.0F, -1.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(RightEar2, 1.8212510744560826F, 0.0F, 0.0F);
        this.RightArm1 = new ModelRenderer(this, 57, 21);
        this.RightArm1.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.RightArm1.addBox(-2.5F, -3.0F, -2.5F, 5, 7, 5, 0.0F);
        this.Hip1 = new ModelRenderer(this, 68, 0);
        this.Hip1.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.Hip1.addBox(-5.0F, 0.0F, -4.0F, 10, 3, 8, 0.0F);
        this.Bowtie1 = new ModelRenderer(this, 69, 61);
        this.Bowtie1.setRotationPoint(0.0F, -4.0F, -3.3F);
        this.Bowtie1.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.Hip2 = new ModelRenderer(this, 69, 11);
        this.Hip2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Hip2.addBox(-1.5F, 0.0F, -3.5F, 3, 1, 7, 0.0F);
        this.LeftHand = new ModelRenderer(this, 114, 12);
        this.LeftHand.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.LeftHand.addBox(-1.5F, -0.5F, -2.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(LeftHand, 0.0F, 0.5462880558742251F, 0.0F);
        this.Neck = new ModelRenderer(this, 63, 45);
        this.Neck.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Neck.addBox(-2.0F, -3.0F, -2.0F, 4, 3, 4, 0.0F);
        this.Body = new ModelRenderer(this, 86, 42);
        this.Body.setRotationPoint(0.0F, 6.0F, -0.5F);
        this.Body.addBox(-6.0F, -6.5F, -4.0F, 12, 13, 9, 0.0F);
        this.LeftEndoArm2 = new ModelRenderer(this, 104, 21);
        this.LeftEndoArm2.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.LeftEndoArm2.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(LeftEndoArm2, 0.0F, 0.0F, 0.22759093446006054F);
        this.UpperTeeth1 = new ModelRenderer(this, 78, 72);
        this.UpperTeeth1.setRotationPoint(0.0F, -2.0F, -3.5F);
        this.UpperTeeth1.addBox(-3.5F, 0.0F, -2.0F, 7, 1, 6, 0.0F);
        this.Head10 = new ModelRenderer(this, 1, 22);
        this.Head10.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Head10.addBox(-3.0F, -1.0F, -2.0F, 7, 1, 4, 0.0F);
        this.LeftEye = new ModelRenderer(this, 72, 71);
        this.LeftEye.setRotationPoint(1.8F, -6.2F, -2.5F);
        this.LeftEye.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.LeftEar3 = new ModelRenderer(this, 58, 16);
        this.LeftEar3.setRotationPoint(0.0F, -4.0F, 1.0F);
        this.LeftEar3.addBox(-1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(LeftEar3, 0.6373942428283291F, 0.0F, 0.0F);
        this.RightFeetFinger2 = new ModelRenderer(this, 0, 13);
        this.RightFeetFinger2.setRotationPoint(2.0F, 0.3F, -4.0F);
        this.RightFeetFinger2.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(RightFeetFinger2, -0.136659280431156F, -0.18203784098300857F, 0.0F);
        this.LeftEndoFeet = new ModelRenderer(this, 0, 93);
        this.LeftEndoFeet.setRotationPoint(0.0F, 9.5F, 0.5F);
        this.LeftEndoFeet.addBox(-2.0F, 0.0F, -5.0F, 4, 2, 6, 0.0F);
        this.setRotateAngle(LeftEndoFeet, -0.045553093477052F, 0.0F, 0.0F);
        this.RightFeet = new ModelRenderer(this, 22, 93);
        this.RightFeet.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightFeet.addBox(-2.5F, -1.0F, -5.0F, 5, 3, 7, 0.0F);
        this.setRotateAngle(RightFeet, 0.136659280431156F, 0.0F, 0.0F);
        this.UpperJaw1 = new ModelRenderer(this, 17, 39);
        this.UpperJaw1.setRotationPoint(0.0F, -3.3F, -3.0F);
        this.UpperJaw1.addBox(-3.5F, -1.5F, -3.0F, 7, 2, 5, 0.0F);
        this.RightEndoArm1 = new ModelRenderer(this, 102, 8);
        this.RightEndoArm1.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.RightEndoArm1.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
        this.setRotateAngle(RightEndoArm1, 0.0F, 0.0F, 0.091106186954104F);
        this.EndoBody = new ModelRenderer(this, 9, 0);
        this.EndoBody.setRotationPoint(0.0F, -11.0F, 0.0F);
        this.EndoBody.addBox(-4.5F, -1.0F, -3.0F, 9, 14, 6, 0.0F);
        this.Head7 = new ModelRenderer(this, 0, 37);
        this.Head7.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Head7.addBox(-3.0F, -2.5F, 0.0F, 6, 4, 1, 0.0F);
        this.RightEndoLeg1 = new ModelRenderer(this, 0, 66);
        this.RightEndoLeg1.setRotationPoint(-3.5F, 4.6F, 0.0F);
        this.RightEndoLeg1.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
        this.setRotateAngle(RightEndoLeg1, -0.045553093477052F, 0.0F, 0.0F);
        this.RightEndoLeg2 = new ModelRenderer(this, 0, 78);
        this.RightEndoLeg2.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.RightEndoLeg2.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(RightEndoLeg2, 0.091106186954104F, 0.0F, 0.0F);
        this.Head2 = new ModelRenderer(this, 0, 56);
        this.Head2.setRotationPoint(0.0F, -5.0F, -3.0F);
        this.Head2.addBox(-0.5F, -3.0F, -1.0F, 1, 3, 2, 0.0F);
        this.RightFingers = new ModelRenderer(this, 22, 24);
        this.RightFingers.setRotationPoint(-1.0F, 2.5F, 0.0F);
        this.RightFingers.addBox(-0.5F, 0.0F, -2.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(RightFingers, 0.0F, 0.0F, -0.18203784098300857F);
        this.LowerJaw1.addChild(this.LowerTeeth1);
        this.Bowtie1.addChild(this.Bowtie2);
        this.Head1.addChild(this.Head4);
        this.UpperJaw1.addChild(this.Nose);
        this.LeftEndoArm2.addChild(this.LeftArm2);
        this.Head1.addChild(this.Head5);
        this.EndoBody.addChild(this.EndoBody2);
        this.UpperJaw1.addChild(this.RightWhiskers);
        this.UpperTeeth1.addChild(this.UpperTeeth2);
        this.Head7.addChild(this.Head8);
        this.LeftShoulder.addChild(this.LeftEndoArm1);
        this.Bowtie1.addChild(this.Bowtie3);
        this.Head1.addChild(this.Head6);
        this.Head9.addChild(this.LeftEar1);
        this.UpperJaw1.addChild(this.UpperJaw2);
        this.LeftEndoArm1.addChild(this.LeftArm1);
        this.Head8.addChild(this.Head9);
        this.Head9.addChild(this.RightEar1);
        this.RightFeet.addChild(this.RightFeetFinger3);
        this.Bowtie1.addChild(this.Bowtie5);
        this.LowerJaw1.addChild(this.LowerJaw2);
        this.RightEndoArm1.addChild(this.RightEndoArm2);
        this.LeftHand.addChild(this.LeftThumb);
        this.Bowtie1.addChild(this.Bowtie4);
        this.LeftEndoLeg1.addChild(this.LeftLeg1);
        this.RightHand.addChild(this.RightThumb);
        this.RightEar2.addChild(this.RightEar3);
        this.Head1.addChild(this.LowerJaw1);
        this.LeftHand.addChild(this.LeftFingers);
        this.RightEndoArm2.addChild(this.RightHand);
        this.RightEndoLeg2.addChild(this.RightLeg2);
        this.LeftEar1.addChild(this.LeftEar2);
        this.LeftEndoLeg1.addChild(this.LeftEndoLeg2);
        this.RightFeet.addChild(this.RightFeetFinger1);
        this.RightEndoLeg1.addChild(this.RightLeg1);
        this.LowerJaw1.addChild(this.LowerTeeth2);
        this.RightEndoArm2.addChild(this.RightArm2);
        this.UpperJaw1.addChild(this.LeftWhiskers);
        this.RightEndoLeg2.addChild(this.RightEndoFeet);
        this.LeftEndoLeg2.addChild(this.LeftLeg2);
        this.Neck.addChild(this.Head1);
        this.Head1.addChild(this.Head3);
        this.Head1.addChild(this.RightEye);
        this.RightEar1.addChild(this.RightEar2);
        this.RightEndoArm1.addChild(this.RightArm1);
        this.EndoBody.addChild(this.Hip1);
        this.Body.addChild(this.Bowtie1);
        this.Hip1.addChild(this.Hip2);
        this.LeftEndoArm2.addChild(this.LeftHand);
        this.EndoBody.addChild(this.Neck);
        this.EndoBody.addChild(this.Body);
        this.LeftEndoArm1.addChild(this.LeftEndoArm2);
        this.Head1.addChild(this.UpperTeeth1);
        this.Head1.addChild(this.Head10);
        this.Head1.addChild(this.LeftEye);
        this.LeftEar2.addChild(this.LeftEar3);
        this.RightFeet.addChild(this.RightFeetFinger2);
        this.LeftEndoLeg2.addChild(this.LeftEndoFeet);
        this.RightEndoFeet.addChild(this.RightFeet);
        this.Head1.addChild(this.UpperJaw1);
        this.RightShoulder.addChild(this.RightEndoArm1);
        this.Head6.addChild(this.Head7);
        this.RightEndoLeg1.addChild(this.RightEndoLeg2);
        this.Head1.addChild(this.Head2);
        this.RightHand.addChild(this.RightFingers);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
     
    	/* Animation Start (Arms) */
    	float prog = 0.1F;
    	
    	
    	this.LeftShoulder.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		this.RightShoulder.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		
    	

		this.LeftShoulder.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.RightShoulder.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    	
		/* Animation Start (Head) */
		
		float prog1 = 0.9F;
		this.Head1.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog1;
		this.Head2.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog1;
		
    	

		this.Head1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.Head2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    	
		this.Head3.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog1;
		this.Head4.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog1;
		
    	

		this.Head3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.Head4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    	
		this.Head5.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog1;
		this.Head6.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog1;
		
    	

		this.Head5.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.Head6.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    	
		this.Head7.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog1;
		this.Head8.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog1;
		
    	

		this.Head7.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.Head8.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    	
		this.Head9.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog1;
		this.Head10.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog1;
		
    	

		this.Head9.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.Head10.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    	
		
    	/* Animation Start (Legs) */
		
		this.LeftEndoLeg1.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		this.RightEndoLeg1.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		
    	

		this.LeftEndoLeg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.RightEndoLeg1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		
		
    	
    	this.LeftShoulder.render(f5);
        this.RightShoulder.render(f5);
        this.LeftEndoLeg1.render(f5);
        this.EndoBody.render(f5);
        this.RightEndoLeg1.render(f5);
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
