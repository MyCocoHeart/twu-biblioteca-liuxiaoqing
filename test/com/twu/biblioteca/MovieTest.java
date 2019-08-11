package com.twu.biblioteca;

import com.twu.biblioteca.model.Movie;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author:xiaoq
 * @date:2019/8/10 13:38
 */
public class MovieTest {
    @Test
    public void creatAMovieObject() {
        Movie movie = new Movie(1, "疯狂动物城", "2016", "里奇·摩尔", "9.2");
    }

    @Test
    public void shouldReturnMovieInfo() {
        Movie movie = new Movie(1, "疯狂动物城", "2016", "里奇·摩尔", "9.2");
        String result = movie.getTotalInfo();
        String expected = "疯狂动物城|2016|里奇·摩尔|9.2";
        assertEquals(expected, result);
    }

}