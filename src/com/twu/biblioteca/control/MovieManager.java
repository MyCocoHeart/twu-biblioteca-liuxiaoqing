package com.twu.biblioteca.control;
import com.twu.biblioteca.db.DataSources;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.User;

/**
 * @author:xiaoq
 * @date:2019/8/11 17:29
 */
public class MovieManager {
    public static void start(IOManager ioManager, User user) {
        boolean flag = false;
        while (!flag) {
            if (!user.isGuest()) {
                MenuManager.movie();
            } else {
                MenuManager.guest();
            }
            String option = ioManager.getInput(DataSources.OPTIONSELECT);
            Integer optionId = MenuManager.getMenuId(option, DataSources.MOVIESOPTIONS);
            switch (optionId) {
                case 1:
                    checkoutMovie(ioManager, user);
                    break;
                case 2:
                    MenuManager.welcome(user);
                    flag = true;
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    private static void checkoutMovie(IOManager ioManager, User user) {
        Movie selectMovie = null;
        while (selectMovie == null) {
            String name = ioManager.getInput("Please input the name of movie you want to checkout:");
            selectMovie = Movie.getMovieByName(name, DataSources.MOVIES);
            if (selectMovie == null) {
                System.out.println(DataSources.CHECKOUTMOVIEUNSUCCESSFULNOTES);
            }
        }
        selectMovie.checkout(user);
    }
}
