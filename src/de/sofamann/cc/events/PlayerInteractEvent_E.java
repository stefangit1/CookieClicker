package de.sofamann.cc.events;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerInteractEvent_E implements Listener {
	
	int anzahlCookies;
	int anzahlKosten;
	int anzahlMultiplier;
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getAction().equals(Action.LEFT_CLICK_BLOCK) || e.getAction().equals(Action.LEFT_CLICK_AIR)) {
			
			if(e.getClickedBlock().getType() == null) return;
			
		} else if(e.getClickedBlock().getType().equals(Material.SKULL)) {
			
			Location loc = p.getLocation();
			Sound sound = Sound.ORB_PICKUP;
			p.playSound(loc, sound, 100, (float) 1.0);
			
			Inventory inv = Bukkit.createInventory(null, 9 * 3, "§7Cookie Clicker");
			
			ItemStack itemstack4 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 7);
			ItemMeta itemmeta4 = itemstack4.getItemMeta();
			itemmeta4.setDisplayName("§7");
			itemstack4.setItemMeta(itemmeta4);
			
			ItemStack itemstack3 = new ItemStack(Material.REDSTONE_COMPARATOR);
			ItemMeta itemmeta3 = itemstack3.getItemMeta();
			itemmeta3.setDisplayName("§7§l>> §a§lEINSTELLUNGEN");
			ArrayList<String> lore3 = new ArrayList<String>();
			lore3.add("");
			lore3.add("§7 §7 §7> Klicke um die Einstellungen zu öffnen!");
			lore3.add("");
			itemmeta3.setLore(lore3);
			itemstack3.setItemMeta(itemmeta3);
			inv.setItem(11, itemstack3);
			
			ItemStack itemstack = new ItemStack(Material.GOLD_PICKAXE);
			ItemMeta itemmeta = itemstack.getItemMeta();
			itemmeta.setDisplayName("§7§l>> §a§lSPIEL STARTEN");
			ArrayList<String> lore = new ArrayList<String>();
			lore.add("");
			lore.add("§7 §7 §7> Klicke um weiterzuspielen!");
			lore.add("");
			itemmeta.setLore(lore);
			itemstack.setItemMeta(itemmeta);
			inv.setItem(13, itemstack);
			
			ItemStack itemstack2 = new ItemStack(Material.COMPASS);
			ItemMeta itemmeta2 = itemstack2.getItemMeta();
			itemmeta2.setDisplayName("§7§l>> §a§lSPIEL NEUSTARTEN");
			ArrayList<String> lore2 = new ArrayList<String>();
			lore2.add("");
			lore2.add("§7 §7 §7> Klicke um alle deine Spielstände zu löschen!");
			lore2.add("");
			itemmeta2.setLore(lore2);
			itemstack2.setItemMeta(itemmeta2);
			inv.setItem(15, itemstack2);
			
			inv.setItem(0, itemstack4);
			inv.setItem(1, itemstack4);
			inv.setItem(2, itemstack4);
			inv.setItem(3, itemstack4);
			inv.setItem(4, itemstack4);
			inv.setItem(5, itemstack4);
			inv.setItem(6, itemstack4);
			inv.setItem(7, itemstack4);
			inv.setItem(8, itemstack4);
			inv.setItem(9, itemstack4);
			inv.setItem(10, itemstack4);
			inv.setItem(12, itemstack4);
			inv.setItem(14, itemstack4);
			inv.setItem(16, itemstack4);
			inv.setItem(17, itemstack4);
			inv.setItem(18, itemstack4);
			inv.setItem(19, itemstack4);
			inv.setItem(20, itemstack4);
			inv.setItem(21, itemstack4);
			inv.setItem(22, itemstack4);
			inv.setItem(23, itemstack4);
			inv.setItem(24, itemstack4);
			inv.setItem(25, itemstack4);
			inv.setItem(26, itemstack4);
			
			
			p.openInventory(inv);
		}
	}

}