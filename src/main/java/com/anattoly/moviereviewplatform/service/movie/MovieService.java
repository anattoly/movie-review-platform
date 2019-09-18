package com.anattoly.moviereviewplatform.service.movie;

import com.anattoly.moviereviewplatform.model.movie.Movie;
import com.anattoly.moviereviewplatform.repository.MovieRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class MovieService implements IMovieService{

    MovieRepository movieRepository;

    @Override
    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void deleteMovieByMovieId(Long movieId) {
        movieRepository.deleteById(movieId);
    }
}
