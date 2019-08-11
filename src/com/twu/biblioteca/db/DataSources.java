package com.twu.biblioteca.db;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:xiaoq
 * @date:2019/8/8 20:16
 */
public class DataSources {

    public static final String WELCOME = "Welocme to Biblioteca. You one-stop-shop for great book titles in Bangalore!";

    public static final String BLANK = "";
    public static final String QUIT = "Quit the application";

    public static final String SERVICELIST = "Service List:";

    public static final String LOGIN = "Login";
    public static final String LISTOFBOOKS = "List of books";
    public static final String LISTOFMOVIES = "List of movies";
    public static final String LOGINFAILEDNOTES = "Login failed";
    public static final String LOGINSUCCESSNOTES = "Login success";
    public static final String RELOGINNOTES = "Login again";
    public static final String VIEWUSERDETAIL = "show my information";
    public static final String VIEWCHECKEDBOOKS = "view books checked out";

    public static final String CHECKBOOK = "Checkout a book";
    public static final String RETURNBOOK = "Return a book";

    public static final String CHECKMOVIE = "Checkout a movie";
    public static final String RETURNMOVIE = "Return a movie";

    public static final String BACKUP = "Back up";

    public static final String OPTIONSELECT = "Please select a option!";

    public static final String OPTIONNOTIFIEDMESSAGE = "Please select a valid option!";
    public static final String CHECKOUTBOOKSUCCESSFULNOTES = "Thank you! Enjoy the book";
    public static final String CHECKOUTBOOKUNSUCCESSFULNOTES = "Sorry, that book is not available";
    public static final String RETURNSUCCESSFULNOTES = "Thank you for returning the book";
    public static final String CHECKOUTMOVIESUCCESSFULNOTES = "Thank you! Enjoy the movie";
    public static final String CHECKOUTMOVIEUNSUCCESSFULNOTES = "Sorry, that movie is not available";
    public static final String RETURNFAILEDNOTES = "That is not a valid book to return";
    public static final Map<Integer, String> LOGINEDOPTIONS = new HashMap<Integer, String>();
    public static final Map<Integer, String> MENUOPTIONS = new HashMap<Integer, String>();
    public static final Map<Integer, String> BOOKSOPTIONS = new HashMap<Integer, String>();
    public static final Map<Integer, String> MOVIESOPTIONS = new HashMap<Integer, String>();
    public static final ArrayList<Book> BOOKS = new ArrayList<Book>();
    public static final ArrayList<Movie> MOVIES = new ArrayList<Movie>();
    public static final ArrayList<User> USERS = new ArrayList<User>();

    static {
        MENUOPTIONS.put(1, LISTOFBOOKS);
        MENUOPTIONS.put(2, LISTOFMOVIES);
        MENUOPTIONS.put(3, LOGIN);
        MENUOPTIONS.put(4, QUIT);
    }

    static {
        LOGINEDOPTIONS.put(1, VIEWUSERDETAIL);
        LOGINEDOPTIONS.put(2, VIEWCHECKEDBOOKS);
        LOGINEDOPTIONS.put(3, RELOGINNOTES);
        LOGINEDOPTIONS.put(4, BACKUP);
        LOGINEDOPTIONS.put(5, QUIT);
    }

    static {
        BOOKSOPTIONS.put(1, CHECKBOOK);
        BOOKSOPTIONS.put(2, RETURNBOOK);
        BOOKSOPTIONS.put(3, VIEWCHECKEDBOOKS);
        BOOKSOPTIONS.put(4, BACKUP);
        BOOKSOPTIONS.put(5, QUIT);
    }

    static {
        MOVIESOPTIONS.put(1, CHECKMOVIE);
        MOVIESOPTIONS.put(2, BACKUP);
        MOVIESOPTIONS.put(3, QUIT);
    }

    static {
        BOOKS.add(new Book(1, "Head First Python", "Barry", "2010"));
        BOOKS.add(new Book(2, "Head First Java", "KathySierra", "2007"));
    }

    static {
        MOVIES.add(new Movie(1, "疯狂动物城", "2016", "里奇·摩尔、拜恩·霍华德、杰拉德·布什", "9.2"));
        MOVIES.add(new Movie(2, "爱宠大机密", "2016", "亚罗·切尼、克里斯·雷纳德", "7.6"));
        MOVIES.add(new Movie(3, "疯狂外星人", "2015", "蒂姆·约翰逊", "7.3"));
        MOVIES.add(new Movie(4, "哪吒", "2019", "饺子", "unrated"));
    }

    static {
        USERS.add(new User(1, "Zhang-xiaohong", "12345@163.com", "18209271624", "123456"));
        USERS.add(new User(2, "Li-xiaoming", "14345@163.com", "18309271624", "012345"));
        USERS.add(new User(3, "Liu-xiaoqing", "153465@163.com", "18609271624", "520520"));
    }
}
