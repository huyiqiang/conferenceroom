package com.unicom.conferenceroom.dao.user;

import com.unicom.conferenceroom.entity.user.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    User selectUserByName(String name);
}
