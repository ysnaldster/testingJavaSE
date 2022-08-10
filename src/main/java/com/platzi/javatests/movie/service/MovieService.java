package com.platzi.javatests.movie.service;

import com.platzi.javatests.movie.data.IMovieRepository;
import com.platzi.javatests.movie.model.Genre;
import com.platzi.javatests.movie.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {

    private IMovieRepository iMovieRepository;

    public MovieService(IMovieRepository iMovieRepository) {
        this.iMovieRepository = iMovieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        return iMovieRepository.findAll().stream()
                .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByLength(int length) {
        return iMovieRepository.findAll().stream()
                .filter(movie -> movie.getMinute() <= length).collect(Collectors.toList());
    }
}
