package com.github.sachin.lootin.compat.rwg;

import com.github.sachin.lootin.Lootin;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public final class RWGCompat{

    private final Lootin plugin;

    private boolean setupFailed = false;

    public RWGCompat(){
        this.plugin = Lootin.getPlugin();
    }

    public boolean enableRwgSupport(Plugin plugin) {
        return plugin != null;
    }
    
    public Plugin getApi(){
        return null;
    }

    public boolean isSetupFailed(){
        return setupFailed;
    }

    public ItemStack[] getHeads(){
        return new ItemStack[0];
    }
    
    public void setup() {
        this.setupFailed = true;
        plugin.getLogger().warning("RWG compatibility is disabled in this build.");
    }

}
