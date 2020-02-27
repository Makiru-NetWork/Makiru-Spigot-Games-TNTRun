package net.makiru.spigot.schedulers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;

public class BlockRemovalScheduler implements Runnable {

    /**
     * We will have to test issues with this method
     * Does it work ? we'll see.... It's up to Will lool
     * good night
     */


    @Override
    public void run() {
        Bukkit.getOnlinePlayers().forEach(player -> {
            // if(state == game){

            int tt = player.getLocation().getBlock().getY();
            Block under = Bukkit.getWorlds().get(0).getBlockAt((int) player.getLocation().getX(), tt, (int) player.getLocation().getZ());
            Block underUnder = Bukkit.getWorlds().get(0).getBlockAt((int) player.getLocation().getX(), tt - 1, (int) player.getLocation().getZ());
            if (under.getType() == Material.SAND || under.getType() == Material.GRAVEL) {
                under.setType(Material.AIR);
                underUnder.setType(Material.AIR);
                return;
            }


            // }

        });
    }
}
