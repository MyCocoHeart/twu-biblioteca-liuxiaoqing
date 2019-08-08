package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * @author:xiaoq
 * @date:2019/8/8 15:45
 */
public class WelcomePageTest {
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
    public void shouldPrintWelcomeMassages() {
        String message= "Welocme to Biblioteca. You one-stop-shop for great book titles in Bangalore!";
        WelcomePage welcomePage = new WelcomePage(message);
        welcomePage.showWelcomeMessages();
        String expected = new String("Welocme to Biblioteca. You one-stop-shop for great book titles in Bangalore!");
        assertEquals(expected,bytes.toString().trim().replace("\r",""));
    }
}
