package cn.inxiny.dao;

import cn.inxiny.model.User;

public interface UserMapper {
    void insertUser(User user); //  根据手机注册
    User findUser(User user);
}