package com.platzi.javatests.movie.data;

import com.platzi.javatests.movie.model.Genre;
import com.platzi.javatests.movie.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.Collection;

public class MovieRepository implements IMovieRepository {

    private JdbcTemplate jdbcTemplate;

    public MovieRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {
        return null;
    }

    @Override
    public Collection<Movie> findAll() {
        String sql = "SELECT * FROM MOVIE";
        return jdbcTemplate.query(sql, movieMapper);
    }

    @Override
    public void saveOrUpdate(Movie movie) {

    }

    private static final RowMapper<Movie> movieMapper = (resultSet, i) ->
            new Movie(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("minutes"),
                    Genre.valueOf(resultSet.getString("genre")));
}
