package org.example;

public class Person {

    private String name, surname;
    public int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " + name + ", surname: " + surname + ", age: " + age;
    }
}
