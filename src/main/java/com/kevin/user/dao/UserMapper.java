package com.kevin.user.dao;

import com.kevin.user.model.UserDTO;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserDTO record);

    int insertSelective(UserDTO record);

    UserDTO selectByPrimaryKey(Integer userId);
    UserDTO userLogin(UserDTO record);

    int updateByPrimaryKeySelective(UserDTO record);

    int updateByPrimaryKey(UserDTO record);
}