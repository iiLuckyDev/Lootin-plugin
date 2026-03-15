package com.github.sachin.prilib;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.loot.Lootable;

public class NmsHandler {

    public void fill(Player player, Lootable container, String lootTableKey, boolean resetSeed) {
        // This lightweight shim only preserves compile-time compatibility.
    }

    public Object getElytraUpdatePacket(Object packetHandle, Entity entity, Object key) {
        return null;
    }
}
