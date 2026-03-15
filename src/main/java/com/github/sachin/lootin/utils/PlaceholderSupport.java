package com.github.sachin.lootin.utils;

import org.bukkit.entity.Player;

import java.lang.reflect.Method;

public final class PlaceholderSupport {

    private PlaceholderSupport() {
    }

    public static String setPlaceholders(Player player, String text) {
        try {
            Class<?> placeholderApi = Class.forName("me.clip.placeholderapi.PlaceholderAPI");
            Method method = placeholderApi.getMethod("setPlaceholders", Player.class, String.class);
            Object value = method.invoke(null, player, text);
            return value instanceof String ? (String) value : text;
        } catch (ReflectiveOperationException ignored) {
            return text;
        }
    }
}
