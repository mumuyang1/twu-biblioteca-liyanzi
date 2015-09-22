package com.twu.biblioteca;

public class Book {

    private String name;
    private String author;
    private int year;
    private boolean isBorrowed;

    public Book(String name, String author, int year, boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBorrowed() {
        return isBorrowed;

    }
    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }
}
