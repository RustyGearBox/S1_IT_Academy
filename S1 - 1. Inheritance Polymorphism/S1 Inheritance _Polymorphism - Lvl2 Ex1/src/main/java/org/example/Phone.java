package org.example;

import java.util.Scanner;

public class Phone {

    private String marca;
    private String model;

    Scanner scanner = new Scanner(System.in);

    public void call(String numTelefon){
        System.out.println("Calling to: " + numTelefon);
    }

}
