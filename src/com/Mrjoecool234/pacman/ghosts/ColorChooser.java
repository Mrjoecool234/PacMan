package com.Mrjoecool234.pacman.ghosts;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import com.Mrjoecool234.pacman.main.Main;

public class ColorChooser implements Listener {
	
	public Inventory inv = Bukkit.createInventory(null, 9, "Choose your ghosts Color!");
	
	Main plugin;
	
	public ColorChooser(Main instance){
		plugin = instance;
	}
	public static ItemStack red(){
		ItemStack red = new ItemStack(Material.LEATHER_HELMET);
		LeatherArmorMeta redmeta = (LeatherArmorMeta) red.getItemMeta();
		redmeta.setColor(Color.RED);
		redmeta.setDisplayName("§4Red Ghost!");
		red.setItemMeta(redmeta);
		return red;
	}
	public static ItemStack aqua(){
		ItemStack aqua = new ItemStack(Material.LEATHER_HELMET);
		LeatherArmorMeta aquameta = (LeatherArmorMeta) aqua.getItemMeta();
		aquameta.setColor(Color.AQUA);
		aquameta.setDisplayName("§bAqua Ghost!");
		aqua.setItemMeta(aquameta);
		return aqua;
	}
	public static ItemStack blue(){
		ItemStack blue = new ItemStack(Material.LEATHER_HELMET);
		LeatherArmorMeta bluemeta = (LeatherArmorMeta) blue.getItemMeta();
		bluemeta.setColor(Color.BLUE);
		bluemeta.setDisplayName("§3Blue Ghost!");
		blue.setItemMeta(bluemeta);
		return blue;
	}
	public static ItemStack purple(){
		ItemStack purple = new ItemStack(Material.LEATHER_HELMET);
		LeatherArmorMeta purplemeta = (LeatherArmorMeta) purple.getItemMeta();
		purplemeta.setColor(Color.PURPLE);
		purplemeta.setDisplayName("§5Purple Ghost!");
		purple.setItemMeta(purplemeta);
		return purple;
	}
	public static ItemStack fire(){
		ItemStack fire = new ItemStack(Material.FIRE);
		ItemMeta firemeta = fire.getItemMeta();
		firemeta.setDisplayName("§4Close Menu");
		fire.setItemMeta(firemeta);
		return fire;
	}
}
