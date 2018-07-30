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
    public int register(User user){
        //  手机注册
        if(user.getPhone()!=null){
            SMSUtil sms = new SMSUtil();
            String rd = String.valueOf((int)((Math.random() * 9 + 1) * 100000));
            String[] params = {rd,"15"};
            sms.sendSMS(user.getPhone(),params);
        }

        userMapper.insertUser(user);

        return 0;
    }

    public User login(User user){
        User user1 = userMapper.findUser(user);
        return user1;
    }

}
