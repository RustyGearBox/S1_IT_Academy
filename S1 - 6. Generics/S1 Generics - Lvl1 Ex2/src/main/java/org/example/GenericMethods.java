package org.example;

public class GenericMethods {

    public <T, U , V> void printArgs(T arg1, U arg2, V arg3) {
        System.out.println("Arg 1: " + arg1);
        System.out.println("Arg 2: " + arg2);
        System.out.println("Arg 3: " + arg3);

    }

}