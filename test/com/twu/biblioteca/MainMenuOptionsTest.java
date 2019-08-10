package com.twu.biblioteca;

import com.twu.biblioteca.model.MainMenuOptions;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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

    @Test
    public void returnAEmptyMenuOptions() {
        MainMenuOptions mainMenuOptions = new MainMenuOptions();
        Map<Integer, String> map = mainMenuOptions.getMenuOptions();
        String result = map.get(1);
        assertEquals(null,result);
    }
    @Test
    public void returnAMenuOptions() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Books");
        map.put(2, "Others");
        MainMenuOptions mainMenuOptions = new MainMenuOptions(map);
        Map<Integer, String> resultMap = mainMenuOptions.getMenuOptions();
        String result = resultMap.get(1);
        String expected = "Books";
        assertEquals(expected,result);
    }

    @Test
    public void addAOption() {
        MainMenuOptions mainMenuOptions = new MainMenuOptions();
        mainMenuOptions.addOption(1,"Books");
        Map<Integer, String> resultMap = mainMenuOptions.getMenuOptions();
        Integer result = resultMap.size();
        Integer expected = 1;
        assertEquals(expected,result);

    }

}