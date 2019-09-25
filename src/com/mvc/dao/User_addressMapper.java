package com.mvc.dao;

import com.mvc.pojo.User_address;

public interface User_addressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User_address record);

    int insertSelective(User_address record);

    User_address selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_address record);

    int updateByPrimaryKey(User_address record);
}