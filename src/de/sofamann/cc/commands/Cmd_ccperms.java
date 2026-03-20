package de.sofamann.cc.commands;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd_ccperms implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String arg2, String[] args) {
		if(sender instanceof Player) {
			
			Player p = (Player) sender;
			
			if(p.hasPermission("cc.cmd")) {
			
			p.sendMessage("");
			p.sendMessage("§7 §7 §7 §a§lPERMISSIONS §7 §7 §7 ");
			p.sendMessage("");
			p.sendMessage("§7 §7 §7/ccset §2§lcc.set");
			p.sendMessage("§7 §7 §7/ccversion §7/cchelp §7/ccperms §2§lcc.cmd");
			p.sendMessage("§7 §7 §7Neustarten §2§lcc.restart");
			p.sendMessage("§7 §7 §7Cookie Clicker abbauen §2§lcc.break");
			p.sendMessage("");
			
			Location loc = p.getLocation();
  			Sound sound = Sound.ORB_PICKUP;
  			p.playSound(loc, sound, 100, (float) 1.0);
			
			} else {
				p.sendMessage("§7[§6§lCC§7] Dazu hast du keine Rechte!");
			}
			
		}
		return false;
	}

}