package net.puredesu.purecore;

import net.puredesu.purecore.commands.TestingCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class PureCore extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getCommand("testing").setExecutor(new TestingCommand(this));
    }
}
