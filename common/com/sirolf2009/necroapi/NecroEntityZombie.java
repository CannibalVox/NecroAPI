package com.sirolf2009.necroapi;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

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
        texture = "/mob/zombie.png";
        textureHeight = 64;
    }

    @Override
    public void initRecipes() {
        initDefaultRecipes(Item.rottenFlesh);
    }
}
