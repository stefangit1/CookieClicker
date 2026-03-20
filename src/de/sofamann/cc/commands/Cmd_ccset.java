package de.sofamann.cc.commands;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class Cmd_ccset implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String arg2, String[] args) {
		if(sender instanceof Player) {
			
			Player p = (Player) sender;
			
			if(p.hasPermission("cc.set")) {
			
			    ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
				SkullMeta meta = (SkullMeta) skull.getItemMeta();
				meta.setOwner("QuadratCookie");
				meta.setDisplayName("§6§lCOOKIE CLICKER");
				skull.setItemMeta(meta);
              p.setItemInHand(skull);
              
  			Location loc = p.getLocation();
  			Sound sound = Sound.ORB_PICKUP;
  			p.playSound(loc, sound, 100, (float) 1.0);
			
			p.sendMessage("§7[§6§lCC§7] Dir wurde ein Cookie Clicker gegeben!");
			} else {
				p.sendMessage("§7[§6§lCC§7] Dazu hast du keine Rechte!");
			}
		}
		
		return false;
	}

}