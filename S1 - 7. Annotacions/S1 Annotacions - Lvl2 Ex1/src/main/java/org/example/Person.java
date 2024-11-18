package org.example;

@JsonSerializable(directory = "src/main/java/org/example")
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
