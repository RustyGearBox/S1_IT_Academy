package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Anna", "Albert", "john", "Marcus", "Graves");
        List<String> namesFiltered = obtainNamesFiltered(names);

        System.out.println("Names that start with A: " + namesFiltered);
    }

    public static List<String> obtainNamesFiltered(List<String> names) {
        return names.stream()
                .filter(name -> name.startsWith("A") && name.length() == 3)
                .collect(Collectors.toList());
    }

}