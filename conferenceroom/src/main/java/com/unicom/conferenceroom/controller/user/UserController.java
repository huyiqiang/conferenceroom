package com.unicom.conferenceroom.controller.user;

import com.alibaba.fastjson.JSON;
import com.unicom.conferenceroom.dao.user.UserDao;
import com.unicom.conferenceroom.entity.user.User;
import com.unicom.conferenceroom.service.UserService;
import com.unicom.conferenceroom.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.log.LogInputStream;

import java.util.ArrayList;
import java.util.List;


@RestController//相当于@Controller与@ResponseBody
public class UserController {
    //依赖注入
    @Autowired
    UserService userService;

    @RequestMapping(value = "findByWhere")
    public String findByWhere(@RequestBody User user) {
        if (user==null){
            user = new User();
        }
        List<User> list = userService.findByWhere(user);
        return JSON.toJSONString(list);//返回的是Json数据，因为RestController注解中有@ResponseBody的作用
    }
//    查询所有用户
    @RequestMapping(value = "findUserAll")
    public String findUserAll() {
        ArrayList<User> list = userService.selectUserAll();
        return JSON.toJSONString(list);//返回的是Json数据，因为RestController注解中有@ResponseBody的作用
    }
    //  添加用户
    @RequestMapping(value = "insertUser")
    public String insertUser(@RequestBody User user) {
        userService.insertUser(user);
        List<User> byWhere = userService.findByWhere(user);
        int num =0;
        for (User u:byWhere) {
          num = u.getId();
        }
        return JSON.toJSONString(Result.success(num));//返回的是Json数据，因为RestController注解中有@ResponseBody的作用
    }
    //  删除用户
    @RequestMapping(value = "deleteUser")
    public String deleteUser(String id) {
        int num = userService.deleteUser(id);
        return JSON.toJSONString(Result.success(num));//返回的是Json数据，因为RestController注解中有@ResponseBody的作用
    }
    //  更新用户
    @RequestMapping(value = "updateUser")
    public String updateUser(@RequestBody User user) {
        int num = userService.updateUser(user);
        return JSON.toJSONString(Result.success(num));//返回的是Json数据，因为RestController注解中有@ResponseBody的作用
    }
}
