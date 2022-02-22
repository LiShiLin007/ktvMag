package com.example.controller;


import com.example.entity.User;
import com.example.service.UserService;
import com.example.service.impl.UserServiceImpl;
import com.example.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2021-11-30
 */
@RestController
@RequestMapping("//user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public User login(@RequestBody User user){
        User t = this.userService.sing(user.getUsername(),user.getPassword());
        if (t!=null){
            this.userService.setCode(true);
            return t;
        }else {
            this.userService.setCode(false);
            return null;
        }
    }
    //退出登录
    @GetMapping("logout")
    public void logout(){
        this.userService.setCode(false);
    }
    //验证token
    @GetMapping("/checkToken")
    public boolean checkToken(HttpServletRequest request){
        String token =  request.getHeader("token");
        return JwtUtil.checkToken(token);
    }
    @GetMapping("/getToken")
    public boolean getToken(){
        return this.userService.getCode();//如果没有登录，给主页返回一个false
    }
    /*
    User user = new User();
        user.setUsername("admin");
                user.setPassword("2021");
                if (username==null) {
                System.out.println("用户名不能为空");
                return null;
                }
                else if (password==null){
                System.out.println("密码不能为空");
                return null;
                }
                else {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("登录成功");
                user.setToken(JwtUtil.createToken());//设置token信息
                return user;
                }
                else{
                System.out.println("用户名或密码错误");
                return null;
                }


 */
}
