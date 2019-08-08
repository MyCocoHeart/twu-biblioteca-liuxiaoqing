package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.SQLIntegrityConstraintViolationException;

import static org.junit.Assert.*;

/**
 * @author:xiaoq
 * @date:2019/8/8 20:53
 */
public class ControllerTest {
    @Test
    public void shouldGetAInteger() throws Exception{
        String data = "List of books";
        String input;
        InputStream stdin = System.in;
        Controller controller = new Controller();

        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            controller.begin();
            input = controller.getInput();
        } finally {
            System.setIn(stdin);
            controller.close();

        }
        String expected = data;
        assertEquals(data,input);
    }

}