package cn.inxiny.controller;

import cn.inxiny.model.ShopCat;
import cn.inxiny.service.ShopCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
public class ShopCatController {

    @Autowired
    private ShopCatService shopCatService;

    /**
     * 添加购物车
     * @param shopCat
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addShopCat")
    public Map shopCat(ShopCat shopCat){
         List<ShopCat> list =  shopCatService.addShopCat(shopCat);
         Map map = new HashMap();
         map.put("data",list);
         map.put("msg","添加成功");
         map.put("errorcode",0);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/updateShopCat")
    public Map updateShopCat(ShopCat shopCat,Integer rank){
        List<ShopCat> list =  shopCatService.updateShopCat(shopCat,rank);
        Map map = new HashMap();
        map.put("data",list);
        map.put("msg","更新成功");
        map.put("errorcode",0);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/deleteShopCat")
    public Map deleteShopCat(ShopCat shopCat){
        List<ShopCat> list =  shopCatService.deleteShopCat(shopCat);
        Map map = new HashMap();
        map.put("data",list);
        map.put("msg","删除成功");
        map.put("errorcode",0);
        return map;
    }

}
