package com.mapper;

import com.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    void saveUser(@Param("user") UserEntity user);

    void deleteUserById(@Param("userId")Integer UserId);

    void updateUserById(@Param("user") UserEntity user);

    List<UserEntity> queryUserList();
}
