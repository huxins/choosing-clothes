package cn.inxiny.dao;

import cn.inxiny.model.User;

public interface UserMapper {

    void insertUser(User user);
    User findUser(User user);

}