package org.example;

public class GenericMethods {

    // the arg2 has been modified to it's not generic
    public <T, U> void printArgs(T arg1, String arg2, U arg3) {
        System.out.println("Arg 1: " + arg1);
        System.out.println("Arg 2: " + arg2);
        System.out.println("Arg 3: " + arg3);

    }

}