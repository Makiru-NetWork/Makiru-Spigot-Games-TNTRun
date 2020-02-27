package net.makiru.spigot.schedulers;

import net.makiru.spigot.commands.StartCommand;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class LaunchGameScheduler implements Runnable {

    int timer = 12;

    @Override
    public void run() {
        Bukkit.getOnlinePlayers().forEach(player -> {
            player.setLevel(timer);
            if (timer == 10 || timer <= 5 && timer > 0) {
                player.sendMessage("§aLa partie commence dans §c" + timer + "§a secondes.");
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 20f, 20f);
            }
            if (timer == 0) {
                Bukkit.getScheduler().cancelTask(StartCommand.task);
            }
        });


        timer--;
    }
}
