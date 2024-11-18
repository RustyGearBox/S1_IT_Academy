package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Month> mothList = new ArrayList<Month>();

        mothList.add(new Month("Enero"));
        mothList.add(new Month("Febrero"));
        mothList.add(new Month("Marzo"));
        mothList.add(new Month("Abril"));
        mothList.add(new Month("Mayo"));
        mothList.add(new Month("Junio"));
        mothList.add(new Month("Julio"));
        mothList.add(new Month("Septiembre"));
        mothList.add(new Month("Octubre"));
        mothList.add(new Month("Noviembre"));
        mothList.add(new Month("Diciembre"));

        System.out.println("ArrayList 'Agosto': " + mothList + "\n");

        mothList.add(7,new Month( "Agosto"));

        System.out.println("ArrayList ordenada: " + mothList + "\n");

        HashSet<Month> monthSet = new HashSet<>(mothList);

        System.out.println("ArraySet desordenado:" + monthSet + "\n");

        System.out.print("ArraySet con iterator: ");
        Iterator<Month> iterator = monthSet.iterator();
        while(iterator.hasNext()){
            System.out.println(monthSet);
            break;
        }

    }
}