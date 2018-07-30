package cn.inxiny.service;

import cn.inxiny.model.User;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface UserService {
    public String picCode(HttpServletResponse response) throws IOException; //  图片验证码
    String validateCode(String phone);   // 手机验证码
    int register(User user);
    User login(User user);
}
