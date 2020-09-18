package com.unicom.conferenceroom.controller.user;

import com.unicom.conferenceroom.entity.user.User;
import com.unicom.conferenceroom.service.LoginService;
import com.unicom.conferenceroom.util.ResponseCodeEnum;
import com.unicom.conferenceroom.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result login(HttpServletRequest request, User user) {
        Assert.notNull(user,"参数错误！");
        if (StringUtils.isEmpty(user.getUsername()) || StringUtils.isEmpty(user.getPassword())) {
            return Result.failure(ResponseCodeEnum.ERROR, "用户名或密码不能为空！");
        }
        List<User> list = loginService.selectUser(user);
        if (list.isEmpty()) {
            return Result.failure(ResponseCodeEnum.ERROR, "用户名或密码！");
        } else if(!list.isEmpty()){
            Map<String, Object> map = new HashMap<String, Object>();
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            session.setMaxInactiveInterval(0);
            return Result.success(map);
        }else{
            return Result.failure(ResponseCodeEnum.ERROR,"系统错误，请稍后重试！");
        }
    }
}
