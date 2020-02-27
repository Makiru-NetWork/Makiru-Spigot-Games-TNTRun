package net.makiru.spigot.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public enum Locations {

    LOBBY(new Location(Bukkit.getWorlds().get(0), 0, 150, 0)),
    START_POS(new Location(Bukkit.getWorlds().get(0), 0, 150, 0)),
    DIED_POS(new Location(Bukkit.getWorlds().get(0), 0, 150, 0));

    private Location location;

    Locations(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location != null ? location : new Location(Bukkit.getWorlds().get(0), 0, 150, 0);
    }
}
