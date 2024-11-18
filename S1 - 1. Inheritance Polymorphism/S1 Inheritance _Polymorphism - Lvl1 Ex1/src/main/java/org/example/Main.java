package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<instrument> instruments = new ArrayList<>();

        instruments.add(new instrumentCord("Guitar",120));
        instruments.add(new instrumentWind("Flute",60));
        instruments.add(new instrumentPercussion("Batery",600));

        for (instrument ins : instruments) {
            System.out.println(ins.play());
        }
    }
}
