package me.chbshoot.library;

public abstract class Shelvable {
    String isbn;
    String name, author;
    boolean checkedOut;

    public Shelvable(String isbn, String name, String author) {
        
    }
}

class Book extends Shelvable {
    public Book(String isbn) {
        super("", "", "");
    }
}