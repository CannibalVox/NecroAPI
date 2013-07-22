package com.sirolf2009.necroapi;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class BodyPart extends ModelRenderer {

    /**
     * The base constructor for {@link BodyPart}s, call this if you are creating arms
     * or heads
     * @param base
     * @param par1ModelBase
     * @param textureXOffset
     * @param textureYOffset
     */
    public BodyPart(NecroEntityBase base, ModelBase par1ModelBase, int textureXOffset, int textureYOffset) {
        super(par1ModelBase, textureXOffset, textureYOffset);
        entity = base;
        name = base.mobName;
        textureHeight = base.textureHeight;
        textureWidth = base.textureWidth;
    }
    
    /**
     * Set the {@link BodyPart}'s attributes
     * @param health
     * @param followRange
     * @param knockbackResistance
     * @param moveSpeed
     * @param attackStrength
     * @return this
     */
    public BodyPart setAttributes(double health, double followRange, double knockbackResistance, double moveSpeed, double attackStrength) {
        this.health = health;
        this.followRange = followRange;
        this.knockbackResistance = knockbackResistance;
        this.moveSpeed = moveSpeed;
        this.attackStrength = attackStrength;
        return this;
    }

    public String name;
    public NecroEntityBase entity;
    public double health = 20.0D / 6D;
    public double followRange = 32.0D / 6D;
    public double knockbackResistance = 0.0D;
    public double moveSpeed = 0.699D / 6D;
    public double attackStrength = 2.0D / 6D;

    /**
     * Call this if you are creating legs
     * @param base
     * @param torsoPos
     * @param par1ModelBase
     * @param textureXOffset
     * @param textureYOffset
     */
    public BodyPart(NecroEntityBase base, float torsoPos[], ModelBase par1ModelBase, int textureXOffset, int textureYOffset) {
        this(base, par1ModelBase, textureXOffset, textureYOffset);
        this.torsoPos = torsoPos;
    }

    public float torsoPos[];

    /**
     * Call this if you are creating torso's
     * @param base
     * @param armLeftPos
     * @param armRightPos
     * @param headPos
     * @param par1ModelBase
     * @param textureXOffset
     * @param textureYOffset
     */
    public BodyPart(NecroEntityBase base, float armLeftPos[], float armRightPos[], float headPos[], ModelBase par1ModelBase, int textureXOffset, int textureYOffset) {
        this(base, par1ModelBase, textureXOffset, textureYOffset);
        this.armLeftPos = armLeftPos;
        this.armRightPos = armRightPos;
        this.headPos = headPos;
    }

    public float armLeftPos[];
    public float armRightPos[];
    public float headPos[];
}
