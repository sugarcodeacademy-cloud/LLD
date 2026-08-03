package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        Set<String> visitedPages = new LinkedHashSet<>();


        visitedPages.add("Home");
        visitedPages.add("Products");
        visitedPages.add("Cart");
        visitedPages.add("Home"); //Duplictes, order is unchanged


        for(String page: visitedPages){
            System.out.println(page); //Home -> Products --> Cart
        }

    }

}
