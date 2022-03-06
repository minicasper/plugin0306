package entity;

import casper.plugin.Plugin0306;
import dev.esophose.playerparticles.particles.ParticleEffect;
import dev.esophose.playerparticles.particles.data.ParticleColor;
import dev.esophose.playerparticles.styles.ParticleStyleInvocation;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Score;

public class Common implements Listener {

    static Plugin0306 main;

    public Common()
    {

    }

    public Common(Plugin0306 main)
    {
        this.main = main;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();    // 입장한 유저

    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        World world = player.getWorld();

        main.l = player.getLocation();
        main.lx = main.l.getX();
        main.ly = main.l.getY();
        main.lz = main.l.getZ();

        for (LivingEntity e : player.getWorld().getLivingEntities()
        ) {
            double x = e.getLocation().getX();
            double y = e.getLocation().getY();
            double z = e.getLocation().getZ();
            if(e.getType() != EntityType.PLAYER && e.isDead() == false
            && (x > (main.lx - 3) && x < (main.lx + 3))
            && (y > (main.ly - 3) && y < (main.ly + 3))
            && (z > (main.lz - 3) && z < (main.lz+ 3)))
            {
                e.setFireTicks(500);
            }
        }
    }
}
