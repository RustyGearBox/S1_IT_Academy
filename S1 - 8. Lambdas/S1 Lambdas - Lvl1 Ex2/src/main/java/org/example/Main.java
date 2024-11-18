package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> list = List.of("Bear","Dog","Cat","Axolotl");

        List<String> result = getWordsWithO(list);
        System.out.println(result);

    }

    public static List<String> getWordsWithO(List <String> list) {
        return list.stream().filter(s -> s.toLowerCase().contains("o") && s.length() > 5)
                .collect(Collectors.toList());
    }

}