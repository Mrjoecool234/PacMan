package com.Mrjoecool234.pacman.armorhandlers;

import java.util.ArrayList;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ArmorHandler implements Listener {
	
	public static ArrayList<String> chosecolor = new ArrayList<String>();
	
	public static void assignplayercolor(Player player, Color color){
		ItemStack pacmanhelm = new ItemStack(Material.LEATHER_HELMET);
        ItemStack pacmanchest = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemStack pacmanlegs = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemStack pacmanboots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta pacmanhelmmeta = (LeatherArmorMeta) pacmanhelm.getItemMeta();
        LeatherArmorMeta pacmanchestmeta = (LeatherArmorMeta) pacmanchest.getItemMeta();
        LeatherArmorMeta pacmanlegsmeta = (LeatherArmorMeta) pacmanlegs.getItemMeta();
        LeatherArmorMeta pacmanbootsmeta = (LeatherArmorMeta) pacmanboots.getItemMeta();
        pacmanhelmmeta.setColor(color);
        pacmanchestmeta.setColor(color);
        pacmanlegsmeta.setColor(color);
        pacmanbootsmeta.setColor(color);
        pacmanhelm.setItemMeta(pacmanhelmmeta);
        pacmanchest.setItemMeta(pacmanchestmeta);
        pacmanlegs.setItemMeta(pacmanlegsmeta);
        pacmanboots.setItemMeta(pacmanbootsmeta);
        player.getInventory().clear();
        player.getInventory().setHelmet(pacmanhelm);
        player.getInventory().setChestplate(pacmanchest);
        player.getInventory().setLeggings(pacmanlegs);
        player.getInventory().setBoots(pacmanboots);
	}
	public static void setaqua(Player player){
		chosecolor.add(player.getName());
		ItemStack aquahelm = new ItemStack(Material.LEATHER_HELMET);
        ItemStack aquachest = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemStack aqualegs = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemStack aquaboots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta aquahelmmeta = (LeatherArmorMeta) aquahelm.getItemMeta();
        LeatherArmorMeta aquachestmeta = (LeatherArmorMeta) aquachest.getItemMeta();
        LeatherArmorMeta aqualegsmeta = (LeatherArmorMeta) aqualegs.getItemMeta();
        LeatherArmorMeta aquabootsmeta = (LeatherArmorMeta) aquaboots.getItemMeta();
        aquahelmmeta.setColor(Color.AQUA);
        aquachestmeta.setColor(Color.AQUA);
        aqualegsmeta.setColor(Color.AQUA);
        aquabootsmeta.setColor(Color.AQUA);
        aquahelm.setItemMeta(aquahelmmeta);
        aquachest.setItemMeta(aquachestmeta);
        aqualegs.setItemMeta(aqualegsmeta);
        aquaboots.setItemMeta(aquabootsmeta);
        //player.getInventory().clear();
        player.getInventory().setHelmet(aquahelm);
        player.getInventory().setChestplate(aquachest);
        player.getInventory().setLeggings(aqualegs);
        player.getInventory().setBoots(aquaboots);
	}
	public static void setred(Player player){
		chosecolor.add(player.getName());
		ItemStack redhelm = new ItemStack(Material.LEATHER_HELMET);
        ItemStack redchest = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemStack redlegs = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemStack redboots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta redhelmmeta = (LeatherArmorMeta) redhelm.getItemMeta();
        LeatherArmorMeta redchestmeta = (LeatherArmorMeta) redchest.getItemMeta();
        LeatherArmorMeta redlegsmeta = (LeatherArmorMeta) redlegs.getItemMeta();
        LeatherArmorMeta redbootsmeta = (LeatherArmorMeta) redboots.getItemMeta();
        redhelmmeta.setColor(Color.RED);
        redchestmeta.setColor(Color.RED);
        redlegsmeta.setColor(Color.RED);
        redbootsmeta.setColor(Color.RED);
        redhelm.setItemMeta(redhelmmeta);
        redchest.setItemMeta(redchestmeta);
        redlegs.setItemMeta(redlegsmeta);
        redboots.setItemMeta(redbootsmeta);
        //player.getInventory().clear();
        player.getInventory().setHelmet(redhelm);
        player.getInventory().setChestplate(redchest);
        player.getInventory().setLeggings(redlegs);
        player.getInventory().setBoots(redboots);
	}
	public static void setblue(Player player){
		chosecolor.add(player.getName());
		ItemStack bluehelm = new ItemStack(Material.LEATHER_HELMET);
        ItemStack bluechest = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemStack bluelegs = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemStack blueboots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta bluehelmmeta = (LeatherArmorMeta) bluehelm.getItemMeta();
        LeatherArmorMeta bluechestmeta = (LeatherArmorMeta) bluechest.getItemMeta();
        LeatherArmorMeta bluelegsmeta = (LeatherArmorMeta) bluelegs.getItemMeta();
        LeatherArmorMeta bluebootsmeta = (LeatherArmorMeta) blueboots.getItemMeta();
        bluehelmmeta.setColor(Color.BLUE);
        bluechestmeta.setColor(Color.BLUE);
        bluelegsmeta.setColor(Color.BLUE);
        bluebootsmeta.setColor(Color.BLUE);
        bluehelm.setItemMeta(bluehelmmeta);
        bluechest.setItemMeta(bluechestmeta);
        bluelegs.setItemMeta(bluelegsmeta);
        blueboots.setItemMeta(bluebootsmeta);
        //player.getInventory().clear();
        player.getInventory().setHelmet(bluehelm);
        player.getInventory().setChestplate(bluechest);
        player.getInventory().setLeggings(bluelegs);
        player.getInventory().setBoots(blueboots);
	}
	public static void setpurple(Player player){
		chosecolor.add(player.getName());
		ItemStack purplehelm = new ItemStack(Material.LEATHER_HELMET);
        ItemStack purplechest = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemStack purplelegs = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemStack purpleboots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta purplehelmmeta = (LeatherArmorMeta) purplehelm.getItemMeta();
        LeatherArmorMeta purplechestmeta = (LeatherArmorMeta) purplechest.getItemMeta();
        LeatherArmorMeta purplelegsmeta = (LeatherArmorMeta) purplelegs.getItemMeta();
        LeatherArmorMeta purplebootsmeta = (LeatherArmorMeta) purpleboots.getItemMeta();
        purplehelmmeta.setColor(Color.PURPLE);
        purplechestmeta.setColor(Color.PURPLE);
        purplelegsmeta.setColor(Color.PURPLE);
        purplebootsmeta.setColor(Color.PURPLE);
        purplehelm.setItemMeta(purplehelmmeta);
        purplechest.setItemMeta(purplechestmeta);
        purplelegs.setItemMeta(purplelegsmeta);
        purpleboots.setItemMeta(purplebootsmeta);
       // player.getInventory().clear();
        player.getInventory().setHelmet(purplehelm);
        player.getInventory().setChestplate(purplechest);
        player.getInventory().setLeggings(purplelegs);
        player.getInventory().setBoots(purpleboots);
	}
	public void setblack(Player player){
		ItemStack blackhelm = new ItemStack(Material.LEATHER_HELMET);
        ItemStack blackchest = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemStack blacklegs = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemStack blackboots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta blackhelmmeta = (LeatherArmorMeta) blackhelm.getItemMeta();
        LeatherArmorMeta blackchestmeta = (LeatherArmorMeta) blackchest.getItemMeta();
        LeatherArmorMeta blacklegsmeta = (LeatherArmorMeta) blacklegs.getItemMeta();
        LeatherArmorMeta blackbootsmeta = (LeatherArmorMeta) blackboots.getItemMeta();
        blackhelmmeta.setColor(Color.BLACK);
        blackchestmeta.setColor(Color.BLACK);
        blacklegsmeta.setColor(Color.BLACK);
        blackbootsmeta.setColor(Color.BLACK);
        blackhelm.setItemMeta(blackhelmmeta);
        blackchest.setItemMeta(blackchestmeta);
        blacklegs.setItemMeta(blacklegsmeta);
        blackboots.setItemMeta(blackbootsmeta);
       // player.getInventory().clear();
        player.getInventory().setHelmet(blackhelm);
        player.getInventory().setChestplate(blackchest);
        player.getInventory().setLeggings(blacklegs);
        player.getInventory().setBoots(blackboots);
	}
}
