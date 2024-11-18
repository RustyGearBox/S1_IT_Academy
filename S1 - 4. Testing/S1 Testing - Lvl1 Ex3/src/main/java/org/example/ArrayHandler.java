package org.example;

public class ArrayHandler {

    private int[] array;

    public ArrayHandler(int[] array) {
        this.array = array;
    }

    public int getElementAtIndex(int index) {
        return array[index];
    }
}
