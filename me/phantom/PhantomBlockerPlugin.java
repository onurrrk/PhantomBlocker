package me.phantom;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PhantomBlockerPlugin extends JavaPlugin implements Listener {
   @EventHandler
   public void onCreatureSpawn(CreatureSpawnEvent event) {
      if (event.getEntityType() == EntityType.PHANTOM) {
         event.setCancelled(true);
      }

   }
}
