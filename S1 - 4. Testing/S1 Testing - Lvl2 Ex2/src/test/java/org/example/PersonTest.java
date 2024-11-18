package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

class PersonTest {

    @Test
    public void testMateixaReferencia() {
        Person persona1 = new Person("Alex");
        Person persona2 = persona1;
        assertSame(persona1, persona2, "The references must be the same");
    }

    @Test
    public void testReferenciaDiferent() {
        Person person1 = new Person("Alex");
        Person person2 = new Person("Alex");
        assertNotSame(person1, person2, "The references must be the difference");
    }

}