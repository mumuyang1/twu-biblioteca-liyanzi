package com.twu.biblioteca;

import com.twu.biblioteca.Service.BookService;
import com.twu.biblioteca.Service.MovieService;

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
                    BookService.showBooks(BookService.allBooks());
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
                case 4:
                    System.out.println("All movies:");
                    MovieService.showMovies(MovieService.allMovies());
                    break;
                case 5:
                    System.out.println("Please input the name of the movie you want to checkout:");
                    String checkoutMovie = input.next();
                    if (MovieService.isAvailable(checkoutMovie)){
                        MovieService.checkoutMovie(checkoutMovie);
                        System.out.println("Thank you! Enjoy the movie.");
                    }else {
                        System.out.println("That movie is not available");
                    }
                    break;
                default:
                    System.out.println("Select a valid option!");
                    break;
            }
            userChoice = input.nextInt();
        }
    }
}
