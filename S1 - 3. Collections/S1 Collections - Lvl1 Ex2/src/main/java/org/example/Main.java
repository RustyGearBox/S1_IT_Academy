package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Integer> list_1 = new ArrayList<>();
        List<Integer> list_2 = new ArrayList<>();

        System.out.print("List_1 (ForLoop):");
        for (int i = 1; i < 6; i++){
            list_1.add(i);
            System.out.print(" " + i);
        }

        System.out.print("\n" + "List_1 (Iterator):");
        ListIterator<Integer> iteratorList_1 = list_1.listIterator(list_1.size());

        while (iteratorList_1.hasNext()) {
            list_1.add(iteratorList_1.next());
        }

        System.out.print(" " + list_1);

        System.out.print("\n" + "List_2 (Iterator):");
        ListIterator<Integer> iteratorList_2 = list_1.listIterator(list_1.size());

        while (iteratorList_2.hasPrevious()) {
            list_2.add(iteratorList_2.previous());
        }

        System.out.print(" " + list_2);

    }
}