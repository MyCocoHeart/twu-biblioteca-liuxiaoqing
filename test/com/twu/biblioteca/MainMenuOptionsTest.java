package com.twu.biblioteca;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * @author:xiaoq
 * @date:2019/8/8 17:29
 */
public class MainMenuOptionsTest {
    @Test
    public void createAMainMenuOptionsObject() {
        MainMenuOptions mainMenuOptions = new MainMenuOptions();
    }
    @Test
    public void createAMainMenuOptionsObjectWhenGivenAMap() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Books");
        map.put(2, "Others");
        MainMenuOptions mainMenuOptions = new MainMenuOptions(map);
    }

}