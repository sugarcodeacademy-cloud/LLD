package InventoryManagementSystem;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        items.add(new Book("1234", "Java", 123.90, 5, "Vinod"));
        items.add(new Clothing("1234", "shoes", 3450, 3, "Medium"));
        items.add(new Electronics("2345", "Mouse", 350, 20, 2));
        items.add(new Clothing("1234", "Shirt", 4500, 3, "Large"));

//        List<Integer> numbers = new ArrayList<>(List.of(23, 45, 62, 10, 32));
//
//        Collections.sort(numbers);
//        System.out.println(numbers);

        Collections.sort(items);
        for(Item item : items){
            System.out.println(item.getName());
        }

        Map<String, Item> inventory = new HashMap<>();
        for(Item item: items){
            inventory.put(item.getId(), item);
        }

        System.out.println(inventory.size());

    }

}
