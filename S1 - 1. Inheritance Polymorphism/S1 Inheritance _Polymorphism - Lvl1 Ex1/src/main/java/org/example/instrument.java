package org.example;

public abstract class instrument {

    private String name;
    private int price;

    public instrument(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public abstract String play();

}