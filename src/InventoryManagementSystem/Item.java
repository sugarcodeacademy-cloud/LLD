package InventoryManagementSystem;

import java.util.Objects;

public class Item implements Comparable<Item>{
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Item(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public int compareTo(Item other) {
        // this < other --> return negative(this comes first)
        // this > other --> return positive(other comes first)
        //this == other --> return 0

        if(this.price < other.price) return -1;
        else if(this.price > other.price) return 1;
        else return 0;

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
//        if(o == null || getClass() != o.getClass()) return false;
//        Item item = (Item) o;
        if(!(o instanceof Item item) ) return false;
        return Objects.equals(id, item.id);
    }
}
