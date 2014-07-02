package com.Mrjoecool234.signs;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

import com.Mrjoecool234.pacman.main.Main;

public class SignHandler implements Listener {
	
	Main plugin;
	
	public void SignsHandlers(Main instance) {
	plugin = instance;
	}
	
	@EventHandler
	public void onSign(SignChangeEvent event){
		if(event.getLine(0).equalsIgnoreCase("[Pacman]")){
			event.setLine(0, "§c[§6Pacman§c]");
		}
	}
}
