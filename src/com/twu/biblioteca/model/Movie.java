package com.twu.biblioteca.model;

import sun.management.ThreadInfoCompositeData;

/**
 * @author:xiaoq
 * @date:2019/8/10 13:35
 */
public class Movie {
    private Integer id;
    private String name;
    private String year;
    private String director;
    private String rating;
    private boolean isCheckouted;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public boolean isCheckouted() {
        return isCheckouted;
    }

    public void setCheckouted(boolean checkouted) {
        isCheckouted = checkouted;
    }

    public Movie(Integer id,String name,String year,String director,String rating) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.isCheckouted = false;
    }



}
