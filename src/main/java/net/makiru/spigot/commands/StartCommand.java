package net.makiru.spigot.commands;

import net.makiru.spigot.core.TnTRun;
import net.makiru.spigot.schedulers.LaunchGameScheduler;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StartCommand implements CommandExecutor {

    public static int task;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("NOPPP");
            return false;
        }

        Player player = (Player) sender;
        if (!player.isOp()) {
            player.sendMessage("commands_help_message_%lang%");//replace
            return false;
        }
        task = Bukkit.getScheduler().scheduleSyncRepeatingTask(TnTRun.getInstance(), new LaunchGameScheduler(), 20, 20);

        return false;
    }
}
