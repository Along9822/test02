package com.along.test_user.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import com.along.test_user.entity.user;

@Mapper
public interface UserMapper {
    List<user> findAllUser();
    int insertUser(user user);
    int updateUser(user user);
    int deleteUser(int id);
    List<user> findById(int id);
}
