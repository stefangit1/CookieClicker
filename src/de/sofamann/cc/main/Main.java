package de.sofamann.cc.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.sofamann.cc.commands.Cmd_cchelp;
import de.sofamann.cc.commands.Cmd_ccperms;
import de.sofamann.cc.commands.Cmd_ccset;
import de.sofamann.cc.commands.Cmd_ccversion;
import de.sofamann.cc.events.BlockBreakEvent_E;
import de.sofamann.cc.events.InventoryClickEvent_E;
import de.sofamann.cc.events.PlayerInteractEvent_E;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		
		getCommand("ccset").setExecutor(new Cmd_ccset());
		getCommand("cchelp").setExecutor(new Cmd_cchelp());
		getCommand("ccversion").setExecutor(new Cmd_ccversion());
		getCommand("ccperms").setExecutor(new Cmd_ccperms());
		
		PluginManager pluginmanager = Bukkit.getPluginManager();
		pluginmanager.registerEvents(new PlayerInteractEvent_E(), this);
		pluginmanager.registerEvents(new InventoryClickEvent_E(), this);
		pluginmanager.registerEvents(new BlockBreakEvent_E(), this);
		
	}

}