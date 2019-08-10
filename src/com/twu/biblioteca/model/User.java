package com.twu.biblioteca.model;

import javax.jws.soap.SOAPBinding;
import java.security.PublicKey;

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

    public User(Integer id, String name, String email,String phone,String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
}
