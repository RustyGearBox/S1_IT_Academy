package org.example;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Matías", "Meza", 22);
        GenericMethods genericMethods = new GenericMethods();

        String text = "hello world!";
        int num = 2024;

        genericMethods.<Person, Integer>printArgs(person, text, num);

    }
}