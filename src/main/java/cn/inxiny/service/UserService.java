package cn.inxiny.service;

import cn.inxiny.model.User;

public interface UserService {
    void register(User user);
    User login(User user);
}
