package com.twu.biblioteca;


public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.start();

    }
     public void start() {
         showWelcomePage();
         Controller controller = new Controller();
         controller.begin();
         System.out.println("Please input your service option:");
         Integer optionKey = controller.getOptions();
         controller.close();
         if (optionKey == 1) {
             controller.showListOfBooks(DataSources.BOOKS);
         }

     }

    private static void showWelcomePage() {
        MainPage mainPage = new MainPage();
        mainPage.showMessages();
    }
}
