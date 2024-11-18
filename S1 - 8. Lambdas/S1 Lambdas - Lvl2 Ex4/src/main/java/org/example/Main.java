package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> mixedList = new ArrayList<>(Arrays.asList("apple", "banana", "3", "elephant", "42", "grape", "1", "peach", "5"));

        mixedList.sort((s1, s2) -> {
            if (s1.charAt(0) == 'e' && s2.charAt(0) != 'e') {
                return -1;
            } else if (s1.charAt(0) != 'e' && s2.charAt(0) == 'e') {
                return 1;
            } else {
                return s1.compareTo(s2);
            }
        });

        mixedList = mixedList.stream()
                .map(s -> s.replace('a', '4'))
                .collect(Collectors.toList());

        List<String> numericElements = mixedList.stream()
                .filter(s -> s.matches("\\d+"))
                .toList();

        System.out.println("Numeric elements: " + numericElements);
    }
}