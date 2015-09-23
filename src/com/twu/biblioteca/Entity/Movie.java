package com.twu.biblioteca.Entity;

public class Movie {

    private String name;
    private int year;
    private String director;
    private String rate;
    private boolean isBorrowed;

    public Movie(String name, int year, String director, String rate, boolean isBorrowed) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rate = rate;
        this.isBorrowed = isBorrowed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }
}
