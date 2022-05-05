package me.clear.clear;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Clear extends JavaPlugin {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("sil")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                    if (player.hasPermission("clear.admin")) {

                        for (int i = 0; i< 20; i++) {
                            Bukkit.broadcastMessage(" ");

                        }
                        Bukkit.broadcastMessage(ChatColor.GREEN+"Sohbet "+ ChatColor.YELLOW+player.getDisplayName()+ChatColor.GREEN+" Tarafından Temizlendi!");

                    }else {
                        player.sendMessage(ChatColor.RED+"Buna izniniz yok.");
                    }


            }
        }

        return true;
    }
}

