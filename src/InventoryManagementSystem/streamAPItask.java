package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class streamAPItask {

    public static void main(String[] args) {
        List<Item> itemsList1 = new ArrayList<>();
        itemsList1.add(new Electronics("E1", "Laptop", 75000.0, 10, 24));
        itemsList1.add(new Electronics("E2", "Mobile Phone", 25000.0, 0, 12));
        itemsList1.add(new Book("B1", "Clean Code", 599.0, 15, "Robert Martin"));
        itemsList1.add(new Book("B2", "Effective Java", 499.0, 8, "Joshua Bloch"));
        itemsList1.add(new Clothing("C1", "T-Shirt", 999.0, 50, "L"));
        itemsList1.add(new Clothing("C2", "Jeans", 2499.0, 20, "M"));
        itemsList1.add(new Electronics("E3", "Earphones", 1999.0, 30, 6));

        /*
        Task
            Enable sorting and filtering items in our inventory based on different criteria:
            Sort by name (alphabetical)
            Sort by quantity (descending:  high stock first)
            Filter by price range
            Filter by availability (quantity > 0)
         */
//        itemsList1.stream().sorted((a,b)-> a.compareTo(b)).sorted()
        //check if any item has a quantity of 0
        boolean isItemOutOfStock = itemsList1.stream().anyMatch(item -> item.getQuantity() == 0);

        System.out.println(isItemOutOfStock);

        //verify if all items have a price greater than 0
        boolean isItemHasPriceToPay = itemsList1.stream().allMatch(item -> item.getPrice() > 0);

        System.out.println(isItemHasPriceToPay);

    }


}
