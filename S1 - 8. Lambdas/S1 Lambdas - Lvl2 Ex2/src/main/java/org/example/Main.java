package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(3, 55, 44);

        String result = obtainList(num);

        System.out.println(result);
    }

    public static String obtainList(List<Integer> numbers) {
        return numbers.stream()
                .map(num -> (num % 2 == 0 ? "e" : "o") + num)
                .collect(Collectors.joining(", "));
    }

}