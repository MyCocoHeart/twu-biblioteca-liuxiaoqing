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
    public void showMessages() {
        showWelcomeMessages();
        showMainMenuOptions();
    }
    private void showWelcomeMessages() {
        this.welcomeInfo.showWelcomeMessages();
    }

    private void showMainMenuOptions() {
        Map<Integer,String> map = getMenuOptions();
        printMenuOptions(map);
    }

    private void printMenuOptions(Map<Integer,String> map) {
        String tip;
        if (!isEmptyMenuOptions(map)) {
            tip = "\n请根据以下选项，选择您需要查看内容:";
            System.out.println(tip);
            for (Integer key : map.keySet()) {
                System.out.println("选择" + map.get(key) + "服务,请输入" + key);
            }
        } else {
            tip = "暂无服务\n";
            System.out.println(tip);
        }
    }

    private Map<Integer, String> getMenuOptions() {
        return this.mainMenuOptions.getMenuOptions();
    }
    private boolean isEmptyMenuOptions(Map<Integer,String > map) {
        return map.isEmpty();
    }

}
