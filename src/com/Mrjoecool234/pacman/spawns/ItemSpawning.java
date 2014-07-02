package com.Mrjoecool234.pacman.spawns;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

import com.Mrjoecool234.pacman.main.Main;

public class ItemSpawning implements Listener {
	
	static Main plugin;
	 
	public ItemSpawning(Main instance) {
	plugin = instance;
	}
	
	public static void spawn(){
		 String[] locations = null;
		try {
			locations = new Scanner(new File(plugin.getDataFolder() + "/locations.txt")).useDelimiter("\\Z").next().split(":");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 int x = 0;
		 while(x < locations.length){
		  String[] locationdata = locations[x].split("/");
		  Bukkit.getWorld(locationdata[0]).dropItem(new Location(Bukkit.getWorld(locationdata[0]), Integer.parseInt(locationdata[1]), Integer.parseInt(locationdata[2]), Integer.parseInt(locationdata[3])), new ItemStack(Material.COOKED_BEEF));
		  x++; 
		 }
	}
}
