package com.Mrjoecool234.pacman.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.Mrjoecool234.pacman.armorhandlers.ArmorHandler;
import com.Mrjoecool234.pacman.ghosts.ColorChooser;
import com.Mrjoecool234.pacman.main.Main;
import com.Mrjoecool234.pacman.timers.ScoreboardTimer;
import com.Mrjoecool234.pacman.timers.Timers;

public class EventHandlers implements Listener {
	
	private static Timers timer;
	private static ColorChooser chooser;
	private static ArmorHandler armor;
	private static ScoreboardTimer scoreboard;
	
	Main plugin;
	 
	public EventHandlers(Main instance) {
	plugin = instance;
	}
	@SuppressWarnings("static-access")
	@EventHandler
	public void pjoin(PlayerJoinEvent event) {
		timer.startMinutesCountdown();
		Bukkit.broadcastMessage(timer.MinutesToCountDown + " minute(s) left until game starts!");
		scoreboard.scoreboardtimer();
	}
	@SuppressWarnings("static-access")
	@EventHandler
	public void onClick(InventoryClickEvent event){
		Player player = (Player) event.getWhoClicked();
		ItemStack click = event.getCurrentItem();
		Inventory inventory = event.getInventory();
		if(inventory.getName() == chooser.inv.getName()){
			if(click.getItemMeta().getDisplayName().equals("§bAqua Ghost!")){
				event.setCancelled(true);
				armor.setaqua(player);
			}
			if(click.getItemMeta().getDisplayName().equals("§3Blue Ghost!")){
				event.setCancelled(true);
				armor.setblue(player);
			}
			if(click.getItemMeta().getDisplayName().equals("§5Purple Ghost!")){
				event.setCancelled(true);
				armor.setpurple(player);
			}
			if(click.getItemMeta().getDisplayName().equals("§4Red Ghost!")){
				event.setCancelled(true);
				armor.setred(player);
			}
		}
	}
	@SuppressWarnings("static-access")
	@EventHandler
	public void onInteract(PlayerInteractEvent event){
		Player player = event.getPlayer();
		if(event.getAction().equals(Action.RIGHT_CLICK_AIR)){
			if(player.getItemInHand().getType() == Material.WOOL){
				chooser.inv.setItem(0, chooser.red());
				chooser.inv.setItem(1, chooser.aqua());
				chooser.inv.setItem(2, chooser.purple());
				chooser.inv.setItem(3, chooser.blue());
				chooser.inv.setItem(8, chooser.fire());
				player.openInventory(chooser.inv);
			}
		}
	}
}
