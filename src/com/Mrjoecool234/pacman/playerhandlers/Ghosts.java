package com.Mrjoecool234.pacman.playerhandlers;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import com.Mrjoecool234.pacman.main.Main;

public class Ghosts implements Listener {
	
	public static Player pacman;
	
	public static HashMap<Player, Boolean> map = new HashMap<Player, Boolean>();
	
	Main plugin;
	 
	public Ghosts(Main instance) {
	plugin = instance;
	}
	
	public void chooseghosts(){
		int x = 0;
		Player[] players = Bukkit.getOnlinePlayers();
		while(x < players.length){
			map.put(players[x], false);
			x++;
		}
		map.remove(pacman);
	}
	
}
