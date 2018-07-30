package cn.inxiny.service;

import cn.inxiny.model.User;

public interface UserService {
    int register(User user);
    User login(User user);
}
