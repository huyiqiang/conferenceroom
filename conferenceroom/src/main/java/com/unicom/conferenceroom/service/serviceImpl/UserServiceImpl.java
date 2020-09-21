package com.unicom.conferenceroom.service.serviceImpl;

import com.unicom.conferenceroom.dao.user.UserDao;
import com.unicom.conferenceroom.entity.user.User;
import com.unicom.conferenceroom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    public User selectUserByName(String sss) {
        //调用dao层
        User user = userDao.selectUserByName(sss);
        return user;//返回的是Json数据，因为RestController注解中有@ResponseBody的作用
    }

    @Override
    public ArrayList<User> selectUserAll() {
        ArrayList<User> list = userDao.selectUserAll();
        return list;
    }

    @Override
    public int insertUser(User user) {
        int num=userDao.insertUser(user);
        return num;
    }

    @Override
    public int deleteUser(String id) {
        int num=userDao.deleteUser(id);
        return num;
    }

    @Override
    public int updateUser(User user) {
        int num=userDao.updateUser(user);
        return num;
    }

    @Override
    public List<User> findByWhere(User user) {
        ArrayList<User> list=userDao.findByWhere(user);
        return list;
    }
}
