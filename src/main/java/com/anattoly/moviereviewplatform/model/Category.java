package com.anattoly.moviereviewplatform.model;

public enum Category {
    ACTION("Action"),
    ADVENTURE("Adventure"),
    ANIMATION("Animation"),
    BIOGRAPHY("Biography"),
    COMEDY("Comedy"),
    CRIME("Crime"),
    DOCUMENTARY("Documentary"),
    DRAMA("Drama"),
    FAMILY("Family"),
    FANTASY("Fantasy"),
    FILM_NOIR("Film Noir"),
    HISTORY("History"),
    HORROR("Horror"),
    MUSIC("Music"),
    MUSICAL("Musical"),
    MYSTERY("Mystery"),
    ROMANCE("Romance"),
    SCI_FI("Science fiction"),
    SHORT_FILM("Short Film"),
    SPORT("Sport"),
    SUPERHERO("Superhero"),
    THRILLER("Thriller"),
    WAR("War"),
    WESTERN("Western");

    private final String readableFormat;


    Category(String readableFormat) {
        this.readableFormat = readableFormat;
    }

    public String getReadableFormat() {
        return readableFormat;
    }
}
