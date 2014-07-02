package com.Mrjoecool234.pacman.livessystem;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import com.Mrjoecool234.pacman.main.Main;

public class PacmanLives implements Listener {
	
	public HashMap<String, Integer> lives = new HashMap<String, Integer>();
	
	public static Integer lifeamnt = 3;
	
	Main plugin;
	
	public PacmanLives(Main instance){
		plugin = instance;
	}
	@EventHandler
	public void Lives(PlayerDeathEvent event){
		Player player = event.getEntity();
		if(lives.containsKey(player.getName())){
			lives.put(player.getName(), lives.get(lifeamnt)-1);
			//player.setHealth(player.getHealth() -1);
		}
	}
}
