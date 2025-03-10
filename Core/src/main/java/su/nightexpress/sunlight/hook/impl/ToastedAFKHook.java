package su.nightexpress.sunlight.hook.impl;

import me.serbob.toastedafk.managers.ValuesManager;
import me.serbob.toastedafk.objectholders.PlayerStats;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import su.nightexpress.nightcore.util.Plugins;

public class ToastedAFKHook {

    public static boolean isInAfkRegion(@NotNull Player player) {
        if (Plugins.isInstalled("ToastedAFK")) {
            PlayerStats stats = ValuesManager.playerStats.get(player);
            if (stats != null)
                return stats.getAfkTimer() > 0;
        }
        return false;
    }
}
