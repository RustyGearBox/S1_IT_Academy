package org.example;

public class Smartphone extends Phone implements Camera, Clock {

    @Override
    public void toPhotograph() {
        System.out.println("A photo is being made");
    }

    @Override
    public void alarm() {
        System.out.println("The alarm is ringing");
    }
}
