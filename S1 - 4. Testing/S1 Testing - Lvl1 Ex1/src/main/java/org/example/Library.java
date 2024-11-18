package org.example;

import java.util.ArrayList;

public class Library {

    private ArrayList <String> books;

    public Library(ArrayList<String> books) {
        this.books = books;
    }

    //Allows to add books to the array.
    public void addBook (String title){
        books.add(title);
    }

    //Shows all the items inside the array.
    public ArrayList<String> getBooks() {
        return new ArrayList<>(books);
    }

    //Shows the title of the book in the position asked.
    public String findBook (int position){
        if (position >= 0 && position < books.size()){
            return books.get(position);
        }else{
            return "There's no book in the position: " + position + ".";
        }
    }

    //Allows to add a book in the spot asked.
    public void addBookByPosition (String title, int position){
        if (!books.contains(title)){
            books.add(position, title);
            System.out.print("The book: " + title + " has been successfully placed in the position " + position + ".");
        }else{
            System.out.print("The position where you want to put the book is occupied");
        }

    }

    //Shows the title of the book in the position asked.
    public String deleteBookByTitle (String title){
        if (books.contains(title)){
            books.remove(title);
            return "The book: " + title + ", has been removed.";
        }else{
            return "There's no book in with the title: " + title + ".";
        }
    }
}