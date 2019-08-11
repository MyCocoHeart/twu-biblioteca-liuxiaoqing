package com.twu.biblioteca.control;
import com.twu.biblioteca.db.DataSources;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.User;

import java.util.ArrayList;

/**
 * @author:xiaoq
 * @date:2019/8/11 14:58
 */
public class BookManager {
    public static void start(IOManager ioManager, User user) {
        boolean flag = false;
        while (!flag) {
            if (!user.isGuest()) {
                MenuManager.book(user);
            } else {
                MenuManager.guest();
            }
            String option = ioManager.getInput(DataSources.OPTIONSELECT);
            Integer optionId = MenuManager.getMenuId(option, DataSources.BOOKSOPTIONS);
            switch (optionId) {
                case 1:
                    checkoutBook(ioManager, user);
                    break;
                case 2:
                    returnBook(ioManager, user);
                    break;
                case 3:
                    UserManager.showCheckedOutBooksDetail(user);
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

    public static void showListOfBooks(ArrayList<Book> books) {
        System.out.print(getAllBooks(books));
    }

    private static String getAllBooks(ArrayList<Book> books) {
        String result = "name|author|year of publication\n";
        for (Book book : books) {
            if (!book.getCheckStatus()) {
                result += book.getTotalInfo() + "\n";
            }
        }
        return result;
    }

    private static void checkoutBook(IOManager ioManager, User user) {
        Book selectBook = null;
        while (selectBook == null) {
            String selectName = ioManager.getInput("Please input the name of book you want to checkout:");
            selectBook = Book.getBookByName(selectName, DataSources.BOOKS);
            if (selectBook == null) {
                System.out.println(DataSources.CHECKOUTBOOKUNSUCCESSFULNOTES);
            }
        }
        selectBook.checkout(user);
    }

    private static void returnBook(IOManager ioManager, User user) {
        Book selectBook = null;
        while (selectBook == null) {
            String selectName = ioManager.getInput("Please input the name of book you want to Return:");
            selectBook = Book.getBookByName(selectName, DataSources.BOOKS);
            if (selectBook == null) {
                System.out.println(DataSources.RETURNFAILEDNOTES);
            }
        }
        selectBook.returnBook(user);

    }

}
