package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.start();
    }
     public void start() {
         MainPage mainPage = new MainPage();
         mainPage.showMessages();
     }
}
