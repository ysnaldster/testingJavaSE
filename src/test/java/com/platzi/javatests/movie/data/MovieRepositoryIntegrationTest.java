package com.platzi.javatests.movie.data;

import com.platzi.javatests.movie.model.Genre;
import com.platzi.javatests.movie.model.Movie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;

public class MovieRepositoryIntegrationTest {
    @Test
    public void testMovieRepository_GivenCallFindALl_ShouldReturnAllMovies() throws SQLException {
        //Arrange
        DataSource dataSource = new DriverManagerDataSource(
          "jdbc:h2:mem:test;MODE=MYSQL", "sa", "sa"
        );
        //Insert data in Database H2
        ScriptUtils.executeSqlScript(dataSource.getConnection(),
                new ClassPathResource("sql-scripts/test-data.sql"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        MovieRepository movieRepository = new MovieRepository(jdbcTemplate);
        //Act
        Collection<Movie> movies = movieRepository.findAll();
        //Assert
        Assertions.assertEquals(movies, Arrays.asList(
                new Movie ("Dark Knight", 152, Genre.ACTION),
                new Movie("Memento", 113, Genre.THRILLER),
                new Movie ("Matrix", 136, Genre.ACTION)
        ));
    }
}