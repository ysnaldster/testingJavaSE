package com.platzi.javatests.movie.model;

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
}
