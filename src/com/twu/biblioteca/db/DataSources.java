package com.twu.biblioteca.db;

import com.twu.biblioteca.model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:xiaoq
 * @date:2019/8/8 20:16
 */
public class DataSources {
    public static final String WELCOMEMESSAGE = "Welocme to Biblioteca. You one-stop-shop for great book titles in Bangalore!";
    public static final Map<Integer, String> MENUOPTIONSMAP = new HashMap<Integer, String>();
    public static final ArrayList<Book> BOOKS = new ArrayList<Book>();
    public static final String OPTIONNOTIFIEDMESSAGE = "Please select a valid option!";
    public static final String CHECKOUTSUCCESSFULNOTES = "Thank you! Enjoy the book";
    public static final String CHECKOUTUNSUCCESSFULNOTES = "Sorry, that book is not available";
    public static final String RETURNSUCCESSFULNOTES = "Thank you for returning the book";
    public static final String RETURNFAILEDNOTES = "That is not a valid book to return";

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

}
