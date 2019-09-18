package com.anattoly.moviereviewplatform.service.movie;

import com.anattoly.moviereviewplatform.model.movie.Movie;

public interface IMovieService {

    public void addMovie(Movie movie);

    public void deleteMovieByMovieId(Long movieId);
}
