package net.puredesu.purecore;

import org.bukkit.plugin.java.JavaPlugin;

public final class PureCore extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
    }
}
