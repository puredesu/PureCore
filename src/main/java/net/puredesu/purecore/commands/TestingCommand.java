package net.puredesu.purecore.commands;

import net.puredesu.purecore.PureCore;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestingCommand implements CommandExecutor {

    private PureCore plugin;

    public TestingCommand(PureCore plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player) {
            Player p = (Player) commandSender;
            p.sendMessage(plugin.getConfig().getString("Testing"));
        }

        return true;
    }
}
