package org.example;

public class Main {
    public static void main(String[] args) {

        StringReverser reverser = (input) -> new StringBuilder(input).reverse().toString();

        String original = "Hello world!";
        String reversed = reverser.reverse(original);

        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);

    }
}