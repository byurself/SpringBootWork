package com.lpc.mybatis.service;

import com.lpc.mybatis.domain.User;

import java.util.List;

/**
 * @author byu_rself
 * @create 2021/9/7 21:44
 */

public interface UserService {

    List<User> selectAllUser();

    User queryUserById(Integer id);

    int addUser(User user);

    int updateUserById(User user);

    int deleteUserById(int id);

}
