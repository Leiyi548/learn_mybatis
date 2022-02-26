package com.leiyi.dao;

import com.leiyi.pojo.User;

import java.util.List;

/**
 * @author Leiyi548
 * @date 2022/2/24 4:33 下午
 */
public interface UserDao {
    List<User> getUserList();
    User getUserById(int id);
    int addUser(User user);
    int updateUserById(User user);
    int dropUserById(int id);
}
