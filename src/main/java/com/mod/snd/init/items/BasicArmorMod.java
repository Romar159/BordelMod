package com.mod.snd.init.items;

import com.mod.snd.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BasicArmorMod extends ItemArmor {

	public BasicArmorMod(ArmorMaterial material, int type) {
        super(material, 0, type);
    }
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if(slot == 0)
        {
            return Reference.MOD_ID + ":textures/models/armor/chveuxverts.png";
        }
        return Reference.MOD_ID + ":textures/models/armor/chveuxverts.png";
    }
 
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
	 player.addPotionEffect(new PotionEffect(Potion.resistance.id, 60, 0));
	 player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 60, 0));
    }

}
