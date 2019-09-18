package com.anattoly.moviereviewplatform.model.movie;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Review {
    private Long movieId;
    private String reviewMassage;
    private boolean like;
}
