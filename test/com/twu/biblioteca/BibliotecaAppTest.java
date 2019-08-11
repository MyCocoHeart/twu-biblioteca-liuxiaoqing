package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author:xiaoq
 * @date:2019/8/8 16:20
 */
public class BibliotecaAppTest {
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



}