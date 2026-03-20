package de.sofamann.clicker.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.sofamann.clicker.main.Main;

public class PlayerJoin implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		
		Player p = e.getPlayer();
		
		if(!Main.cookies.containsKey(p.getName())) {
			
			Main.cookies.put(p.getName(), 0);
			
		}
		
		if(!Main.multiplier.containsKey(p.getName())) {
			
			Main.multiplier.put(p.getName(), 1);
			
		}
		
		if(!Main.multiplierCost.containsKey(p.getName())) {
			
			Main.multiplierCost.put(p.getName(), 100);
			
		}
		
	}

}