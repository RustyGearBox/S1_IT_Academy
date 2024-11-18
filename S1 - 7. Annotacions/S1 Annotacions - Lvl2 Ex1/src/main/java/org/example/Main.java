package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Matías", 22);

        try {
            JsonSerializer.serialize(person);
            System.out.println("The object has been serialized");
        }catch (IOException e) {
            system.out.println(e.getMessage);
        }

    }
}
