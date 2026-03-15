package com.github.sachin.prilib;

import org.bukkit.plugin.Plugin;

public class Prilib {

    private final NmsHandler nmsHandler = new NmsHandler();

    public Prilib(Plugin plugin) {
    }

    public void initialize() {
    }

    public boolean isNMSEnabled() {
        return true;
    }

    public NmsHandler getNmsHandler() {
        return nmsHandler;
    }

    public McVersion getMcVersion() {
        return McVersion.current();
    }
}
