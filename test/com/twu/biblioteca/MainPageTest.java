package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * @author:xiaoq
 * @date:2019/8/8 18:59
 */
public class MainPageTest {
    private PrintStream console = null;
    private ByteArrayOutputStream bytes = null;

    @Before
    public void setUp() {

        bytes = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(bytes));

    }
    @After
    public void tearDown() {
        System.setOut(console);
    }

    @Test
    public void createAMainPageObject() {
        new MainPage();
    }

    @Test
    public void showAllMessagesOfMainPage() {
        MainPage mainPage = new MainPage();
        mainPage.showMessages();
        String expected = "Welocme to Biblioteca. You one-stop-shop for great book titles in Bangalore!\n" +
                                "List of books";
        assertEquals(expected,bytes.toString().trim().replace("\r",""));
    }

}