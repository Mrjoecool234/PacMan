package com.Mrjoecool234.pacman.timers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import com.Mrjoecool234.pacman.armorhandlers.ArmorHandler;
import com.Mrjoecool234.pacman.main.Main;

public class Timers implements Listener {
	
	private static ArmorHandler armor;
	
	
	static Main plugin;
	
	static int taskID1;
	static int taskID2;
	 
	public Timers(Main instance) {
	plugin = instance;
	}
	
	public static int MinutesToCountDown=1;
	public static int SecondsToCountDown=10;
	
	public static Runnable startMinutesCountdown() {
		taskID1 = plugin.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
			  public void run() {
				  MinutesToCountDown--;
				  if (MinutesToCountDown!=0) {
					  Bukkit.broadcastMessage(MinutesToCountDown + " minute(s) left until game starts!");
				  }
				  if (MinutesToCountDown==0) {
				      plugin.getServer().getScheduler().cancelTask(taskID1);
				      MinutesToCountDown=5;
				      startSecondsCountdown();
				  }

			  }
			}, 20*60L, 20*60L);
		return null;
	}
	
	public static Runnable startSecondsCountdown() {
		taskID2 = plugin.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
			  @SuppressWarnings("static-access")
			public void run() {
				  SecondsToCountDown--;
				  if (SecondsToCountDown!=0) {
					  Bukkit.broadcastMessage(SecondsToCountDown + " second(s) left until game starts!");
				  }
				  if (SecondsToCountDown==0) {
				      plugin.getServer().getScheduler().cancelTask(taskID2);
				      SecondsToCountDown=5;
				      Bukkit.broadcastMessage("GAME STARTED!");
				      for(Player player : Bukkit.getOnlinePlayers()){
				    	  if(!armor.chosecolor.contains(player.getName())){
					    	  armor.setblack(player);
				    	  }
				      }
				  	}
			  	}
			}, 20L, 20L);
		return null;
	}
}