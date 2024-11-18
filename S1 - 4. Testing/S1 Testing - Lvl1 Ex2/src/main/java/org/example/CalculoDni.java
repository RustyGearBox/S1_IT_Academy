package org.example;

public class CalculoDni {

    private final static char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public static char letterCalc(int numDni) {
        return letters[numDni % 23];
    }
}



