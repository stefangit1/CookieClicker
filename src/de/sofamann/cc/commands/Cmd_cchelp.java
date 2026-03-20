package de.sofamann.cc.commands;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd_cchelp implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String arg2, String[] args) {
		if(sender instanceof Player) {
			
			Player p = (Player) sender;
			
			if(p.hasPermission("cc.cmd")) {
			
 			Location loc = p.getLocation();
  			Sound sound = Sound.ORB_PICKUP;
  			p.playSound(loc, sound, 100, (float) 1.0);
			
  			p.sendMessage("");
			p.sendMessage("§7 §7 §7 §6§lCOOKIE CLICKER §7 §7 §7 ");
			p.sendMessage("");
			p.sendMessage("§7 §7 §6/ccset §7gibt dir den Cookie Clicker Kopf");
			p.sendMessage("§7 §7 §6/ccperms §7zeigt alle Permissions an");
			p.sendMessage("§7 §7 §6/ccversion §7zeigt die aktuelle Version an");
			p.sendMessage("§7 §7 §6/cchelp §7zeigt diese Befehle");
			p.sendMessage("");
			} else {
				p.sendMessage("§7[§6§lCC§7] Dazu hast du keine Rechte!");
			}
		}
		return false;
	}

}