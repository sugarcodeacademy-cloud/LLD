package DesignPatterns.Flyweight;
/**
 * TreeTyoe — Intrinsic (shared) state for the Flyweight pattern.
 *
 * Holds properties that are IDENTICAL across all trees of the
 * same type: color, size, texture
 *
 * These objects are created once and shared by thousands of tree
 * instances, saving ~1 KB per tree.
 *
 * ┌──────────────────────────────────────────────────┐
 * │  Without Flyweight:  100,000 trees × 1.1 KB    │
 * │                      ≈ 110 MB RAM                │
 * │                                                  │
 * │  With Flyweight:     100,000 × 0.06 KB (extrinsic) │
 * │                      + 5 × 1.04 KB (intrinsic)   │
 * │                      ≈ 6 MB RAM                  │
 * └──────────────────────────────────────────────────┘
 *
 * This class is IMMUTABLE — safe to share across threads.
 */
public class TreeType {
    private final String color;
    private final String texture;
    private final String size;
    private final byte[] image;

    public TreeType(String color, String texture, String size, byte[] image) {
        this.color = color;
        this.texture = texture;
        this.size = size;
        this.image = image;
    }

    public String getColor() {
        return color;
    }

    public String getTexture() {
        return texture;
    }

    public String getSize() {
        return size;
    }

    public byte[] getImage() {
        return image;
    }
}
