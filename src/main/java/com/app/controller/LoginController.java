package com.app.controller;

import com.app.entity.Login;
import com.app.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/***
 * 登陆相关
 */

@Controller
@RequestMapping("/login/")
public class LoginController {

    @Resource(name = "loginService")
      LoginService loginService;

    @RequestMapping("doLogin")
    @ResponseBody
    public List doLogin(){

        List<Login> list = loginService.getData();

        return list;
    }
}
