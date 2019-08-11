package com.twu.biblioteca.control;

import java.util.Scanner;

/**
 * @author:xiaoq
 * @date:2019/8/11 10:56
 */
public class IOManager {

    private Scanner scanner;

    public void begin() {
        this.scanner = new Scanner(System.in);
    }

    public String getInput(String message) {
        if (message.length() != 0) {
            System.out.println(message);
        }
        return scanner.nextLine();

    }

    public void close() {
        scanner.close();
    }
}
