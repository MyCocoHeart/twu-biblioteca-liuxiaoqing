package com.twu.biblioteca;


import com.twu.biblioteca.control.Controller;
import com.twu.biblioteca.db.DataSources;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.MainPage;
import com.twu.biblioteca.model.Movie;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.start();

    }

    public void start() {
        showWelcomePage();
        Controller controller = new Controller();
        controller.begin();
        boolean tipFlag = true;
        while (true) {
            if (tipFlag) {
                System.out.println("Please input your service option:");
            }
            Integer optionKey = controller.getOptions();
            switch (optionKey) {
                case 1:
                    controller.showListOfBooks(DataSources.BOOKS);
                    tipFlag = true;
                    break;
                case 2:
                    System.out.println("Please input the name of book you want to checkout:");
                    checkoutBook(controller);
                    tipFlag = true;
                    break;
                case 3:
                    System.out.println("Please input the name of book you want to Return:");
                    returnBook(controller);
                    tipFlag = true;
                    break;
                case 4:
                    controller.showListOfMovies(DataSources.MOVIES);
                    tipFlag = true;
                    break;
                case 5:
                    System.out.println("Please input the name of movie you want to checkout:");
                    checkoutMovie(controller);
                    tipFlag = true;
                    break;
                case 6:
                    controller.close();
                    return;
                default:
                    System.out.println(DataSources.OPTIONNOTIFIEDMESSAGE);
                    tipFlag = false;
            }
        }
    }

    private static void showWelcomePage() {
        MainPage mainPage = new MainPage();
        mainPage.showMessages();
    }

    private static void checkoutBook(Controller controller) {
        Book selectBook = null;
        while (selectBook == null) {
            String selectName = controller.getInput();
            selectBook = Book.getBookByName(selectName, DataSources.BOOKS);
            if (selectBook == null) {
                System.out.println(DataSources.CHECKOUTBOOKUNSUCCESSFULNOTES);
            }
        }
        selectBook.checkout();
    }
    private static void checkoutMovie(Controller controller) {
        Movie selectMovie = null;
        while (selectMovie == null) {
            String name = controller.getInput();
            selectMovie = Movie.getMovieByName(name, DataSources.MOVIES);
            if (selectMovie == null) {
                System.out.println(DataSources.CHECKOUTMOVIEUNSUCCESSFULNOTES);
            }
        }
        selectMovie.checkout();
    }

    private static void returnBook(Controller controller) {
        Book selectBook = null;
        while (selectBook == null) {
            String selectName = controller.getInput();
            selectBook = Book.getBookByName(selectName, DataSources.BOOKS);
            if (selectBook == null) {
                System.out.println(DataSources.RETURNFAILEDNOTES);
            }
        }
        selectBook.returnBook();

    }

}
