package com.Mrjoecool234.pacman.spawns;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import com.Mrjoecool234.pacman.main.Main;

public class PacmanSpawn implements Listener {
	
	Main plugin;
	 
	public PacmanSpawn(Main instance) {
	plugin = instance;
	}
	
	public void setpacmanspawn(Player player){
		plugin.getConfig().set("pacman.world", player.getLocation().getWorld().getName());
		plugin.getConfig().set("pacman.x", player.getLocation().getBlockX());
		plugin.getConfig().set("pacman.y", player.getLocation().getBlockY());
		plugin.getConfig().set("pacman.z", player.getLocation().getBlockZ());
		plugin.saveConfig();
 		player.sendMessage("§c[§6Pacman§c]§6 Pacman Spawn Set!");
	}
}
