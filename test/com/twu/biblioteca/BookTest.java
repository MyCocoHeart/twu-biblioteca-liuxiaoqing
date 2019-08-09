package com.twu.biblioteca;


import org.junit.Test;


import static org.junit.Assert.*;

/**
 * @author:xiaoq
 * @date:2019/8/9 12:41
 */
public class BookTest {
    @Test
    public void createABooKObject() {
        Integer id = 1;
        String name = "Head First Python";
        String authors = "Barry";
        String publishedYear = "2010";
        Book book = new Book(id,name,authors,publishedYear);
    }
    @Test
    public void getBooksname() {
        Integer id = 1;
        String name = "Head First Python";
        String authors = "Barry";
        String publishedYear = "2010";
        Book book = new Book(id,name,authors,publishedYear);
        String result = book.getName();
        assertEquals("Head First Python",result);
    }
    @Test
    public void getBooksId() {
        Integer id = 1;
        String name = "Head First Python";
        String authors = "Barry";
        String publishedYear = "2010";
        Book book = new Book(id,name,authors,publishedYear);
        Integer result = book.getBookId();
        assertEquals(id,result);
    }
    @Test
    public void getBooksPublishedYear() {
        Integer id = 1;
        String name = "Head First Python";
        String authors = "Barry";
        String publishedYear = "2010";
        Book book = new Book(id,name,authors,publishedYear);
        String result = book.getPublishedYear();
        assertEquals("2010",result);
    }
    @Test
    public void getBooksAuthor() {
        Integer id = 1;
        String name = "Head First Python";
        String authors = "Barry";
        String publishedYear = "2010";
        Book book = new Book(id,name,authors,publishedYear);
        String result = book.getAuthors();
        assertEquals("Barry",result);
    }
}