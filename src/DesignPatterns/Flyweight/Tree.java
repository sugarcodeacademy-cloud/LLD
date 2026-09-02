package DesignPatterns.Flyweight;

public class Tree {
    private int x;
    private int y;
//    private String color;
//    private String texture;
//    private String size;
    private final TreeType type;

    public Tree(int x, int y, TreeType t) {
        this.x = x;
        this.y = y;
        this.type = t;
//        this.color = color;
//        this.texture = texture;
//        this.size = size;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
