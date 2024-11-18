package org.example;

public class Main {
    public static void main(String[] args) {

        Operation addition = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;
        Operation multiplication = (a, b) -> a * b;
        Operation division = (a, b) -> b != 0 ? a / b : Float.NaN;

        float num1 = 15f;
        float num2 = 7f;

        System.out.println("Addition: " + addition.operate(num1, num2));
        System.out.println("Subtraction: " + subtraction.operate(num1, num2));
        System.out.println("Multiplication: " + multiplication.operate(num1, num2));
        System.out.println("Division: " + division.operate(num1, num2));
    }
}