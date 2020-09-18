package com.unicom.conferenceroom.service.serviceImpl;

import com.unicom.conferenceroom.dao.user.UserDao;
import com.unicom.conferenceroom.entity.user.User;
import com.unicom.conferenceroom.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    UserDao userMapper;
    @Override
    public List<User> selectUser(User user) {
        return userMapper.selectUser(user);
    }
}
