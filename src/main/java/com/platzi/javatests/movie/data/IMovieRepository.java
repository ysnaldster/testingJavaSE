package com.platzi.javatests.movie.data;

import com.platzi.javatests.movie.model.Movie;

import java.util.Collection;

public interface IMovieRepository {

    Movie findById(long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}
