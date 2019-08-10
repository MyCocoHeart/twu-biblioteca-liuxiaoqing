package com.twu.biblioteca.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:xiaoq
 * @date:2019/8/8 17:09
 */
public class MainMenuOptions {
    private Map<Integer, String> mainMenuMap;

    public MainMenuOptions() {

         this.mainMenuMap = new HashMap<Integer, String>();
    }

    public MainMenuOptions(Map<Integer,String> map) {
        this.mainMenuMap = map;
    }

    public Map<Integer, String> getMenuOptions() {
        return this.mainMenuMap;
    }
    public void addOption(Integer key,String value) {
        this.mainMenuMap.put(key, value);
    }

    public static Integer getOptionKey(String value,Map<Integer,String> map) {
        Integer key=-1;
        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            if(value.equals(entry.getValue())){
                key=entry.getKey();
            }
        }
        return key;

    }

}
