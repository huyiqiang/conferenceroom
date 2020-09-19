package com.unicom.conferenceroom.service;

import com.unicom.conferenceroom.entity.user.User;

import java.util.ArrayList;

public interface UserService {
    public User selectUserByName(String sss);

    ArrayList<User> selectUserAll();

    int insertUser(User user);

    int deleteUser(String id);

    int updateUser(User user);
}
