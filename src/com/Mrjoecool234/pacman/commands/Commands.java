package com.Mrjoecool234.pacman.commands;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

import com.Mrjoecool234.pacman.ghosts.ColorChooser;
import com.Mrjoecool234.pacman.livessystem.PacmanLives;
import com.Mrjoecool234.pacman.main.Main;
import com.Mrjoecool234.pacman.playerhandlers.Ghosts;
import com.Mrjoecool234.pacman.spawns.GhostSpawn;
import com.Mrjoecool234.pacman.spawns.LobbySpawn;
import com.Mrjoecool234.pacman.spawns.PacmanSpawn;

public class Commands implements Listener, CommandExecutor {
	
	private static GhostSpawn ghostspawn;
	private static PacmanSpawn pacmanspawn;
	private static LobbySpawn lobbyspawn;
	private static Ghosts ghosts;
	private static ColorChooser chooser;
	private static PacmanLives live;
	
	Main plugin;
	
	public Commands(Main instance) {
	plugin = instance;
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command command, String string, String[] args) {
		Player player = (Player)sender;
		if(command.getName().equalsIgnoreCase("pacman")){
			if(args.length == 1){
				if(args[0].equalsIgnoreCase("setpacmanspawn")){
					pacmanspawn.setpacmanspawn(player);
				}
				if(args[0].equalsIgnoreCase("setghostspawn")){
					ghostspawn.setghostspawn(player);
				}
				if(args[0].equalsIgnoreCase("setlobbyspawn")){
					lobbyspawn.setlobbyspawn(player);
				}
				if(args[0].equalsIgnoreCase("setsteakspawn")){
					player.sendMessage("Block Saved!");
					try {
						@SuppressWarnings("resource")
						String content = new Scanner(new File(plugin.getDataFolder() + "/locations.txt"))
						.useDelimiter("\\Z").next();
						Block block = player.getTargetBlock(null, 10);
						String world = block.getWorld().getName()+ "";
						String x = block.getX() + "";
						String y = block.getY() + "";
						String z = block.getZ() + "";
						String file = world + "/" + x + "/" + y + "/" + z;
						file = file + ":" + content;
					      PrintWriter out = new PrintWriter(plugin.getDataFolder() + "/locations.txt");
					      out.print(file);
					      out.close();
					     } catch (FileNotFoundException e) {
					      e.printStackTrace();
					     }
					}
				if(args[0].equalsIgnoreCase("spawnsteak")){
					spawn();
					}
				}
				if(args[0].equalsIgnoreCase("assignteams")){
					ghosts.chooseghosts();
					
				}
				if(args[0].equalsIgnoreCase("choosecolor")){
					player.openInventory(chooser.inv);
				}
				if(args[0].equalsIgnoreCase("testlivessystem")){
					player.setHealth(3);
					live.lives.put(player.getName(), 3);
				}
			return false;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	public void spawn() {
		 String[] locations = null;
		try {
			locations = new Scanner(new File(plugin.getDataFolder() + "/locations.txt")).useDelimiter("\\Z").next().split(":");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 int x = 0;
		 while(x < locations.length){
		  String[] locationdata = locations[x].split("/");
		  Bukkit.getWorld(locationdata[0]).dropItem(new Location(Bukkit.getWorld(locationdata[0]), Integer.parseInt(locationdata[1]), Integer.parseInt(locationdata[2]), Integer.parseInt(locationdata[3])), new ItemStack(Material.COOKED_BEEF));
		  x++; 
		 }
	}
}
