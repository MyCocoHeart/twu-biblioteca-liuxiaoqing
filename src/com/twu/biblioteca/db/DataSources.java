package com.twu.biblioteca.db;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:xiaoq
 * @date:2019/8/8 20:16
 */
public class DataSources {
    public static final String WELCOMEMESSAGE = "Welocme to Biblioteca. You one-stop-shop for great book titles in Bangalore!";
    public static final String OPTIONNOTIFIEDMESSAGE = "Please select a valid option!";
    public static final String CHECKOUTSUCCESSFULNOTES = "Thank you! Enjoy the book";
    public static final String CHECKOUTUNSUCCESSFULNOTES = "Sorry, that book is not available";
    public static final String RETURNSUCCESSFULNOTES = "Thank you for returning the book";
    public static final String RETURNFAILEDNOTES = "That is not a valid book to return";
    public static final Map<Integer, String> MENUOPTIONSMAP = new HashMap<Integer, String>();
    public static final ArrayList<Book> BOOKS = new ArrayList<Book>();
    public static final ArrayList<Movie> MOVIES = new ArrayList<Movie>();
    static {
        MENUOPTIONSMAP.put(1, "List of books");
        MENUOPTIONSMAP.put(2, "Checkout a book");
        MENUOPTIONSMAP.put(3, "Return a book");
        MENUOPTIONSMAP.put(4, "List of movies");
        MENUOPTIONSMAP.put(5, "Quit the application");
    }

    static {
        BOOKS.add(new Book(1, "Head First Python", "Barry", "2010"));
        BOOKS.add(new Book(2, "Head First Java", "KathySierra", "2007"));
    }
    static {
        MOVIES.add(new Movie(1,"疯狂动物城","2016","里奇·摩尔、拜恩·霍华德、杰拉德·布什","9.2"));
        MOVIES.add(new Movie(2,"爱宠大机密","2016","亚罗·切尼、克里斯·雷纳德","7.6"));
        MOVIES.add(new Movie(3,"疯狂外星人","2015","蒂姆·约翰逊","7.3"));
        MOVIES.add(new Movie(4,"哪吒","2019","饺子","unrated"));
    }
}
