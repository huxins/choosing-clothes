package cn.inxiny.service.impl;

import cn.inxiny.dao.UserMapper;
import cn.inxiny.model.User;
import cn.inxiny.service.UserService;
import cn.inxiny.util.SMSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 用户注册
     * @param user
     */
    public void register(User user){
        SMSUtil sms = new SMSUtil();
        String rd = String.valueOf((int)((Math.random() * 9 + 1) * 100000));
        String[] params = {rd,"15"};
        for (String param : params) {
            System.out.println(param);
        }
        System.out.println(user.getPhone());
        sms.sendSMS(user.getPhone(),params);

        userMapper.insertUser(user);
    }

    public User login(User user){
        User user1 = userMapper.findUser(user);
        return user1;
    }

}
