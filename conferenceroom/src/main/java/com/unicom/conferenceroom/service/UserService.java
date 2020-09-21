package com.unicom.conferenceroom.service;

import com.unicom.conferenceroom.entity.user.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {


    ArrayList<User> selectUserAll();

    int insertUser(User user);

    int deleteUser(String id);

    int updateUser(User user);

    List<User> findByWhere(User user);
}
