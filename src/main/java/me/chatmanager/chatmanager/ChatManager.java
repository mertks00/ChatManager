package me.chatmanager.chatmanager;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChatManager extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("cc")) {

            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (player.hasPermission("ChatManager.admin")) {

                    String message = " ";
                    for (int i = 0; i < 20; i++) {
                        player.sendMessage(" ");
                    }
                    player.sendMessage(ChatColor.GREEN+"Sohbet "+ChatColor.YELLOW+player.getDisplayName()+ChatColor.GREEN+" Tarafından Temizlendi!");

                }else {
                    player.sendMessage(ChatColor.RED + "no permission");
                }

            }


        }

        return true;
    }
}

