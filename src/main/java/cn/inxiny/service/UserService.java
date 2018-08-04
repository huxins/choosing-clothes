package cn.inxiny.service;

import cn.inxiny.model.User;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface UserService {
    void picCode(HttpServletResponse response) throws IOException; //  图片验证码
    String validateCode(String phone);   // 手机验证码
    User register(User user);
    User login(User user);

    User update(User user); //  更新用户信息
}
