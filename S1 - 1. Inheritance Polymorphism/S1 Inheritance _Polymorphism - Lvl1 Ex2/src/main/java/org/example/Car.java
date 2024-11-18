package org.example;

public class Car {

    //Mark: This means its value is constant and cannot be changed after initialization.
    //Model: Its value can be modified at any time through the class.
    //Power: It is a final attribute. This means that it must be initialized in the constructor and its value cannot be changed once assigned.

    private static final String brand = "Mclaren";    // Atribute static final
    private static String model;                      // Atribute static
    private final int power;                          // Atribute final

    //Constructor
    public Car(int power) {
        this.power = power;
    }

    public static void breaking(){
        System.out.println("The car is slowing down");
    }

    public void accelerate(){
        System.out.println("The car is accelerating");
    }

}
