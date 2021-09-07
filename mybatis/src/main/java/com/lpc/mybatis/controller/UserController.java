package com.lpc.mybatis.controller;

import com.lpc.mybatis.domain.User;
import com.lpc.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author byu_rself
 * @create 2021/9/7 21:09
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/selectAllUser")
    public List<User> selectAllUser(){
        List<User> userList = userService.selectAllUser();
        for (User user : userList) {
            System.out.println(user);
        }
        return userList;
    }

    @GetMapping("/queryUserById")
    public User queryUserById(){
        User user = userService.queryUserById(1);
        return user;
    }

    @GetMapping("/addUser")
    public String addUser(){
        userService.addUser(new User(null,"张三",18,"男","2021年9月7日"));
        return "添加成功";
    }

    @GetMapping("/updateUser")
    public String updateUser(){
        userService.updateUserById(new User(1,"Lpc",18,"男","2021年9月9日"));
        return "修改成功";
    }

    @GetMapping("/deleteUserById")
    public String deleteUserById(){
        userService.deleteUserById(2);
        return "删除成功";
    }

}
