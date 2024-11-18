package org.example;

public class Main {
    public static void main(String[] args) {

        Generic generic = new Generic();
        Smartphone smartphone = new Smartphone();

        generic.methodOnlyPhone(smartphone);
        generic.methodOnlySmartphone(smartphone);

    }
}