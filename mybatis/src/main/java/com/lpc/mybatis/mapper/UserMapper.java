package com.lpc.mybatis.mapper;

import com.lpc.mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author byu_rself
 * @create 2021/9/7 20:50
 */

@Mapper
@Repository
public interface UserMapper {

    List<User> selectAllUser();

    User queryUserById(Integer id);

    int addUser(User user);

    int updateUserById(User user);

    int deleteUserById(int id);

}
