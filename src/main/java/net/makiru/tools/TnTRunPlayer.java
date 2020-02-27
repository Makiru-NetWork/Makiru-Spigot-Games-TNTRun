package net.makiru.tools;

import net.makiru.spigot.utils.Locations;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class TnTRunPlayer {

    private Player player;

    public TnTRunPlayer(Player player) {
        this.player = player;
    }

    public void setupLobby() {
        player.teleport(Locations.LOBBY.getLocation());
        player.setLevel(0);
        player.setFoodLevel(20);
        player.setHealth(20);
        player.setGameMode(GameMode.ADVENTURE);
    }
}
