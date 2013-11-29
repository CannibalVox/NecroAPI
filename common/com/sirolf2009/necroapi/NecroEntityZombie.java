package com.sirolf2009.necroapi;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

/**
 * An example class
 * 
 * @author sirolf2009
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class NecroEntityZombie extends NecroEntityBiped {

    public NecroEntityZombie() {
        super("Zombie");
        headItem = new ItemStack(Item.skull, 1, 2);
        torsoItem = new ItemStack(Item.rottenFlesh, 1);
        armItem = new ItemStack(Item.rottenFlesh, 1);
        legItem = new ItemStack(Item.rottenFlesh, 1);
        texture = new ResourceLocation("textures/entity/zombie/zombie.png");
        textureHeight = 64;
    }

    @Override
    public void initRecipes() {
        initDefaultRecipes(Item.rottenFlesh);
    }
    
    @Override
	public void setAttributes(EntityLivingBase minion, BodyPartLocation location) {
		if(location == BodyPartLocation.Head) {
			head[0].attributes.func_111150_b(SharedMonsterAttributes.maxHealth).func_111128_a(2.0D); //health
			head[0].attributes.func_111150_b(SharedMonsterAttributes.followRange).func_111128_a(40.0D); //followrange
			head[0].attributes.func_111150_b(SharedMonsterAttributes.knockbackResistance).func_111128_a(0.0D); //knockback res
			head[0].attributes.func_111150_b(SharedMonsterAttributes.movementSpeed).func_111128_a(0.0D); //speed
			head[0].attributes.func_111150_b(SharedMonsterAttributes.attackDamage).func_111128_a(1.0D); //damage
		} else if(location == BodyPartLocation.Torso) {
			torso[0].attributes.func_111150_b(SharedMonsterAttributes.maxHealth).func_111128_a(12.0D); //health
			torso[0].attributes.func_111150_b(SharedMonsterAttributes.followRange).func_111128_a(0.0D); //followrange
			torso[0].attributes.func_111150_b(SharedMonsterAttributes.knockbackResistance).func_111128_a(0.0D); //knockback res
			torso[0].attributes.func_111150_b(SharedMonsterAttributes.movementSpeed).func_111128_a(0.0D); //speed
			torso[0].attributes.func_111150_b(SharedMonsterAttributes.attackDamage).func_111128_a(0.0D); //damage
		} else if(location == BodyPartLocation.ArmLeft) {
			armLeft[0].attributes.func_111150_b(SharedMonsterAttributes.maxHealth).func_111128_a(2.0D); //health
			armLeft[0].attributes.func_111150_b(SharedMonsterAttributes.followRange).func_111128_a(0.0D); //followrange
			armLeft[0].attributes.func_111150_b(SharedMonsterAttributes.knockbackResistance).func_111128_a(0.0D); //knockback res
			armLeft[0].attributes.func_111150_b(SharedMonsterAttributes.movementSpeed).func_111128_a(0.0D); //speed
			armLeft[0].attributes.func_111150_b(SharedMonsterAttributes.attackDamage).func_111128_a(1.0D); //damage
		} else if(location == BodyPartLocation.ArmRight) {
			armRight[0].attributes.func_111150_b(SharedMonsterAttributes.maxHealth).func_111128_a(2.0D); //health
			armRight[0].attributes.func_111150_b(SharedMonsterAttributes.followRange).func_111128_a(0.0D); //followrange
			armRight[0].attributes.func_111150_b(SharedMonsterAttributes.knockbackResistance).func_111128_a(0.0D); //knockback res
			armRight[0].attributes.func_111150_b(SharedMonsterAttributes.movementSpeed).func_111128_a(0.0D); //speed
			armRight[0].attributes.func_111150_b(SharedMonsterAttributes.attackDamage).func_111128_a(1.0D); //damage
		} else if(location == BodyPartLocation.Legs) {
			legs[0].attributes.func_111150_b(SharedMonsterAttributes.maxHealth).func_111128_a(2.0D); //health
			legs[0].attributes.func_111150_b(SharedMonsterAttributes.followRange).func_111128_a(0.0D); //followrange
			legs[0].attributes.func_111150_b(SharedMonsterAttributes.knockbackResistance).func_111128_a(0.0D); //knockback res
			legs[0].attributes.func_111150_b(SharedMonsterAttributes.movementSpeed).func_111128_a(0.23D); //speed
			legs[0].attributes.func_111150_b(SharedMonsterAttributes.attackDamage).func_111128_a(0.0D); //damage
		}
	}
}
