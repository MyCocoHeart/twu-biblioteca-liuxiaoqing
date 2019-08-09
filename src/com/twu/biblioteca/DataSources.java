package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:xiaoq
 * @date:2019/8/8 20:16
 */
public class DataSources {
    public static final String WELCOMEMESSAGE= "Welocme to Biblioteca. You one-stop-shop for great book titles in Bangalore!";
    public static final Map<Integer,String> MENUOPTIONSMAP= new HashMap<Integer, String>() {{put(1, "List of books");}};
    public static final ArrayList<Book> BOOKS = new ArrayList<Book>();
    public static final String OPTIONNOTIFIEDMESSAGE = "Please select a valid option!";
    static {
        BOOKS.add(new Book(1,"Head First Python","Barry","2010"));
        BOOKS.add(new Book(2,"Head First Java","KathySierra","2007"));
    }
}
