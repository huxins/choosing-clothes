package cn.inxiny.controller;

import cn.inxiny.model.User;
import cn.inxiny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 用户注册
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/register")
    public Map register(User user){
        Map map = new HashMap();
        userService.register(user);

        map.put("msg",1);
        map.put("user",user);

        return map;
    }

    /**
     * 用户登陆
     * @param user
     * @param model
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/login")
    public Map login(User user,Model model){
        User user1 = userService.login(user);
        model.addAttribute("user",user1);

        Map map = new HashMap();
        map.put("msg",1);
        map.put("user",user1);

        return map;
    }


}
