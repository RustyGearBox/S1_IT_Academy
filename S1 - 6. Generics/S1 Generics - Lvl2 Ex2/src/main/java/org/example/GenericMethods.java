package org.example;

public class GenericMethods {

    // the arg2 has been modified to it's not generic
    public <T> void printArgs(T... args) {
        for (T arg : args){
            System.out.println("Arg: " + arg);
        }

    }

}