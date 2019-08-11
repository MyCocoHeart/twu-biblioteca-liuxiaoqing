package com.twu.biblioteca.control;
import com.twu.biblioteca.db.DataSources;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.User;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author:xiaoq
 * @date:2019/8/11 10:34
 */
public class MenuManager {

    public static void welcome(User user) {
        System.out.println(DataSources.WELCOME);
        System.out.println(DataSources.BLANK);
        System.out.println(DataSources.SERVICELIST);
        if (user.isGuest()) {
            System.out.println(DataSources.LOGIN);
        }
        System.out.println(DataSources.LISTOFBOOKS);
        System.out.println(DataSources.LISTOFMOVIES);
        System.out.println(DataSources.QUIT);
    }

    public static void book(User user) {
        System.out.println(DataSources.BLANK);
        System.out.println(DataSources.SERVICELIST);
        System.out.println(DataSources.CHECKBOOK);
        System.out.println(DataSources.RETURNBOOK);
        if (!user.isGuest()) {
            System.out.println(DataSources.VIEWCHECKEDBOOKS);
        }

        basic();
    }

    public static void movie() {
        System.out.println(DataSources.BLANK);
        System.out.println(DataSources.SERVICELIST);
        System.out.println(DataSources.CHECKMOVIE);
        basic();
    }

    public static void guest() {
        System.out.println(DataSources.BLANK);
        System.out.println(DataSources.SERVICELIST);
        basic();
    }

    private static void basic() {
        System.out.println(DataSources.BACKUP);
        System.out.println(DataSources.QUIT);
    }

    public static void loginSuccess() {
        System.out.println(DataSources.BLANK);
        System.out.println(DataSources.SERVICELIST);
        System.out.println(DataSources.VIEWCHECKEDBOOKS);
        System.out.println(DataSources.VIEWUSERDETAIL);
        basic();
    }

    public static void loginFailed() {
        System.out.println(DataSources.BLANK);
        System.out.println(DataSources.SERVICELIST);
        System.out.println(DataSources.RELOGINNOTES);
        basic();
    }

    public static Integer getMenuId(String option, Map<Integer, String> map) {
        Integer key = -1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (option.equals(entry.getValue())) {
                key = entry.getKey();
            }
        }
        return key;
    }

    private static String getAllMovies(ArrayList<Movie> movies) {
        String result = "name|year|director|rating\n";
        for (Movie movie : movies) {
            if (!movie.isCheckouted()) {
                result += movie.getTotalInfo() + "\n";
            }
        }
        return result;
    }

    public static void showListOfMovies(ArrayList<Movie> movies) {
        System.out.println(getAllMovies(movies));
    }
}
