package net.makiru.spigot.core;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
/*import net.makiru.api.core.MakiruAPI;
import net.makiru.api.logger.MKFactory;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;*/

public class TnTRun extends JavaPlugin {

    public static final String PREFIX = "§7[§c!§7] §8» ";
    private static TnTRun instance;
    private static List<Player> alive;
    /*private static MKFactory factory;

    public static MKFactory getFactory() {
        return factory;
    }

    private void setFactory(@NotNull final MKFactory factory) {
        TnTRun.factory = factory;
    }*/

    public static TnTRun getInstance() {
        return TnTRun.instance;
    }

    private void setInstance(final TnTRun instance) {
        TnTRun.instance = instance;
    }

    @Override
    public void onLoad() {
        new Load();
        super.onLoad();
    }

    @Override
    public void onEnable() {
        this.setInstance(this);
        // this.setFactory(new MKFactory(this.getDataFolder()));
        new Enable(this);
        alive = new ArrayList<>();
        super.onEnable();
    }

    @Override
    public void onDisable() {
        new Disable();
        super.onDisable();
    }

    public static List<Player> getAlive() {
        return alive;
    }
}
