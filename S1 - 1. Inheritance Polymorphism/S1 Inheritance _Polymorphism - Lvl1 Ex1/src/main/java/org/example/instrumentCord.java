package org.example;

public class instrumentCord extends instrument{

    public instrumentCord(String name, int price) {
        super(name, price);
    }

    @Override
    public String play() {
        return "A string instrument it's been played";
    }

}
