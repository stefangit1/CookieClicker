package de.sofamann.clicker.events;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Skull;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerInteract implements Listener {
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		
		Player p = e.getPlayer();
		
		Location loc = p.getLocation();
		
		Sound level_up = Sound.LEVEL_UP;
		
		if(e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			
			if (e.getClickedBlock().getType().equals(Material.SKULL)) {
				
				Skull skull = (Skull) e.getClickedBlock().getState();
			    
			    if (skull.getOwner().equals("QuadratCookie")) {
			    	
			    	p.playSound(loc, level_up, 100, (float) 1.0);
			    	
			    	Inventory inv = Bukkit.createInventory(null, 9*3, "Cookie Clicker");
			    	
			    	ItemStack glass = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
			    	ItemMeta glassmeta = glass.getItemMeta();
			    	glassmeta.setDisplayName("§7");
			    	glass.setItemMeta(glassmeta);
			    	
			    	int slots = 9*3;
			    	
			    	while(slots != 0) {
			    		
			    		slots = slots - 1;
			    		
			    		inv.setItem(slots, glass);
			    		
			    	}
			    	
			    	ItemStack start = new ItemStack(Material.GOLD_PICKAXE);
			    	ItemMeta startmeta = start.getItemMeta();
			    	startmeta.setDisplayName("§7§l» §6§lSTART");
			    	startmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			    	List<String> lore = new ArrayList<>();
			    	lore.add("§7Click to start the game!");
			    	startmeta.setLore(lore);
			    	start.setItemMeta(startmeta);
			    	inv.setItem(13, start);
			    	
			    	p.openInventory(inv);
			    	
			    }
				
			}
				
		}
		
	}

}