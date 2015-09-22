package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        Utils.showWelcomeMessages();
        Utils.showChoicesMessages();

        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();

        while (userChoice != 3){
            switch (userChoice) {
                case 1:
                    System.out.println("All books:");
                    showBooks(allBooks());
                    break;
                case 2:
                    System.out.println("Please input the name of the book you want to checkout:");
                    String bookName = input.next();
                    showBooks(checkoutBook(bookName));
                    break;
                default:
                    System.out.println("Select a valid option!");
                    break;
            }
            userChoice = input.nextInt();
        }
    }

    public static List<Book> allBooks() {
        List<Book> books = new ArrayList<Book>();
        Book book1 = new Book("book1", "author1", 2014, false);
        Book book2 = new Book("book2", "author2", 2009, false);
        books.add(book1);
        books.add(book2);

        return books;
    }

    public static void showBooks(List<Book> books) {
        for (Book book : books) {
            if (!book.isBorrowed()){
                System.out.println("Book: " + book.getName() + " Author: " + book.getAuthor() + " Year: " + book.getYear());
            }
        }
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
}
