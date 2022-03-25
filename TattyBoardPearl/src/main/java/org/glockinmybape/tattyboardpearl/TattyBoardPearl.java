package org.glockinmybape.tattyboardpearl;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class TattyBoardPearl extends JavaPlugin implements Listener {
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);

        Logger log = Bukkit.getLogger();
        log.info("§b");
        log.info("§b .----------------------------------------------------------. ");
        log.info("§b| .-------------------------------------------------------. |");
        log.info("§b| |             \t\t\t\t\t\t");
        log.info("§b| |            §7Плагин: §bTattyBoardPearl§8| §7Версия: §b1.0                ");
        log.info("§b| |        §7Создан для §bTattyWorld §8- §7Разработал: §bglockinmybape\t");
        log.info("§b| |                    §bvk.com/TattyWorld");
        log.info("§b| |             \t\t\t\t\t\t");
        log.info("§b| '-------------------------------------------------------'§b|");
        log.info("§b'-----------------------------------------------------------'");
        log.info("§b");
    }

    public void onDisable() {
    }

    @EventHandler
    public void on(PlayerTeleportEvent event) {
        if (event.getPlayer().getWorld().getWorldBorder() != null && event.getCause() == TeleportCause.ENDER_PEARL) {
            double worldborder = event.getPlayer().getWorld().getWorldBorder().getSize() / 2.0D;
            if (event.getPlayer().getWorld().getWorldBorder().getCenter().getX() + worldborder < event.getTo().getX()) {
                event.setCancelled(true);
                event.getPlayer().sendMessage(ChatColor.RED + "You cannot ender-pearl outside the border!");
                event.getPlayer().getInventory().addItem(new ItemStack[]{new ItemStack(Material.ENDER_PEARL, 1)});
            } else if (event.getPlayer().getWorld().getWorldBorder().getCenter().getX() - worldborder > event.getTo().getX()) {
                event.setCancelled(true);
                event.getPlayer().sendMessage(ChatColor.RED + "You cannot ender-pearl outside the border!");
                event.getPlayer().getInventory().addItem(new ItemStack[]{new ItemStack(Material.ENDER_PEARL, 1)});
            } else if (event.getPlayer().getWorld().getWorldBorder().getCenter().getZ() + worldborder < event.getTo().getZ()) {
                event.setCancelled(true);
                event.getPlayer().sendMessage(ChatColor.RED + "You cannot ender-pearl outside the border!");
                event.getPlayer().getInventory().addItem(new ItemStack[]{new ItemStack(Material.ENDER_PEARL, 1)});
            } else if (event.getPlayer().getWorld().getWorldBorder().getCenter().getZ() - worldborder > event.getTo().getZ()) {
                event.setCancelled(true);
                event.getPlayer().sendMessage(ChatColor.RED + "You cannot ender-pearl outside the border!");
                event.getPlayer().getInventory().addItem(new ItemStack[]{new ItemStack(Material.ENDER_PEARL, 1)});
            }
        }
    }
}
