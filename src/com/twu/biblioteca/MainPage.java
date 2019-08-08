package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:xiaoq
 * @date:2019/8/8 18:53
 */
public class MainPage {
    private WelcomeInfo welcomeInfo;
    private MainMenuOptions mainMenuOptions;

    public MainPage() {
        String welcomeMessage = "Welocme to Biblioteca. You one-stop-shop for great book titles in Bangalore!";
        this.welcomeInfo = new WelcomeInfo(welcomeMessage);
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Books");
        this.mainMenuOptions = new MainMenuOptions(map);
    }

}
