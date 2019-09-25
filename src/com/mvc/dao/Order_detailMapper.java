package com.mvc.dao;

import com.mvc.pojo.Order_detail;

public interface Order_detailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order_detail record);

    int insertSelective(Order_detail record);

    Order_detail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order_detail record);

    int updateByPrimaryKey(Order_detail record);
}