package me.oyuncozucu.chatmanager;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    private ChatManager plugin;

    public ChatListener(ChatManager plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {

        Player player = e.getPlayer();

        if(!player.hasPermission("chat.admin")) {
            if(!plugin.isEnable()) {
                e.setCancelled(true);
            }
        }


    }

}
