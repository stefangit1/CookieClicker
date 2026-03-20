package de.sofamann.clicker.events;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.sofamann.clicker.main.Main;

public class InventoryClick implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		
		Player p = (Player) e.getWhoClicked();
		
		Location loc = p.getLocation();
		
		Sound orb_pickup = Sound.ORB_PICKUP;
		Sound note_bass = Sound.NOTE_BASS;
		Sound level_up = Sound.LEVEL_UP;
		
		ItemStack glass = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
		ItemMeta glassmeta = glass.getItemMeta();
		glassmeta.setDisplayName("§7");
		glass.setItemMeta(glassmeta);
		
		int slots = 9*3;
		
		ItemStack cookie = new ItemStack(Material.COOKIE);
		ItemMeta cookiemeta = cookie.getItemMeta();
		cookiemeta.setDisplayName("§6§lCOOKIE");
		cookiemeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add("§7 §7 §7> Cookies:§6 " + Main.cookies.get(p.getName()));
		lore.add("");
		cookiemeta.setLore(lore);
		cookie.setItemMeta(cookiemeta);
		
		ItemStack anvil = new ItemStack(Material.ANVIL);
		ItemMeta anvilmeta = anvil.getItemMeta();
		anvilmeta.setDisplayName("§5§lUPGRADE");
		anvilmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		List<String> lore2 = new ArrayList<>();
		lore2.add("");
		lore2.add("§7 §7 §7> Kosten:§5 " + Main.multiplierCost.get(p.getName()));
		lore2.add("§7 §7 §7> Multiplikator:§5 " + Main.multiplier.get(p.getName()));
		lore2.add("");
		anvilmeta.setLore(lore2);
		anvil.setItemMeta(anvilmeta);
		
		if(e.getCurrentItem() == null) return;
		
		if(e.getInventory().getType().equals(InventoryType.PLAYER)) {
			
			e.setCancelled(false);
			
		} else {
			
			e.setCancelled(true);
			
		}
		
		if(e.getCurrentItem().getItemMeta().getDisplayName() == "§7§l» §6§lSTART") {
			
			p.playSound(loc, orb_pickup, 100, (float) 1.0);
			
			Inventory inv = Bukkit.createInventory(null, 9*3, "Cookie Clicker");
			
			while(slots != 0) {
				
				slots = slots - 1;
				inv.setItem(slots, glass);
				
			}
			
			inv.setItem(13, cookie);
			inv.setItem(16, anvil);
			p.openInventory(inv);
			
		} else if(e.getCurrentItem().getItemMeta().getDisplayName() == "§6§lCOOKIE") {
			
			p.playSound(loc, orb_pickup, 100, (float) 1.0);
			Main.cookies.put(p.getName(), Main.cookies.get(p.getName()) + Main.multiplier.get(p.getName()));
			
			Inventory inv = Bukkit.createInventory(null, 9*3, "Cookie Clicker");
			
			while(slots != 0) {
				
				slots = slots - 1;
				
				inv.setItem(slots, glass);
				
			}
			
			inv.setItem(13, cookie);
			inv.setItem(16, anvil);
			p.openInventory(inv);
			
		} else if(e.getCurrentItem().getItemMeta().getDisplayName() == "§5§lUPGRADE") {
			
			if(Main.multiplierCost.get(p.getName()) <= Main.cookies.get(p.getName())) {
				
				p.playSound(loc, level_up, 100, (float) 1.0);
				Main.cookies.put(p.getName(), Main.cookies.get(p.getName()) - Main.multiplierCost.get(p.getName()));
				Main.multiplier.put(p.getName(), Main.multiplier.get(p.getName()) + 1);
				Main.multiplierCost.put(p.getName(), Main.multiplierCost.get(p.getName()) * 2);
				
				Inventory inv = Bukkit.createInventory(null, 9*3, "Cookie Clicker");
				
				while(slots != 0) {
					
					slots = slots - 1;
					inv.setItem(slots, glass);
					
				}
				
				ItemStack cookie2 = new ItemStack(Material.COOKIE);
				ItemMeta cookiemeta2 = cookie2.getItemMeta();
				cookiemeta2.setDisplayName("§6§lCOOKIE");
				cookiemeta2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				List<String> lore1 = new ArrayList<>();
				lore1.add("");
				lore1.add("§7 §7 §7> Cookies:§6 " + Main.cookies.get(p.getName()));
				lore1.add("");
				cookiemeta2.setLore(lore1);
				cookie2.setItemMeta(cookiemeta2);
				
				ItemStack anvil2 = new ItemStack(Material.ANVIL);
				ItemMeta anvilmeta2 = anvil2.getItemMeta();
				anvilmeta2.setDisplayName("§5§lUPGRADE");
				anvilmeta2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				List<String> lore3 = new ArrayList<>();
				lore3.add("");
				lore3.add("§7 §7 §7> Kosten:§5 " + Main.multiplierCost.get(p.getName()));
				lore3.add("§7 §7 §7> Multiplikator:§5 " + Main.multiplier.get(p.getName()));
				lore3.add("");
				anvilmeta2.setLore(lore3);
				anvil2.setItemMeta(anvilmeta2);
				
				inv.setItem(13, cookie2);
				inv.setItem(16, anvil2);
				p.openInventory(inv);
				
			} else {
				
				p.playSound(loc, note_bass, 100, (float) 1.0);
				
			}
			
		}
		
	}

}