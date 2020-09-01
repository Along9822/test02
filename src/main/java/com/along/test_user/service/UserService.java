package com.along.test_user.service;

import com.along.test_user.entity.user;

import java.util.List;

public interface UserService {
    List<user> findAllUser();
    int insertUser(user user);
    int updateUser(user user);
    int deleteUser(int id);
    List<user> findById(int id);
}
