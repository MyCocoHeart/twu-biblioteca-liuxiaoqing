package com.twu.biblioteca;

/**
 * @author:xiaoq
 * @date:2019/8/8 15:40
 */
public class WelcomeInfo {
    private String welcomeMessage;

    public WelcomeInfo(String message) {
        this.welcomeMessage = message;
    }

    public void showWelcomeMessages() {
        System.out.println(this.welcomeMessage);
    }
}