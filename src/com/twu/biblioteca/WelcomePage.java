package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

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