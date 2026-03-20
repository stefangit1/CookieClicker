package de.sofamann.cc.events;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InventoryClickEvent_E implements Listener {
	
	int anzahlCookies = 0;
	int anzahlMultiplier = 1;
	int anzahlKosten = 100;
	
	//CookieCounter
	//Multiplier
	//Kosten für Multiplier
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		
		Player p = (Player) e.getWhoClicked();
		Inventory inv = Bukkit.createInventory(null, 9 * 3, "§7Cookie Clicker");
		
		if(p.getOpenInventory().getTitle().equals("§7Cookie Clicker")) {
			
			e.setCancelled(true);
	
		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§7§l>> §a§lSPIEL STARTEN")) {
			
			Location loc = p.getLocation();
			Sound sound = Sound.NOTE_PLING;
			p.playSound(loc, sound, 100, (float) 1.0);
			
			ItemStack itemstack3 = new ItemStack(Material.COOKIE);
			ItemMeta itemmeta3 = itemstack3.getItemMeta();
			itemmeta3.setDisplayName("§7§l>> §6§lCOOKIE");
			ArrayList<String> lore3 = new ArrayList<String>();
			lore3.add("");
			lore3.add("§7 §7 §7> Cookies:§6 "+anzahlCookies);
			lore3.add("");
			itemmeta3.setLore(lore3);
			itemstack3.setItemMeta(itemmeta3);
			inv.setItem(13, itemstack3);
			
			ItemStack itemstack4 = new ItemStack(Material.ANVIL);
			ItemMeta itemmeta4 = itemstack4.getItemMeta();
			itemmeta4.setDisplayName("§7§l>> §5§lUPGRADE");
			ArrayList<String> lore4 = new ArrayList<String>();
			lore4.add("");
			lore4.add("§7 §7 §7> Kosten:§5 "+anzahlKosten);
			lore4.add("§7 §7 §7> Multiplikator:§5 "+anzahlMultiplier);
			lore4.add("");
			itemmeta4.setLore(lore4);
			itemstack4.setItemMeta(itemmeta4);
			inv.setItem(15, itemstack4);
			
			ItemStack itemstack5 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 7);
			ItemMeta itemmeta5 = itemstack5.getItemMeta();
			itemmeta5.setDisplayName("§7");
			itemstack5.setItemMeta(itemmeta5);
			
			inv.setItem(0, itemstack5);
			inv.setItem(1, itemstack5);
			inv.setItem(2, itemstack5);
			inv.setItem(3, itemstack5);
			inv.setItem(4, itemstack5);
			inv.setItem(5, itemstack5);
			inv.setItem(6, itemstack5);
			inv.setItem(7, itemstack5);
			inv.setItem(8, itemstack5);
			inv.setItem(9, itemstack5);
			inv.setItem(10, itemstack5);
			inv.setItem(12, itemstack5);
			inv.setItem(14, itemstack5);
			inv.setItem(16, itemstack5);
			inv.setItem(17, itemstack5);
			inv.setItem(18, itemstack5);
			inv.setItem(19, itemstack5);
			inv.setItem(20, itemstack5);
			inv.setItem(21, itemstack5);
			inv.setItem(22, itemstack5);
			inv.setItem(23, itemstack5);
			inv.setItem(24, itemstack5);
			inv.setItem(25, itemstack5);
			inv.setItem(26, itemstack5);
			
			p.openInventory(inv);
			
		} else if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§7§l>> §a§lSPIEL NEUSTARTEN")) {
			
			if(p.hasPermission("cc.restart")) {
			
			anzahlCookies = 0;
			anzahlMultiplier = 1;
			anzahlKosten = 100;
			
			Location loc = p.getLocation();
			Sound sound = Sound.ANVIL_BREAK;
			p.playSound(loc, sound, 100, (float) 1.0);
			
			p.sendMessage("§7[§6§lCC§7] Spiel erfolgreich neugestartet!");
			
			} else {
				
				Location loc = p.getLocation();
				Sound sound = Sound.NOTE_BASS;
				p.playSound(loc, sound, 100, (float) 1.0);
				
				e.setCancelled(true);
				p.sendMessage("§7[§6§lCC§7] Dazu hast du keine Rechte!");
				
			}
			
		} else if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§7§l>> §a§lEINSTELLUNGEN")) {
			
			ItemStack itemstack5 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 7);
			ItemMeta itemmeta5 = itemstack5.getItemMeta();
			itemmeta5.setDisplayName("§7");
			itemstack5.setItemMeta(itemmeta5);
			
			inv.setItem(0, itemstack5);
			inv.setItem(1, itemstack5);
			inv.setItem(2, itemstack5);
			inv.setItem(3, itemstack5);
			inv.setItem(4, itemstack5);
			inv.setItem(5, itemstack5);
			inv.setItem(6, itemstack5);
			inv.setItem(7, itemstack5);
			inv.setItem(8, itemstack5);
			inv.setItem(9, itemstack5);
			inv.setItem(10, itemstack5);
			inv.setItem(12, itemstack5);
			inv.setItem(14, itemstack5);
			inv.setItem(16, itemstack5);
			inv.setItem(17, itemstack5);
			inv.setItem(18, itemstack5);
			inv.setItem(19, itemstack5);
			inv.setItem(20, itemstack5);
			inv.setItem(21, itemstack5);
			inv.setItem(22, itemstack5);
			inv.setItem(23, itemstack5);
			inv.setItem(24, itemstack5);
			inv.setItem(25, itemstack5);
			inv.setItem(26, itemstack5);
			
			Location loc = p.getLocation();
			Sound sound = Sound.CHEST_OPEN;
			p.playSound(loc, sound, 100, (float) 1.0);
			
			p.openInventory(inv);
			
		}
			
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§7§l>> §6§lCOOKIE")) {
			anzahlCookies += anzahlMultiplier;
			
			Location loc = p.getLocation();
			Sound sound = Sound.ITEM_PICKUP;
			p.playSound(loc, sound, 100, (float) 1.0);
			
			ItemStack itemstack = new ItemStack(Material.COOKIE);
			ItemMeta itemmeta = itemstack.getItemMeta();
			itemmeta.setDisplayName("§7§l>> §6§lCOOKIE");
			ArrayList<String> lore = new ArrayList<String>();
			lore.add("");
			lore.add("§7 §7 §7> Cookies:§6 "+anzahlCookies);
			lore.add("");
			itemmeta.setLore(lore);
			itemstack.setItemMeta(itemmeta);
			inv.setItem(13, itemstack);
			
			ItemStack itemstack2 = new ItemStack(Material.ANVIL);
			ItemMeta itemmeta2 = itemstack2.getItemMeta();
			itemmeta2.setDisplayName("§7§l>> §5§lUPGRADE");
			ArrayList<String> lore2 = new ArrayList<String>();
			lore2.add("");
			lore2.add("§7 §7 §7> Kosten:§5 "+anzahlKosten);
			lore2.add("§7 §7 §7> Multiplikator:§5 "+anzahlMultiplier);
			lore2.add("");
			itemmeta2.setLore(lore2);
			itemstack2.setItemMeta(itemmeta2);
			inv.setItem(15, itemstack2);
			
			ItemStack itemstack5 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 7);
			ItemMeta itemmeta5 = itemstack5.getItemMeta();
			itemmeta5.setDisplayName("§7");
			itemstack5.setItemMeta(itemmeta5);
			
			inv.setItem(0, itemstack5);
			inv.setItem(1, itemstack5);
			inv.setItem(2, itemstack5);
			inv.setItem(3, itemstack5);
			inv.setItem(4, itemstack5);
			inv.setItem(5, itemstack5);
			inv.setItem(6, itemstack5);
			inv.setItem(7, itemstack5);
			inv.setItem(8, itemstack5);
			inv.setItem(9, itemstack5);
			inv.setItem(10, itemstack5);
			inv.setItem(12, itemstack5);
			inv.setItem(14, itemstack5);
			inv.setItem(16, itemstack5);
			inv.setItem(17, itemstack5);
			inv.setItem(18, itemstack5);
			inv.setItem(19, itemstack5);
			inv.setItem(20, itemstack5);
			inv.setItem(21, itemstack5);
			inv.setItem(22, itemstack5);
			inv.setItem(23, itemstack5);
			inv.setItem(24, itemstack5);
			inv.setItem(25, itemstack5);
			inv.setItem(26, itemstack5);
			
			p.openInventory(inv);

		} else if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§7§l>> §5§lUPGRADE")) {
			if(anzahlCookies >= anzahlKosten) {
				
				anzahlCookies -= anzahlKosten;
				anzahlMultiplier += 1;
				anzahlKosten += anzahlMultiplier * 200;
				
				Location loc = p.getLocation();
				Sound sound = Sound.LEVEL_UP;
				p.playSound(loc, sound, 100, (float) 1.0);
				
				ItemStack itemstack = new ItemStack(Material.COOKIE);
				ItemMeta itemmeta = itemstack.getItemMeta();
				itemmeta.setDisplayName("§7§l>> §6§lCOOKIE");
				ArrayList<String> lore = new ArrayList<String>();
				lore.add("");
				lore.add("§7 §7 §7> Cookies:§6 "+anzahlCookies);
				lore.add("");
				itemmeta.setLore(lore);
				itemstack.setItemMeta(itemmeta);
				inv.setItem(13, itemstack);
				
				ItemStack itemstack2 = new ItemStack(Material.ANVIL);
				ItemMeta itemmeta2 = itemstack2.getItemMeta();
				itemmeta2.setDisplayName("§7§l>> §5§lUPGRADE");
				ArrayList<String> lore2 = new ArrayList<String>();
				lore2.add("");
				lore2.add("§7 §7 §7> Kosten:§5 "+anzahlKosten);
				lore2.add("§7 §7 §7> Multiplikator:§5 "+anzahlMultiplier);
				lore2.add("");
				itemmeta2.setLore(lore2);
				itemstack2.setItemMeta(itemmeta2);
				inv.setItem(15, itemstack2);
				
				ItemStack itemstack5 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 7);
				ItemMeta itemmeta5 = itemstack5.getItemMeta();
				itemmeta5.setDisplayName("§7");
				itemstack5.setItemMeta(itemmeta5);
				
				inv.setItem(0, itemstack5);
				inv.setItem(1, itemstack5);
				inv.setItem(2, itemstack5);
				inv.setItem(3, itemstack5);
				inv.setItem(4, itemstack5);
				inv.setItem(5, itemstack5);
				inv.setItem(6, itemstack5);
				inv.setItem(7, itemstack5);
				inv.setItem(8, itemstack5);
				inv.setItem(9, itemstack5);
				inv.setItem(10, itemstack5);
				inv.setItem(12, itemstack5);
				inv.setItem(14, itemstack5);
				inv.setItem(16, itemstack5);
				inv.setItem(17, itemstack5);
				inv.setItem(18, itemstack5);
				inv.setItem(19, itemstack5);
				inv.setItem(20, itemstack5);
				inv.setItem(21, itemstack5);
				inv.setItem(22, itemstack5);
				inv.setItem(23, itemstack5);
				inv.setItem(24, itemstack5);
				inv.setItem(25, itemstack5);
				inv.setItem(26, itemstack5);
				
				p.openInventory(inv);
				
			} else {
				
				Location loc = p.getLocation();
				Sound sound = Sound.NOTE_BASS;
				p.playSound(loc, sound, 100, (float) 1.0);
				
				p.sendMessage("§7[§6§lCC§7] Nicht genügend Cookies!");
				
				}
			} 
			
		}

	} 

}