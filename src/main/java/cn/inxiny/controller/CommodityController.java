package cn.inxiny.controller;

import cn.inxiny.model.Commodity;
import cn.inxiny.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin
@Controller
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    @ResponseBody
    @RequestMapping(value = "/classify")
    public List classify(){
        List sortnames = commodityService.findClass();
        return sortnames;
    }

}
