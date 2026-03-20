package de.sofamann.cc.commands;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd_ccversion implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String arg2, String[] args) {
		if(sender instanceof Player) {
			
			Player p = (Player) sender;
			
			if(p.hasPermission("cc.cmd")) {
			
 			Location loc = p.getLocation();
  			Sound sound = Sound.ORB_PICKUP;
  			p.playSound(loc, sound, 100, (float) 1.0);
			
  			p.sendMessage("");
			p.sendMessage("§7 §7 §7 §6§lVERSION 1.0§7 §7 §7 ");
			p.sendMessage("");
			p.sendMessage("§7 §7 §a§l+ §7Cookie Clicker Kopf");
			p.sendMessage("§7 §7 §a§l+ §7Neustarten");
			p.sendMessage("§7 §7 §a§l+ §7Upgrades");
			p.sendMessage("");
			p.sendMessage("§7 §7 §6~ §7Beim Öffnen des Cookie Clickers werden die Stats nicht geladen");
			p.sendMessage("§7 §7 §6~ §7Beim Klicken verschwinden die Items");
			p.sendMessage("");
			p.sendMessage("§7 §7 §c§lVersion 1.1 in Arbeit");
			p.sendMessage("§7 §7 §a§l+ §7/ccperms");
			p.sendMessage("§7 §7 §6~ §7/ccset geht nicht");
			p.sendMessage("");
			p.sendMessage("§6§lMade by §7§lSofamann");
			p.sendMessage("");
			
			} else {
				p.sendMessage("§7[§6§lCC§7] Dazu hast du keine Rechte!");
			}
		
		}
		return false;
	}

}