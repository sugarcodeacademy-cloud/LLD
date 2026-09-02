package DesignPatterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * TreeTypeFactory — Flyweight Factory.
 *
 * Caches and reuses TreeType instances so that only ONE object
 * exists per bullet type (e.g. "oak", "mango", "neem").
 *
 * This is the core of the Flyweight pattern:
 *   - If a TreeType with the given name already exists → return it.
 *   - Otherwise → create it, cache it, and return it.
 *
 * Without this factory, every tree would carry its own
 * copy of the image and shared attributes (~1 KB each).
 */
public class TreeTypeFactory {
    private static final Map<TreeTypes, TreeType> CACHE = new HashMap<>();

    public static TreeType getTreeType(TreeTypes t){
        if(CACHE.containsKey(t)){
            return CACHE.get(t); //reuse the existing
        }

        //First time - create the heavy object
        TreeType treeType = createTreeType(t);
        CACHE.put(t, treeType);
        return treeType;
    }

    public static TreeType createTreeType(TreeTypes t){
        return switch (t) {
            case OAK -> new TreeType("GREEN", "oak", "medium",  new byte[1024]);
            case MAPLE -> new TreeType("YELLOW", "rough", "big", new byte[1024]);
            case PINE -> new TreeType("WHITE", "cone", "Huge", new byte[1024]);
            default -> new TreeType("LIGHT GREEN", "smooth", "small", new byte[1024]);
        };
    }
}
