package com.unicom.conferenceroom.service;

import com.unicom.conferenceroom.entity.user.User;

import java.util.List;

public interface LoginService {
    public List<User> selectUser(User user);
}
