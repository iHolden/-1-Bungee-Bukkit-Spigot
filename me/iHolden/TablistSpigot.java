// Bukkit / Spigot //
package me.iHolden.tablist;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Class extends JavaPlugin implements Listener {
	
  public void onEnable() {
    Bukkit.getServer().getPluginManager().registerEvents(this, this);
  }
  
  @EventHandler
  public void onPing(ServerListPingEvent e) {
    e.setMaxPlayers(e.getNumPlayers() + 1);
  }
}
