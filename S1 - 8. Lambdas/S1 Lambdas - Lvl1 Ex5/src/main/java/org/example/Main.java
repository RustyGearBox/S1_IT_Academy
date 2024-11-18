package org.example;

public class Main {
    public static void main(String[] args) {

        Pivalue pi = () -> 3.1416;
        System.out.println("Pi value: " + pi.getPivalue());

    }
}