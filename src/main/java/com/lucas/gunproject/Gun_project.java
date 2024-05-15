package com.lucas.gunproject;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Gun_project extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {

        if(e.hasItem()){
            Player player = e.getPlayer();
            if(e.getItem().getType().equals(Material.DIAMOND_HOE)){
                player.launchProjectile(Snowball.class);


            } else if(e.getItem().getType().equals(Material.IRON_HOE)){
                player.launchProjectile(Egg.class);
            }
        }
    }
}
