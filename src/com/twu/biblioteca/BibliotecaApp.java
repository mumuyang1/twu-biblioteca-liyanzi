package com.twu.biblioteca;

import com.twu.biblioteca.Entity.Book;
import com.twu.biblioteca.Service.BookService;

import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        Utils.showWelcomeMessages();
        Utils.showChoicesMessages();

        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();

        while (userChoice != 0){
            switch (userChoice) {
                case 1:
                    System.out.println("All books:");
                    showBooks(BookService.allBooks());
                    break;
                case 2:
                    System.out.println("Please input the name of the book you want to checkout:");
                    String checkoutBook = input.next();
                    if (BookService.isAvailable(checkoutBook)){
                        BookService.checkoutBook(checkoutBook);
                        System.out.println("Thank you! Enjoy the book.");
                    }else {
                        System.out.println("That book is not available");
                    }
                    break;
                case 3:
                    System.out.println("Please input the name of the book you want to return:");
                    String returnBook = input.next();
                    if (BookService.isAvailable(returnBook)){
                        System.out.println("That is not a valid book to return.");
                    }else {
                        BookService.returnBook(returnBook);
                        System.out.println("Thank you for returning the book.");
                    }
                default:
                    System.out.println("Select a valid option!");
                    break;
            }
            userChoice = input.nextInt();
        }
    }

    public static void showBooks(List<Book> books) {
        for (Book book : books) {
            if (!book.isBorrowed()){
                System.out.println("Book: " + book.getName() + " Author: " + book.getAuthor() + " Year: " + book.getYear());
            }
        }
    }


}
