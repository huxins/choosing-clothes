package cn.inxiny.service.impl;

import cn.inxiny.dao.UserMapper;
import cn.inxiny.model.User;
import cn.inxiny.service.UserService;
import cn.inxiny.util.SMSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void picCode(HttpServletResponse response) throws IOException {
        response.setContentType("image/jpeg");
        //	定义图片的宽高
        int width = 100;
        int height = 25;
        //	创建画布
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        //	从画布中获取画笔
        Graphics graphics = image.getGraphics();
        //	设置背景颜色
        graphics.setColor(Color.WHITE);
        //	填充背景颜色(留出边框)
        graphics.fillRect(1, 1, width-2, height-2);
        //	设置边框颜色
        graphics.setColor(Color.red);
        graphics.drawRect(0, 0, width-1, height-1);
        //	设置字体颜色 类型大小
        graphics.setColor(Color.BLUE);
        graphics.setFont(new Font("宋体", Font.BOLD, 16));
        //	随机4个数字 画到画布上
        Random random = new Random();
        int positionX = 20;
        String code = "";
        for (int i = 0; i < 4; i++) {
            //	把随机数 画到画布上
            //	x,y 距离画布的坐标
            int nextInt = random.nextInt(10);
            graphics.drawString(nextInt+"", positionX, 20);
            positionX = positionX + 20;
            code = code + nextInt;
        }
        //	画干扰线
        for (int i = 0; i < 8; i++) {
            graphics.drawLine(random.nextInt(width), random.nextInt(height), random.nextInt(width), random.nextInt(height));
        }
        //	响应回页面中
        ServletOutputStream os = response.getOutputStream();
        ImageIO.write(image, "jpeg", os);
    }

    /**
     * 手机验证码
     * @param phone
     * @return
     */
    public String validateCode(String phone){
        SMSUtil sms = new SMSUtil();
        String rd = String.valueOf((int)((Math.random() * 9 + 1) * 100000));
        String[] params = {rd,"15"};
        sms.sendSMS(phone,params);
        return rd;
    }

    /**
     * 用户注册
     * @param user
     */
    public User register(User user){

        User user1 = userMapper.findUser(user);
        if (user1 == null){
            userMapper.insertUser(user);
            User user2 = userMapper.findUser(user);
            return user2;
        }

        return null;
    }

    /**
     * 用户登录
     * @param user
     * @return
     */
    public User login(User user){
        User user1 = userMapper.findUserA(user);
        return user1;
    }

    public User update(User user) {
        userMapper.updateUser(user);
        User user1 = userMapper.findUserB(user);

        return user1;
    }

}
