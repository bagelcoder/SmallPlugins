package me.slacktooth.invtest;

import org.bukkit.plugin.java.JavaPlugin;

public class InvTest extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new InvTestListener(), this);
    }
}
