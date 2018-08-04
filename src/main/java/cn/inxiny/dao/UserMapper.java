package cn.inxiny.dao;

import cn.inxiny.model.User;

public interface UserMapper {
    void insertUser(User user); //  注册存入数据库
    User findUser(User user);

    User findUserA(User user); //   登入查询

    void updateUser(User user); //  更新用户信息

    User findUserB(User user); //   查找更新后的用户信息
}