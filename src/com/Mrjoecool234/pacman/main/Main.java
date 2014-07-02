package com.Mrjoecool234.pacman.main;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

import com.Mrjoecool234.pacman.armorhandlers.ArmorHandler;
import com.Mrjoecool234.pacman.commands.Commands;
import com.Mrjoecool234.pacman.events.EventHandlers;
import com.Mrjoecool234.pacman.ghosts.ColorChooser;
import com.Mrjoecool234.pacman.playerhandlers.Ghosts;
import com.Mrjoecool234.pacman.playerhandlers.Pacman;
import com.Mrjoecool234.pacman.spawns.GhostSpawn;
import com.Mrjoecool234.pacman.spawns.ItemSpawning;
import com.Mrjoecool234.pacman.spawns.LobbySpawn;
import com.Mrjoecool234.pacman.spawns.PacmanSpawn;
import com.Mrjoecool234.pacman.timers.ScoreboardTimer;
import com.Mrjoecool234.pacman.timers.Timers;

public class Main extends JavaPlugin {
	
	/*
	 * TODO LIST:
	 * 
	 * Pacman Lives
	 * Ghosts Hitting
	 * Teleporting
	 * Special Items
	 * Fix Chat
	 * Pacman Item Picking Up
	 * 
	 * 
	 * */
	
	public Objective o;
	public Scoreboard timerBoard = null;
	public Objective timerObj = null;
	
	public final Logger log = Logger.getLogger("Minecraft");
	
	@Override
	public void onEnable() {
		log.info("Pacman Enabled");
		
		Scoreboard board = Bukkit.getServer().getScoreboardManager().getNewScoreboard();
		 
		o = board.registerNewObjective("timer", "dummy");
		o.setDisplayName(ChatColor.RED + "BeefSuprme" + ChatColor.GRAY + " | " + ChatColor.GOLD + "Pacman");
		o.setDisplaySlot(DisplaySlot.SIDEBAR); 
		 
		this.timerBoard = board;
		this.timerObj = o; 
		
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new GhostSpawn(this), this);
		pm.registerEvents(new LobbySpawn(this), this);
		pm.registerEvents(new PacmanSpawn(this), this);
		pm.registerEvents(new GhostSpawn(this), this);
		pm.registerEvents(new GhostSpawn(this), this);
		pm.registerEvents(new Timers(this), this);
		pm.registerEvents(new EventHandlers(this), this);
		pm.registerEvents(new ItemSpawning(this), this);
		pm.registerEvents(new Pacman(this), this);
		pm.registerEvents(new Ghosts(this), this);
		pm.registerEvents(new ArmorHandler(), this);
		pm.registerEvents(new ScoreboardTimer(this), this);
		pm.registerEvents(new ColorChooser(this), this);
		
		final FileConfiguration config = this.getConfig();
		config.options().copyDefaults(true);
		saveConfig();
		
		getCommand("pacman").setExecutor(new Commands(this));
	}
}
