package cn.inxiny.controller;

import cn.inxiny.model.User;
import cn.inxiny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 手机验证码
     *
     * @param phone
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/validateCode")
    public String validateCode(String phone) {
        String rd = userService.validateCode(phone);
        return rd;
    }

    /**
     * 图片验证码
     *
     * @param response
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/picCode")
    public String picCode(HttpServletResponse response) throws IOException {
        userService.picCode(response);
        return "";
    }

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/register")
    public Map register(User user) {
        Map map = new HashMap();
        User register = userService.register(user);
        if (register == null) {
            map.put("data", register);
            map.put("msg", "注册失败");
            map.put("errorcode", 1);
            return map;
        }

        map.put("msg", "注册成功");
        map.put("data", register);
        map.put("errorcode", 0);

        return map;
    }

    /**
     * 用户登陆
     *
     * @param user
     * @param model
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/login")
    public Map login(User user, Model model) {
        User user1 = userService.login(user);
        model.addAttribute("user", user1);

        Map map = new HashMap();
        if (user1 == null) {
            map.put("msg", "登陆失败");
            map.put("data", user1);
            map.put("errorcode", 1);
            return map;
        }
        map.put("msg", "登陆成功");
        map.put("data", user1);
        map.put("errorcode", 0);

        return map;
    }


    /**
     * 更新用户信息
     *
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/update")
    public Map update(User user) {
        User user1 = userService.update(user);

        Map map = new HashMap();
        map.put("msg", "更新成功");
        map.put("data", user1);
        map.put("errorcode", 0);


        return map;
    }

    /**
     * 上传头像
     * @param user
     * @param file1
     * @return
     * @throws IllegalStateException
     * @throws IOException
     */
    @ResponseBody
    @RequestMapping(value = "/headPortrait")
    public String ajaxupFile(User user,MultipartFile file1) throws IllegalStateException, IOException{
        System.out.println(user.getNickname());
        System.out.println(1);
        System.out.println("name: " + file1.getOriginalFilename());
        System.out.println("upload:" + file1);
        String filePath = "/Users/lanou/Desktop/img/" + file1.getOriginalFilename();
        File file = new File(filePath);
        file1.transferTo(file);




        return "上传成功";
    }


}
