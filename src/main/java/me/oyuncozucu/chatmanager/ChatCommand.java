package me.oyuncozucu.chatmanager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChatCommand implements CommandExecutor {

    private ChatManager plugin;

    public ChatCommand(ChatManager plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

            if(args.length != 1) {
                sender.sendMessage(ChatColor.RED + "/sohbet <args>");
                return false;
            }

            if(args[0].equalsIgnoreCase("kapat")) {
                if(sender instanceof Player) {

                    Player player = (Player) sender;

                    if(!plugin.isEnable()) {
                        player.sendMessage("Sohbet Zaten Kapalı");
                        return true;
                    }
                    plugin.setEnable(false);
                    Bukkit.broadcastMessage(ChatColor.AQUA + "Sohbet Kapalı!");
                }
            } else if (args[0].equalsIgnoreCase("aç")) {
                if(sender instanceof Player) {
                    Player player = (Player) sender;
                    if (plugin.isEnable()) {
                        player.sendMessage("Sohbet Zaten Açık!");
                        return true;
                    }
                    plugin.setEnable(true);
                    Bukkit.broadcastMessage(ChatColor.AQUA + "Sohbet Açık!");
                }
            } else if (args[0].equalsIgnoreCase("sil")) {

                if(sender instanceof Player) {

                    Player player = (Player) sender;
                    for(int i = 0; i < 20; i++) {
                        for(Player players : Bukkit.getOnlinePlayers()) {
                            players.sendMessage(" ");
                        }
                    }
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Sohbet " + player.getName() + " tarafından temizlendi!");

                }

            } else {
                sender.sendMessage(ChatColor.RED + "/sohbet <args>");
            }


        return true;
    }
}
