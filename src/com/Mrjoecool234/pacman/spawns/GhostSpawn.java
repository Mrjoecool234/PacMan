package com.Mrjoecool234.pacman.spawns;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import com.Mrjoecool234.pacman.main.Main;

public class GhostSpawn implements Listener {
	
	Main plugin;
	 
	public GhostSpawn(Main instance) {
	plugin = instance;
	}
	
	public void setghostspawn(Player player){
		plugin.getConfig().set("ghost.world", player.getLocation().getWorld().getName());
		plugin.getConfig().set("ghost.x", player.getLocation().getBlockX());
		plugin.getConfig().set("ghost.y", player.getLocation().getBlockY());
		plugin.getConfig().set("ghost.z", player.getLocation().getBlockZ());
		plugin.saveConfig();
 		player.sendMessage("§c[§6Pacman§c]§6 Ghost Spawn Set!");
	}
}
