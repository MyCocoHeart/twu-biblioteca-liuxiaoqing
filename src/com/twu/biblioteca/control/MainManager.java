package com.twu.biblioteca.control;
import com.twu.biblioteca.db.DataSources;
import com.twu.biblioteca.model.User;

/**
 * @author:xiaoq
 * @date:2019/8/8 20:48
 */
public class MainManager {
    public static void start() {
        User user = new User();
        MenuManager.welcome(user);
        IOManager ioManager = new IOManager();
        ioManager.begin();
        boolean tipFlag = true;
        while (true) {
            if (tipFlag) {
                System.out.println("Please input your service option:");
            }
            String option = ioManager.getInput("");
            Integer optionKey = MenuManager.getMenuId(option, DataSources.MENUOPTIONS);
            switch (optionKey) {
                case 1:
                    BookManager.showListOfBooks(DataSources.BOOKS);
                    BookManager.start(ioManager, user);
                    tipFlag = true;
                    break;
                case 2:
                    MenuManager.showListOfMovies(DataSources.MOVIES);
                    MovieManager.start(ioManager, user);
                    tipFlag = true;
                    break;
                case 3:
                    UserManager userManager = new UserManager();
                    userManager.start(ioManager, user);
                    tipFlag = true;
                    break;
                case 4:
                    ioManager.close();
                    return;
                default:
                    System.out.println(DataSources.OPTIONNOTIFIEDMESSAGE);
                    tipFlag = false;
            }
        }
    }


}
