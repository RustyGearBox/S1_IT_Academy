package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        BufferedReader reader;

        int counter = 1;
        int correct = 0;
        int incorrect = 0;

        try {
            HashMap<String, String> locationHash = new HashMap<String, String>();
            HashMap<String, String> answerHash = new HashMap<String, String>();
            ArrayList<String> countryArray = new ArrayList<String>();
            ArrayList<String> displayArray = new ArrayList<String>();

            reader = new BufferedReader(new FileReader("src/main/java/org/example/Countries"));
            String line = reader.readLine();

            while (line != null) {
                String[] splitedLine = line.split(" ");
                countryArray.add(splitedLine[0]);
                locationHash.put(splitedLine[0],splitedLine[1]);
                line = reader.readLine();
            }

            System.out.print(" Introdueix el teu nom: ");
            String name = scanner.next();

            while (counter < 11){

                int n = rand.nextInt(countryArray.size());
                System.out.print(counter + ". ¿Quina es la capital de " + countryArray.get(n) + "? ");
                String answer = scanner.next();

                if (answer.equals(locationHash.get(countryArray.get(n)))){
                    System.out.println("¡Correcte, la capital de "+ countryArray.get(n) + " es " + locationHash.get(countryArray.get(n))+"!\n ");
                    correct++;
                }else{
                    System.out.println(" Incorrecte, la capital de "+ countryArray.get(n) + " es " + locationHash.get(countryArray.get(n))+".\n ");
                    incorrect++;
                }
                answerHash.put(locationHash.get(countryArray.get(n)), answer);

                counter++;
            }

            FileWriter writer = new FileWriter("classificacio.txt");
            writer.write("Jugador: " + name + "\n");

            writer.write("Respostes: " + String.valueOf(answerHash) + "\n");
            writer.write("Respostes correctes: " + correct + "\n");
            writer.write("Respostes incorrectes: " + incorrect + "\n");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            reader.close();

        } catch (IOException e) {
            e.getMessage();
        }

    }
}
