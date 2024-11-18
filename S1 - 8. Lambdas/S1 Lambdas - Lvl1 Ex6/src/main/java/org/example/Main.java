package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("Today", "we", "burger", "for", "dinner");

        List<String> sortedWords = list.stream()
                .filter(element -> element instanceof String)
                .map(element -> (String) element)
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .collect(Collectors.toList());

        System.out.println(sortedWords);
        
    }
}