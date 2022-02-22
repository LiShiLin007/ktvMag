package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.RouteMatcher;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2021-11-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;
    private boolean code;
   public User user = new User();

    @Override
    public User sing(String username, String password) {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("2021");
        if (username == null){
            System.out.println("用户名为空！");
            return null;
        }else if (password == null){
            System.out.println("密码为空！");
            return null;
        }else {
            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("username",username);
            //User user  = userMapper.selectOne(queryWrapper);
            if (user == null){
                System.out.println("不存在该用户！");
                return null;
            }else if (user.getPassword().equals(password)){
                System.out.println("密码正确");
                user.setToken(JwtUtil.createToken());
                this.user = user;
                return user;
            }
        }
        return null;
    }
    @Override
    public void setCode(boolean code) {
        this.code = code;
    }
    @Override
    public boolean getCode() {
        return this.code;
    }
}
