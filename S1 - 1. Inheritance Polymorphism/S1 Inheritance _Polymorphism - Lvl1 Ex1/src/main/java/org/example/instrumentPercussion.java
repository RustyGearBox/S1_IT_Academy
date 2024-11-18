package org.example;

public class instrumentPercussion extends instrument{

    public instrumentPercussion(String name, int price) {
        super(name, price);
    }

    @Override
    public String play() {
        return "A percussion instrument it's been played";
    }

}
