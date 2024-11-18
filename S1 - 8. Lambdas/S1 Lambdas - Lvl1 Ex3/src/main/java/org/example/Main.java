package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> months = List.of("January","February","March","April","May","June","July","August","September","October","November","December");

        months.forEach(month -> System.out.println(month));

    }
}