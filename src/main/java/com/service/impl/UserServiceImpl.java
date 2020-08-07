package com.service.impl;

import com.entity.UserEntity;
import com.mapper.UserMapper;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void saveUser(UserEntity user) {
        userMapper.saveUser(user);
    }

    @Override
    public void deleteUserById(Integer UserId) {
        userMapper.deleteUserById(UserId);
    }

    @Override
    public void updateUserById(UserEntity user) {
        userMapper.updateUserById(user);
    }


    @Override
    public List<UserEntity> queryUserList() {
        return userMapper.queryUserList();
    }
}
