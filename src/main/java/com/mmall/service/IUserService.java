package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

import java.util.Objects;

/**
 * Created by 疯子 on 2018/7/3.
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);

}
