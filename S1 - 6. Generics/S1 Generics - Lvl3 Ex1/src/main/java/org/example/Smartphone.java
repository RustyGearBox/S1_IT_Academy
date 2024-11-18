package org.example;

public class Smartphone implements Phone{

    @Override
    public void call() {
        System.out.println("Calling from the smartphone");
    }

    public void takePhoto() {
        System.out.println("Taking a photo with the smartphone");
    }
}
