package com.platzi.javatests.movie.model;

import java.util.Objects;

public class Movie {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMinute() {
        return minute;
    }

    public Genre getGenre() {
        return genre;
    }

    private int minute;
    private Genre genre;

    public Movie(String name, int minute, Genre genre){
        this(null, name, minute, genre);
    }

    public Movie(Integer id, String name, int minute, Genre genre) {
        this.id = id;
        this.name = name;
        this.minute = minute;
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return minute == movie.minute && Objects.equals(id, movie.id) && Objects.equals(name, movie.name) && genre == movie.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, minute, genre);
    }
}
