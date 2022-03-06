package casper.plugin;

import entity.Common;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin0306 extends JavaPlugin implements Listener {

    public ConsoleCommandSender consol = Bukkit.getConsoleSender();

    public Location l;
    public double lx;
    public double ly;
    public double lz;

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new Common(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
