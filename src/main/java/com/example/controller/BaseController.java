package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.pojo.User;
import com.example.service.UserService;
import com.example.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})
public class BaseController  {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);
    @Resource(name = "UserService")
    private UserService userService;
    //映射一个action
    @RequestMapping("/comet")
    public  String comet(){
        //输出日志文件
        logger.info("the first jsp pages");
        //返回一个index.jsp这个视图
        return "comet";
    }
    @ResponseBody
    @RequestMapping(value = "/test.do")
    public JSONObject userAll(Model model, @RequestParam(value = "str",required = false)String str, HttpServletRequest request, HttpServletResponse  response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<User> userALL= userService.getUserALL();
        JSONObject jsonObject;
        JSONArray jsonArray = new JSONArray();
        for ( User user:userALL) {
            jsonObject = new JSONObject();
            jsonObject.put("userID",user.getUserid());
            jsonObject.put("userName",user.getUsername());
            jsonObject.put("age",user.getAge());
            jsonObject.put("sex",user.getSex());
            jsonArray.add(jsonObject);
        }
        jsonObject = new JSONObject();
        jsonObject.put("userALL",jsonArray);
        return jsonObject;
    }
    @ResponseBody
    @RequestMapping(value = "/getUserById.do")
    public JSONObject userByID(Model model,@RequestParam(value ="id",required = false)String id,HttpServletRequest request,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        JSONObject jsonObject = new JSONObject();
        if(!"".equals(id)) {
            try{
                User user = userService.getUserById(id);
                jsonObject.put("state","200");
                jsonObject.put("userID", user.getUserid());
                jsonObject.put("userName", user.getUsername());
                jsonObject.put("age", user.getAge());
                jsonObject.put("sex", user.getSex());
            }catch (Exception e){
                //110   表示输入格式有误；
                jsonObject.put("state","110");
            }

        }else{
            //100表示没有输入相应的值；
            jsonObject.put("state","100");
        }

        return jsonObject;
    }
    /**
     *
     * @param model
     * @param username
     * @param password
     * @param response
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/login.do")
    public JSONObject login(Model model,@RequestParam(value = "username") String username,@RequestParam(value = "password") String password,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        JSONObject jsonObject = new JSONObject();
        logger.info(username);
        if(username.equals("admin")&&password.equals("111111")){
            jsonObject.put("state","200");
            logger.info("登录成功");
        }else{
            logger.info("登录异常");
            jsonObject.put("state","-1");
        }
        return  jsonObject;

    }
}
