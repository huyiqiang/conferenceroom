package com.unicom.conferenceroom.controller.user;

import com.unicom.conferenceroom.dao.user.UserDao;
import com.unicom.conferenceroom.entity.user.User;
import com.unicom.conferenceroom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController//相当于@Controller与@ResponseBody
public class UserController {
    //依赖注入
    @Autowired
    UserService userService;

    @RequestMapping(value = "find")
    public User findUserByName() {
        //调用dao层
        User user = userService.selectUserByName("SSS");
        return user;//返回的是Json数据，因为RestController注解中有@ResponseBody的作用
    }
}
