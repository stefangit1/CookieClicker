package de.sofamann.cc.events;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakEvent_E implements Listener {
	
	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getBlock().getType() == Material.SKULL) {
			
			if(p.hasPermission("cc.break")) {
				if(p.getGameMode().equals(GameMode.CREATIVE)) {
					
				} else {
					
					Location loc = p.getLocation();
					Sound sound = Sound.NOTE_BASS;
					p.playSound(loc, sound, 100, (float) 1.0);
				
					p.sendMessage("§7[§6§lCC§7] Du kannst diesen Block nicht zerstören!");
					e.setCancelled(true);
					
				}
				
			} else {
				
				Location loc = p.getLocation();
				Sound sound = Sound.NOTE_BASS;
				p.playSound(loc, sound, 100, (float) 1.0);
			
				p.sendMessage("§7[§6§lCC§7] Du kannst diesen Block nicht zerstören!");
				e.setCancelled(true);
			
			}
			
		}
	}

}
