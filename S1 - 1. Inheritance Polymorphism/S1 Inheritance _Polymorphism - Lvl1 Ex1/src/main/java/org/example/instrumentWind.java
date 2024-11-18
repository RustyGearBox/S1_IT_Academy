package org.example;

public class instrumentWind extends instrument{

    public instrumentWind(String name, int price) {
        super(name, price);
    }

    @Override
    public String play() {
        return "A wind instrument it's been played";
    }

}
