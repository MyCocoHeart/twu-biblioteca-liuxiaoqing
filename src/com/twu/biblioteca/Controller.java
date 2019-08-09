package com.twu.biblioteca;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author:xiaoq
 * @date:2019/8/8 20:48
 */
public class Controller {
    private Scanner sc ;

    public void begin() {
        this.sc = new Scanner(System.in);
    }
    public String getInput() {
        return this.sc.nextLine();
    }
    public void close() {
        this.sc.close();
    }

    public static void getNotified(String message) {
        System.out.println(message);
    }

    public Integer getOptions() {
        while (true) {
            String option = this.getInput();
            Integer optionKey = MainMenuOptions.getOptionKey(option, DataSources.MENUOPTIONSMAP);
            switch (optionKey) {
                case 1://bookList
                   return optionKey;
                case -1:
                    Controller.getNotified(DataSources.OPTIONNOTIFIEDMESSAGE);
                    break;
            }
        }
    }

    public String getAllBooks(ArrayList<Book> books) {
        String result= "name|author|year of publication\n";
        for (Book book : books) {
            result +=book.getTotalInfo()+"\n";
        }
        return result;
    }

    public void showListOfBooks(ArrayList<Book> books) {
        System.out.print(getAllBooks(books));
    }

}
