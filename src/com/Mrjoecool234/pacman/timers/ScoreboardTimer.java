package com.Mrjoecool234.pacman.timers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.scoreboard.Score;

import com.Mrjoecool234.pacman.main.Main;

public class ScoreboardTimer implements Listener {
	
	static int countdown = 121;
	static int taskID4;
	
	static Main plugin;
	
	public ScoreboardTimer(Main instance){
		plugin = instance;
	}
	
	public static void scoreboardtimer(){
		Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
			  public void run(){
				  if(Bukkit.getOnlinePlayers().length == 1) { 
					  for(Player player : Bukkit.getOnlinePlayers() ){
						  player.setScoreboard(plugin.timerBoard);
					  }
			taskID4 = plugin.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
				  public void run() {
				  countdown --; 
				   
				  @SuppressWarnings("deprecation")
				Score score = plugin.o.getScore(Bukkit.getOfflinePlayer(ChatColor.GREEN + "Lobby Time:"));
				  score.setScore(countdown); 
				   
				if(countdown == 0) {
			    plugin.getServer().getScheduler().cancelTask(taskID4);
							}
				  		}
					}, 0L, 20L); 
				 }
			}
		}, 20L);
	}
}
