package com.twu.biblioteca.model;

import java.util.ArrayList;

/**
 * @author:xiaoq
 * @date:2019/8/10 14:58
 */
public class User {
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private String password;
    private ArrayList<Integer> checkedOutBooksID;
    private ArrayList<Integer> checkedOutMoviesID;

    public User(){
        id = -1;
    }

    public User(Integer id, String name, String email, String phone, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.checkedOutBooksID = new ArrayList<Integer>();
        this.checkedOutMoviesID = new ArrayList<Integer>();
    }

    public void updateUser(User src){
        this.id = src.id;
        this.name = src.name;
        this.email = src.email;
        this.phone = src.phone;
        this.password = src.password;
        this.checkedOutBooksID = src.checkedOutBooksID;
        this.checkedOutMoviesID = src.checkedOutMoviesID;
    }

    public String getName() {
        return this.name;
    }

    public Integer getID(){
        return this.id;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUserDetail() {
        return name + "|" + email + "|" + phone;
    }

    public ArrayList<Integer> getCheckedOutBooksID() {
        return this.checkedOutBooksID;
    }
    public void addCheckedOutBooksID(Integer id) {
        checkedOutBooksID.add(id);
    }
    public void addCheckedOutMoviesID(Integer id) {
        checkedOutMoviesID.add(id);
    }

    public void removeCheckedOutBooksID(Integer id) {
        checkedOutBooksID.remove(id);
    }

    public boolean isGuest(){
        return this.id == -1;
    }

}
