package com.along.test_user.service.Impl;

import com.along.test_user.entity.user;
import com.along.test_user.mapper.UserMapper;
import com.along.test_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<user> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public int insertUser(user user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int updateUser(user user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public List<user> findById(int id) {
        return userMapper.findById(id);
    }
}
