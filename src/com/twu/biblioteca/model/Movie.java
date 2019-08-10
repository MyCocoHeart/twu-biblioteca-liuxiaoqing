package com.twu.biblioteca.model;

import com.twu.biblioteca.db.DataSources;
import sun.management.ThreadInfoCompositeData;

import java.util.ArrayList;

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

    public String getName() {
        return name;
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

    public static Movie getMovieByName(String name, ArrayList<Movie> movies) {
        for (Movie movie : movies) {
            if (movie.getName().equals(name)) return movie;
        }
        return null;
    }
    public void checkout() {
        if (isCheckouted()) {
            showCheckoutFailedNotes();
        } else {
            setCheckouted(true);
            showCheckoutSuccessNotes();
        }
    }
    private void showCheckoutFailedNotes() {
        System.out.println(DataSources.CHECKOUTMOVIEUNSUCCESSFULNOTES);
    }
    private void showCheckoutSuccessNotes() {
        System.out.println(DataSources.CHECKOUTMOVIESUCCESSFULNOTES);
    }

}
