package com.unicom.conferenceroom.service.serviceImpl;

import com.unicom.conferenceroom.dao.user.UserDao;
import com.unicom.conferenceroom.entity.user.User;
import com.unicom.conferenceroom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public User selectUserByName(String sss) {
        //调用dao层
        User user = userDao.selectUserByName("SSS");
        return user;//返回的是Json数据，因为RestController注解中有@ResponseBody的作用
    }
}
