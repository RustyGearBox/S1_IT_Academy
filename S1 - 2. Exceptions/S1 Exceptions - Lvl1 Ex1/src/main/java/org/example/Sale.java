package org.example;

import java.util.ArrayList;
import java.util.List;

class Sale {
    private List<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void calculateTotal() throws SaleEmptyException {
        if (products.isEmpty()) {
            throw new SaleEmptyException("To make a sale, you must first add products");
        }

        totalPrice = 0.0;
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
        System.out.println("Total sale price: " + totalPrice + " dollars");
    }
}