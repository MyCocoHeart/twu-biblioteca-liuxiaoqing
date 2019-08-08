package com.twu.biblioteca;

/**
 * @author:xiaoq
 * @date:2019/8/8 15:40
 */
public class WelcomePage {
    private String welcomeMessage;


    public WelcomePage(String message) {
        this.welcomeMessage = message;
    }

    public void showWelcomeMessages() {
        System.out.println(this.welcomeMessage);
    }

}