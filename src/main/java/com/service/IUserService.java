package com.service;

import com.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserService {

    void saveUser(UserEntity user);

    void deleteUserById(Integer UserId);

    void updateUserById(UserEntity user);

    List<UserEntity> queryUserList();
}
