package me.oyuncozucu.chatmanager;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChatManager extends JavaPlugin {

    private boolean isEnable = true;

    @Override
    public void onEnable() {

        getCommand("sohbet").setExecutor(new ChatCommand(this));

        Bukkit.getPluginManager().registerEvents(new ChatListener(this), this);

    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean isEnable) {
        this.isEnable = isEnable;
    }
}
