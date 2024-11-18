package org.example;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(876);

        //Called without needing to instantiate the class.
        Car.breaking();

        //Called by the instance of the car class.
        car.accelerate();

    }
}
