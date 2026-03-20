package de.sofamann.clicker.commands;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import de.sofamann.clicker.main.Main;

public class CMD_cookieclicker implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			
			Player p = (Player) sender;
			
			Location loc = p.getLocation();
			
			Sound level_up = Sound.LEVEL_UP;
			Sound note_bass = Sound.NOTE_BASS;
			
			if(args.length == 0) {
				
				if(p.hasPermission("cc.*") || p.hasPermission("cc.help") || p.isOp()) {
					
					p.playSound(loc, level_up, 100, (float) 1.0);
					
					p.sendMessage("§7 §7 §7 §6§lCOOKIE CLICKER §7 §7 §7 \n"
					+ " \n"
					+ "§7/cc perms §8Zeigt alle Permissions!\n"
					+ "§7/cc getclicker §8Gibt dir den Cookie Clicker Kopf!\n"
					+ " ");
					
				} else {
					
					p.playSound(loc, note_bass, 100, (float) 1.0);
					
					p.sendMessage(Main.PREFIX + "Du hast nicht genügend Berechtigung!");
					
				}
				
			} else if(args[0].equals("perms")) {
				
				if(p.hasPermission("cc.*") || p.hasPermission("cc.perms") || p.isOp()) {
					
					p.playSound(loc, level_up, 100, (float) 1.0);
					
					p.sendMessage("§7 §7 §7 §2§lPERMISSIONS §7 §7 §7 \n"
					+ " \n"
					+ "§7cc.help §8Erlaubt das anzeigen der Commands!\n"
					+ "§7cc.perms §8Erlaubt die Permissions anzuzeigen!\n"
					+ "§7cc.getclicker §8Erlaubt dir den Clicker zu bekommen!\n"
					+ "§7cc.* §8Erlaubt dir alles!\n"
					+ " ");
					
				} else {
					
					p.playSound(loc, note_bass, 100, (float) 1.0);
					
					p.sendMessage(Main.PREFIX + "Du hast nicht genügend Berechtigung!");
					
				}
				
			} else if(args[0].equals("getclicker")) {
				
				if(p.hasPermission("cc.*") || p.hasPermission("cc.getclicker") || p.isOp()) {
					
					p.playSound(loc, level_up, 100, (float) 1.0);
					
					p.sendMessage(Main.PREFIX + "Du hast den Clicker erhalten!");
					
					ItemStack clicker = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
					SkullMeta clickermeta = (SkullMeta) clicker.getItemMeta();
					clickermeta.setDisplayName("§6§lClicker");
					clickermeta.setOwner("QuadratCookie");
					clicker.setItemMeta(clickermeta);
					
					p.getInventory().addItem(clicker);
					
				} else {
					
					p.playSound(loc, note_bass, 100, (float) 1.0);
					
					p.sendMessage(Main.PREFIX + "Du hast nicht genügend Berechtigung!");
					
				}
				
			}
			
		}
		
		return false;
	}

}