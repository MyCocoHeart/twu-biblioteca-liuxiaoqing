package com.twu.biblioteca.control;
import com.twu.biblioteca.db.DataSources;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.User;

import java.util.ArrayList;

/**
 * @author:xiaoq
 * @date:2019/8/11 11:22
 */
public class UserManager {

    public User getUserByName(String userName, ArrayList<User> users) {
        for (User user : DataSources.USERS) {
            if (user.getName().equals(userName)) {
                return user;
            }
        }
        return null;
    }

    public void start(IOManager ioManager, User user) {
        boolean flag = false;
        while (!flag) {
            if (user.isGuest()) {
                login(ioManager, user);
            }

            if (!user.isGuest()) {
                MenuManager.loginSuccess();
            } else {
                MenuManager.loginFailed();
            }

            String option = ioManager.getInput(DataSources.OPTIONSELECT);
            Integer optionId = MenuManager.getMenuId(option, DataSources.LOGINEDOPTIONS);
            switch (optionId) {
                case 1:
                    showUserDetail(user);
                    break;
                case 2:
                    showCheckedOutBooksDetail(user);
                    break;
                case 3:
                    break;
                case 4:
                    MenuManager.welcome(user);
                    flag = true;
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    public void login(IOManager ioManager, User user) {
        ArrayList<String> userInfo = getUserInfo(ioManager);
        if (userInfo != null) {
            User userSelect = getUserByName(userInfo.get(0), DataSources.USERS);
            if (isValidUser(userSelect, userInfo.get(1))) {
                System.out.println(DataSources.LOGINSUCCESSNOTES);
                user.updateUser(userSelect);
                return;
            }
        }
        System.out.println(DataSources.LOGINFAILEDNOTES);
        return;
    }

    public void showUserDetail(User user) {
        System.out.println("name|email|phone");
        System.out.println(user.getUserDetail());
    }

    static void showCheckedOutBooksDetail(User user) {
        ArrayList<Integer> ids = user.getCheckedOutBooksID();
        for (Integer id : ids) {
            Book checkedOutBook = Book.getBookById(id, DataSources.BOOKS);
            if (checkedOutBook != null) {
                System.out.println(checkedOutBook.getTotalInfo());
            }
        }
    }

    private boolean isValidUser(User user, String password) {
        return (user != null && isCorrectPassWord(password, user));
    }

    private boolean isCorrectPassWord(String password, User user) {
        return user.getPassword().equals(password);
    }

    private ArrayList<String> getUserInfo(IOManager ioManager) {
        ArrayList<String> loginMessage = new ArrayList<String>();
        loginMessage.add((ioManager.getInput("please input your username:")));
        loginMessage.add(ioManager.getInput("please input your password:"));
        return loginMessage;
    }

}
