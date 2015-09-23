package com.twu.biblioteca.Service;

import com.twu.biblioteca.Entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

    public static List<Movie> allMovies() {
        List<Movie> movies = new ArrayList<Movie>();
        Movie movie1 = new Movie("movie1", 2013, "director1", "1", false);
        Movie movie2 = new Movie("movie2", 2013, "director2", "10", true);
        Movie movie3 = new Movie("movie3", 2013, "director3", "unrated", false);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        return movies;
    }
    public static boolean isAvailable(String movieName) {
        for (Movie movie : allMovies()) {
            if (movie.getName().equals(movieName) && movie.isBorrowed()){
                return false;
            }
        }
        return true;
    }

    public static List<Movie> checkoutMovie(String movieName) {
        List<Movie> movies = allMovies();
        for (Movie movie : movies) {
            if(movie.getName().equals(movieName)){
                movie.setIsBorrowed(true);
            }
        }
        return movies;
    }

    public static List<Movie> returnMovie(String movieName) {
        List<Movie> movies = allMovies();
        for (Movie movie : movies) {
            if(movie.getName().equals(movieName)){
                movie.setIsBorrowed(false);
            }
        }
        return movies;
    }

    public static void showMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            if (!movie.isBorrowed()){
                System.out.println(movie.getName() + " Director: " + movie.getDirector() + " Year: " + movie.getYear()
                        + " Rate: " + movie.getRate() );
            }
        }
    }
}
