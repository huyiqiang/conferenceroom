package com.unicom.conferenceroom.controller.user;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.unicom.conferenceroom.entity.user.User;
import com.unicom.conferenceroom.service.LoginService;
import com.unicom.conferenceroom.util.ResponseCodeEnum;
import com.unicom.conferenceroom.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@CrossOrigin
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, @RequestBody User user) {
        Assert.notNull(user,"参数错误！");
        if (StringUtils.isEmpty(user.getUsername()) || StringUtils.isEmpty(user.getPassword())) {
            return JSON.toJSONString(Result.failure(ResponseCodeEnum.ERROR, "用户名或密码不能为空！"));
        }
        List<User> list = loginService.selectUser(user);
        if (list.isEmpty()) {
            return JSON.toJSONString(Result.failure(ResponseCodeEnum.ERROR, "用户名或密码错误！"));
        } else if(!list.isEmpty()){
            Map<String, Object> map = new HashMap<String, Object>();
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            session.setMaxInactiveInterval(0);
            return JSON.toJSONString(Result.success(map));
        }else{
            return JSON.toJSONString(Result.failure(ResponseCodeEnum.ERROR,"系统错误，请稍后重试！"));
        }
    }
}
