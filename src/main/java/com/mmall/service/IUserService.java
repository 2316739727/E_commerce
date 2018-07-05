package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

import java.util.Objects;

/**
 * Created by 疯子 on 2018/7/3.
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str,String type);

    ServerResponse selectQuestionByUsername(String username);

    ServerResponse<String> checkAnswer(String username,String question,String answer);

    ServerResponse<String> forgetRestPassword(String username,String passwordNew,String forgetToken);

    ServerResponse<String> resetPassword(String passwordOld,String passwordNew,User user);

}
