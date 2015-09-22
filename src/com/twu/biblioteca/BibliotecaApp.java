package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Hello, welcome to Biblioteca!");
        System.out.println("***************************************************");
        System.out.println("Choose from these choices");
        System.out.println("1 - Show books");
        System.out.println("2 - Quit");

        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();
        while (userChoice != 2 ){

            switch (userChoice) {
                case 1:
                    System.out.println("you selected 1");
                    showBooks();
                    break;
                default:
                    System.out.println("Select a valid option!");
                    break;
            }
            userChoice = input.nextInt();
        }
    }

    public static void showBooks() {
        List<Book> books = new ArrayList<Book>();
        Book book1 = new Book("Zero to One: Notes on Startups, or How to Build", "Peter Thiel，Blake Masters", 2014);
        Book book2 = new Book("深入分析Java Web技术内幕", "许令波", 2009);
        books.add(book1);
        books.add(book2);

        for (Book book : books) {
            System.out.println("Book: " + book.getName() + " Author: " + book.getAuthor() + " Year: " + book.getYear());
        }
    }
}
