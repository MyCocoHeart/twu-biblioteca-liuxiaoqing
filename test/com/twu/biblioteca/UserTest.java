package com.twu.biblioteca;

import com.twu.biblioteca.model.User;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author:xiaoq
 * @date:2019/8/10 14:59
 */
public class UserTest {
    @Test
    public void createAUserObjecct() {
        User user = new User(1, "zhang-xiaoHong", "12345@163.com", "18209271624", "123456");
    }

}