package com.anattoly.moviereviewplatform.repository;

import com.anattoly.moviereviewplatform.model.movie.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, Long> {
}
