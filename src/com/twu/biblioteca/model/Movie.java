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

    public String getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public String getRating() {
        return rating;
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
    public String getTotalInfo() {
        return name+ "|"+year+ "|"+director+ "|"+rating;
    }
}
