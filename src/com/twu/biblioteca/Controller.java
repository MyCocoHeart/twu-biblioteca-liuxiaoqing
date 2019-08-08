package com.twu.biblioteca;

import java.util.Scanner;

/**
 * @author:xiaoq
 * @date:2019/8/8 20:48
 */
public class Controller {
    private Scanner sc ;

    public void begin() {
        this.sc = new Scanner(System.in);
    }
    public String getInput() {
        System.out.println("Please input your service option：\n");
        return this.sc.nextLine();
    }
    public void close() {
        this.sc.close();
    }


}
