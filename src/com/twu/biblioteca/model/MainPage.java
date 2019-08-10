package com.twu.biblioteca.model;

import com.twu.biblioteca.db.DataSources;

import java.util.Map;

/**
 * @author:xiaoq
 * @date:2019/8/8 18:53
 */
public class MainPage {
    private WelcomeInfo welcomeInfo;
    private MainMenuOptions mainMenuOptions;

    public MainPage() {
        this.welcomeInfo = new WelcomeInfo(DataSources.WELCOMEMESSAGE);
        this.mainMenuOptions = new MainMenuOptions(DataSources.MENUOPTIONSMAP);
    }

    public void showMessages() {
        showWelcomeMessages();
        showMainMenuOptions();
    }

    private void showWelcomeMessages() {
        this.welcomeInfo.showWelcomeMessages();
    }

    private void showMainMenuOptions() {
        Map<Integer, String> map = getMenuOptions();
        printMenuOptions(map);
    }

    private void printMenuOptions(Map<Integer, String> map) {
        if (!isEmptyMenuOptions(map)) {
            for (Integer key : map.keySet()) {
                System.out.println(map.get(key));
            }
        } else {
            System.out.println("暂无服务\n");
        }
    }

    private Map<Integer, String> getMenuOptions() {
        return this.mainMenuOptions.getMenuOptions();
    }

    private boolean isEmptyMenuOptions(Map<Integer, String> map) {
        return map.isEmpty();
    }

}
