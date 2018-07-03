package com.mmall.service;

import com.mmall.pojo.User;

/**
 * Created by 疯子 on 2018/7/3.
 */
public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
