package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Input.readByte(scanner.next());

        Input.readChar(scanner.next());

        Input.readDouble(scanner.next());

        Input.readInt(scanner.next());

        Input.readFloat(scanner.next());

        Input.readString(scanner.next());

        Input.readYesNo(scanner.next());


    }
}