package com.Mrjoecool234.pacman.playerhandlers;

import java.util.HashMap;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import com.Mrjoecool234.pacman.main.Main;

public class Pacman implements Listener {
	
	public static HashMap<Integer, Boolean> man = new HashMap<Integer, Boolean>();
	
	Main plugin;
	 
	public Pacman(Main instance) {
	plugin = instance;
	}
	
	public static Player choosepacman(){
		Random random = new Random();
		random.nextInt(Bukkit.getOnlinePlayers().length);
		return Bukkit.getOnlinePlayers()[random.nextInt(Bukkit.getOnlinePlayers().length)];
	}
	
}
