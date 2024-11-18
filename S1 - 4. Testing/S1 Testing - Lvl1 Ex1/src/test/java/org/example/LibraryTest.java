package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library library;

    @BeforeEach
    void setUp() {
        ArrayList<String> books = new ArrayList<>();
        books.add("Book A");
        books.add("Book B");
        books.add("Book C");
        library = new Library(books);
    }

    @Test
    public void testNullListAfterBuildingObject (){

    }

    @Test
    void addBook() {
        library.addBook("Book D");
        assertTrue(library.getBooks().contains("Book D"));
    }

    @Test
    void getBooks() {
        ArrayList<String> books = library.getBooks();
        assertEquals(3, books.size());
        assertTrue(books.contains("Book A"));
        assertTrue(books.contains("Book B"));
        assertTrue(books.contains("Book C"));
    }

    @Test
    void findBook() {
        String book = library.findBook(1);
        assertEquals("Book B", book);

        String outOfBoundsBook = library.findBook(10);
        assertEquals("There's no book in the position: 10.", outOfBoundsBook);
    }

    @Test
    void addBookByPosition() {
        library.addBookByPosition("Book D", 1);
        assertEquals("Book D", library.getBooks().get(1));
    }

    @Test
    void deleteBookByTitle() {
        String result = library.deleteBookByTitle("Book B");
        assertEquals("The book: Book B, has been removed.", result);
        assertFalse(library.getBooks().contains("Book B"));

        String noBookResult = library.deleteBookByTitle("Book X");
        assertEquals("There's no book in with the title: Book X.", noBookResult);
    }
}