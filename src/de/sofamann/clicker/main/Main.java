package de.sofamann.clicker.main;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.sofamann.clicker.commands.CMD_cookieclicker;
import de.sofamann.clicker.events.InventoryClick;
import de.sofamann.clicker.events.PlayerInteract;
import de.sofamann.clicker.events.PlayerJoin;

public class Main extends JavaPlugin {
	
private static Main plugin;
public static String PREFIX = "§6Cookie Clicker §8»§7 ";
public static HashMap<String, Integer> cookies = new HashMap<String, Integer>();
public static HashMap<String, Integer> multiplier = new HashMap<String, Integer>();
public static HashMap<String, Integer> multiplierCost = new HashMap<String, Integer>();
	
	public void onEnable() {
		
		getCommand("cc").setExecutor(new CMD_cookieclicker());
		getCommand("cookieclicker").setExecutor(new CMD_cookieclicker());
		
		PluginManager plm = Bukkit.getPluginManager();
		plm.registerEvents(new PlayerInteract(), this);
		plm.registerEvents(new InventoryClick(), this);
		plm.registerEvents(new PlayerJoin(), this);
		
	}
	
public static Main getPlugin() {
		
		return plugin;
		
	}

}