package com.platzi.javatests.movie.service;

import com.platzi.javatests.movie.data.IMovieRepository;
import com.platzi.javatests.movie.model.Genre;
import com.platzi.javatests.movie.model.Movie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MovieServiceTest {

    private MovieService movieService;

    @BeforeEach
    void setUp() {
        IMovieRepository movieRepository = Mockito.mock(IMovieRepository.class);
        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION),
                        new Movie(2, "Memento", 113, Genre.THRILLER),
                        new Movie(3, "There's Something About Mary", 119, Genre.COMEDY),
                        new Movie(4, "Super 8", 112, Genre.THRILLER),
                        new Movie(5, "Scream", 111, Genre.HORROR),
                        new Movie(6, "Home Alone", 103, Genre.COMEDY),
                        new Movie(7, "Matrix", 136, Genre.ACTION)
                )
        );
        movieService = new MovieService(movieRepository);
    }

    private static List<Integer> getMovieIds(Collection<Movie> movies) {
        return movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());
    }

    @Test
    public void testMovieService_GivenAllMovies_ShouldReturnMoviesByGenre() {
        //Arrange
        //Act
        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);
        List<Integer> movieIds = getMovieIds(movies);
        //Assert
        Assertions.assertEquals(Arrays.asList(3, 6), movieIds);
    }

    @Test
    public void testMovieService_GivenMoviesDuration_ShouldReturnDurationByMovie() {
        //Arrange
        //Act
        Collection<Movie> movies = movieService.findMoviesByLength(119);
        List<Integer> movieIds = getMovieIds(movies);
        //Assert
        Assertions.assertEquals(Arrays.asList(2, 3, 4, 5, 6), movieIds);
    }

}