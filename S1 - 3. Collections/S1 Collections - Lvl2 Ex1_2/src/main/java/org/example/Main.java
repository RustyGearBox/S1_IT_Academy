package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Restaurant> restaurants = new HashSet<Restaurant>();

        restaurants.add(new Restaurant("KFC",8));
        restaurants.add(new Restaurant("Abac",5));
        restaurants.add(new Restaurant("KFC",8));

        for (Restaurant i : restaurants){
            System.out.println(i);
        }
    }
}