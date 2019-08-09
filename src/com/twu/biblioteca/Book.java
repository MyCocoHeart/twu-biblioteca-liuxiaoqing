package com.twu.biblioteca;

/**
 * @author:xiaoq
 * @date:2019/8/9 12:40
 */
public class Book {
    private Integer bookId;
    private String name;
    private String authors;
    private String publishedYear;

    public String getName() {
        return name;
    }

    public Integer getBookId() {
        return bookId;
    }

    public String getAuthors() {
        return authors;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public Book(Integer id, String name,String authors, String publishedYear) {
        this.bookId = id;
        this.name = name;
        this.authors = authors;
        this.publishedYear = publishedYear;
    }
    public String getTotalInfo() {
        return name+"|"+authors+"|"+publishedYear;
    }

}
