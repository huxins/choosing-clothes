package cn.inxiny.controller;

import cn.inxiny.model.Commodity;
import cn.inxiny.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public List list(Commodity commodity) {
        System.out.println(commodity);
        List<Commodity> list = commodityService.findList(commodity);
        List<Commodity> listA = new ArrayList<Commodity>();
        if (list.size()>12){
            for (int i = 0; i < 12; i++) {
                Commodity commodity1 = list.get(i);
                listA.add(commodity1);
            }

            for (Commodity commodity1 : listA) {
                System.out.println(commodity1);
            }

            return listA;

        }

        for (Commodity commodity1 : list) {
            System.out.println(commodity1);
        }
        return list;
    }

    // 模糊查询
    @ResponseBody
    @RequestMapping(value = "/goods")
    public Commodity goods(Commodity commodity) {
        Commodity commodity1 = commodityService.findCommodity(commodity);
        return commodity1;
    }

    // 搜索商品
    @ResponseBody
    @RequestMapping(value = "/search")
    public List<Commodity> search(Commodity commodity) {
        List<Commodity> commodity1 = commodityService.search(commodity);
        return commodity1;
    }

}
