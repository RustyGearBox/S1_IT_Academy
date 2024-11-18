package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sale sale = new Sale();

        sale.addProduct(new Product("Computer", 500));
        sale.addProduct(new Product("Keyboard", 80));

        try {
            sale.calculateTotal();
        } catch (SaleEmptyException e) {
            System.out.println(e.getMessage());
        }

        try {
            List<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);

            System.out.println(list.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}