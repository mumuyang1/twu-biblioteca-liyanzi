package com.twu.biblioteca.Service;

import com.twu.biblioteca.Entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    public static List<Book> allBooks() {
        List<Book> books = new ArrayList<Book>();
        Book book1 = new Book("book1", "author1", 2014, false);
        Book book2 = new Book("book2", "author2", 2009, false);
        Book book3 = new Book("book3", "author3", 2009, true);
        books.add(book1);
        books.add(book2);
        books.add(book3);

        return books;
    }
    public static boolean isAvailable(String bookName) {
        for (Book book : allBooks()) {
            if (book.getName().equals(bookName) && book.isBorrowed()){
                return false;
            }
        }
        return true;
    }

    public static List<Book> checkoutBook(String bookName) {
        List<Book> books = allBooks();
        for (Book book : books) {
            if(book.getName().equals(bookName)){
                book.setIsBorrowed(true);
            }
        }
        return books;
    }

    public static List<Book> returnBook(String bookName) {
        List<Book> books = allBooks();
        for (Book book : books) {
            if(book.getName().equals(bookName)){
                book.setIsBorrowed(false);
            }
        }
        return books;
    }
}
