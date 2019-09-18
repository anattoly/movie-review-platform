package com.anattoly.moviereviewplatform.model.movie;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Movie {
    private Long id;
    private String name;
    private Category category;
    private String director;
    private String description;
    private Double rateValue;
    private Review review;
}
