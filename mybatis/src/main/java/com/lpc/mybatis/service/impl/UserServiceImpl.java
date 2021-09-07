package com.lpc.mybatis.service.impl;

import com.lpc.mybatis.domain.User;
import com.lpc.mybatis.mapper.UserMapper;
import com.lpc.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author byu_rself
 * @create 2021/9/7 21:46
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper UserMapper;

    @Override
    public List<User> selectAllUser() {
        List<User> userList = UserMapper.selectAllUser();
        return userList;
    }

    @Override
    public User queryUserById(Integer id) {
        return UserMapper.queryUserById(id);
    }

    @Override
    public int addUser(User user) {
        return UserMapper.addUser(user);
    }

    @Override
    public int updateUserById(User user) {
        return UserMapper.updateUserById(user);
    }

    @Override
    public int deleteUserById(int id) {
        return UserMapper.deleteUserById(id);
    }
}
