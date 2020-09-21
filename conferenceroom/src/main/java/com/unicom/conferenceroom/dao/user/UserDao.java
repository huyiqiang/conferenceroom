package com.unicom.conferenceroom.dao.user;

import com.unicom.conferenceroom.entity.user.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface UserDao {
    User selectUserByName(String name);

    List<User> selectUser(User user);

    ArrayList<User> selectUserAll();

    int insertUser(User user);

    int deleteUser(String id);

    int updateUser(User user);

    ArrayList<User> findByWhere(User user);
}
