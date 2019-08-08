package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.start();
    }
     public void start() {
        String welcomeMessage = "Welocme to Biblioteca. You one-stop-shop for great book titles in Bangalore!";
         WelcomeInfo welcomePage = new WelcomeInfo(welcomeMessage);
         welcomePage.showWelcomeMessages();

     }
}
