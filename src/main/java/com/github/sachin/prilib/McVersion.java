package com.github.sachin.prilib;

import org.bukkit.Bukkit;

import java.util.Objects;

public final class McVersion {

    private final int major;
    private final int minor;
    private final int patch;

    public McVersion(int major, int minor) {
        this(major, minor, 0);
    }

    public McVersion(int major, int minor, int patch) {
        this.major = major;
        this.minor = minor;
        this.patch = patch;
    }

    public static McVersion current() {
        String version = Bukkit.getBukkitVersion();
        String base = version.split("-", 2)[0];
        String[] parts = base.split("\\.");
        int major = parts.length > 0 ? parsePart(parts[0]) : 0;
        int minor = parts.length > 1 ? parsePart(parts[1]) : 0;
        int patch = parts.length > 2 ? parsePart(parts[2]) : 0;
        return new McVersion(major, minor, patch);
    }

    public boolean isAtLeast(McVersion other) {
        if (major != other.major) {
            return major > other.major;
        }
        if (minor != other.minor) {
            return minor > other.minor;
        }
        return patch >= other.patch;
    }

    public boolean isAtLeast(int major, int minor, int patch) {
        return isAtLeast(new McVersion(major, minor, patch));
    }

    private static int parsePart(String value) {
        try {
            return Integer.parseInt(value.replaceAll("[^0-9]", ""));
        } catch (NumberFormatException ignored) {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof McVersion other)) {
            return false;
        }
        return major == other.major && minor == other.minor && patch == other.patch;
    }

    @Override
    public int hashCode() {
        return Objects.hash(major, minor, patch);
    }
}
