package cn.inxiny.controller;

import cn.inxiny.model.OrderForm;
import cn.inxiny.service.OrderFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
public class OrderFormController {

    @Autowired
    private OrderFormService orderFormService;

    /**
     * 添加订单
     * @param orderForm
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addOrderForm")
    public Map addOrderForm(OrderForm orderForm, @RequestParam(value = "comm[]") Integer[] comm, @RequestParam(value = "count[]") Integer[] count){
        List<OrderForm> list =  orderFormService.addOrderForm(orderForm,comm,count);
        Map map = new HashMap();
        map.put("msg","提交成功");
        map.put("data",list);
        map.put("errorcode",0);
        return map;
    }

}
