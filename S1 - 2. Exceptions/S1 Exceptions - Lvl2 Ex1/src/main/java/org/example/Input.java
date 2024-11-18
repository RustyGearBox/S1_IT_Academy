package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            try {
                System.out.println(message);
                return scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Invalid format, please enter a valid byte.");
                scanner.next();
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.println(message);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid format, please enter a valid int.");
                scanner.next();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.println(message);
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Invalid format, please enter a valid float.");
                scanner.next();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.println(message);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid format, please enter a valid double.");
                scanner.next();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = scanner.next();
                if (input.length() != 1) {
                    throw new Exception("Only one character must be entered.");
                }
                return input.charAt(0);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static String readString(String message) {
        System.out.println(message);
        return scanner.next();
    }

    public static boolean readYesNo(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = scanner.next().toLowerCase();
                if (input.equals("y")) {
                    return true;
                } else if (input.equals("n")) {
                    return false;
                } else {
                    throw new Exception("You must only enter 'y' or 'n'.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

}
