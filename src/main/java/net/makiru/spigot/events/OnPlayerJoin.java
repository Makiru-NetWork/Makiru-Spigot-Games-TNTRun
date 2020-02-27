package net.makiru.spigot.events;

import net.makiru.spigot.core.TnTRun;
import net.makiru.tools.TnTRunPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnPlayerJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.setJoinMessage("truc truc " + event.getPlayer().getName() + " a rejoint la partie");
        new TnTRunPlayer(event.getPlayer()).setupLobby();
    }
}
