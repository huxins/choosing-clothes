package cn.inxiny.controller;

import cn.inxiny.model.Commodity;
import cn.inxiny.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Controller
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    //    分类
    @ResponseBody
    @RequestMapping(value = "/classify")
    public List classify() {
        List s = new ArrayList();

        List sortnames = commodityService.findClass();

        s.add(sortnames);
        List sort = commodityService.findSeries();
        s.add(sort);
        return s;
    }

    //    系列
    @ResponseBody
    @RequestMapping(value = "/series")
    public List series() {
        List sortnames = commodityService.findSeries();
        return sortnames;
    }

    //    产品列表
    @ResponseBody
    @RequestMapping(value = "/list")
    public List list(Commodity commodity) {
        List sortnames = commodityService.findList(commodity);
        return sortnames;
    }

    // 模糊查询
    @ResponseBody
    @RequestMapping(value = "/goods")
    public Commodity goods(Commodity commodity) {
        Commodity commodity1 = commodityService.findCommodity(commodity);
        return commodity1;
    }

}
