import org.example.Book;
import org.example.Car;
import org.example.Person;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    @Test
    public void testListContainsInOrder() {

        Person person = new Person("Alex");
        Car car = new Car("Ford");
        Book book = new Book("1984");

        ArrayList<Object> list = new ArrayList<>();
        list.add(person);
        list.add(car);
        list.add(book);

        assertEquals(person, list.get(0), "The first object should be 'Person'");
        assertEquals(car, list.get(1), "The second object should be 'Car'");
        assertEquals(book, list.get(2), "The first object should be 'Book'");
    }

    @Test
    public void testListContains() {

        Person person = new Person("Alex");
        Car car = new Car("Ford");
        Book book = new Book("1984");

        ArrayList<Object> list = new ArrayList<>();
        list.add(person);
        list.add(car);
        list.add(book);

        assertTrue(list.contains(person), "The list should contain 'Person'");
        assertTrue(list.contains(car), "The list should contain 'Car'");
        assertTrue(list.contains(book), "The list should contain 'Book'");
    }

    @Test
    public void testListObjectAddOnce() {

        Person person = new Person("Alex");
        Car car = new Car("Ford");
        Book book = new Book("1984");

        ArrayList<Object> list = new ArrayList<>();
        list.add(person);
        list.add(car);
        list.add(book);

        assertEquals(1, list.stream().filter(obj -> obj.equals(person)).count(), "The object Person should be only once");
    }

    @Test
    public void testListDontContain() {

        Person person = new Person("Alex");
        Car car = new Car("Ford");
        Book book = new Book("1984");
        Person personNotAdded = new Person("Frank");

        ArrayList<Object> list = new ArrayList<>();
        list.add(person);
        list.add(car);
        list.add(book);

        assertFalse(list.contains(personNotAdded), "The Object 'Frank' should not be in the list");
    }

}
