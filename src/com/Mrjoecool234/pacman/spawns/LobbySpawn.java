package com.Mrjoecool234.pacman.spawns;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import com.Mrjoecool234.pacman.main.Main;

public class LobbySpawn implements Listener {
	
	Main plugin;
	 
	public LobbySpawn(Main instance) {
	plugin = instance;
	}
	
	public void setlobbyspawn(Player player){
		plugin.getConfig().set("lobby.world", player.getLocation().getWorld().getName());
		plugin.getConfig().set("lobby.x", player.getLocation().getBlockX());
		plugin.getConfig().set("lobby.y", player.getLocation().getBlockY());
		plugin.getConfig().set("lobby.z", player.getLocation().getBlockZ());
		plugin.saveConfig();
 		player.sendMessage("§c[§6Pacman§c]§6 Lobby Spawn Set!");
	}
}
