package cn.inxiny.service.impl;

import cn.inxiny.dao.CommodityMapper;
import cn.inxiny.dao.OrderFormMapper;
import cn.inxiny.dao.UserMapper;
import cn.inxiny.model.Commodity;
import cn.inxiny.model.OrderForm;
import cn.inxiny.model.User;
import cn.inxiny.service.OrderFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("orderFormService")
public class OrderFormServiceImpl implements OrderFormService {

    @Autowired
    private OrderFormMapper orderFormMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CommodityMapper commodityMapper;


    /**
     * 添加订单
     *
     * @param orderForm
     * @param comm
     * @param count
     * @return
     */
    public List<OrderForm> addOrderForm(OrderForm orderForm, Integer[] comm, Integer[] count) {
//              随机订单号
        Set set = new HashSet();
        int i1 = 0;
        boolean add = false;
        while (!add) {
            i1 = (int) ((Math.random() * 9 + 1) * 100000);
            add = set.add(i1);
        }
        for (int i = 0; i < comm.length; i++) {
            orderForm.setCommodityid(comm[i]);
            orderForm.setCommoditycount(count[i]);
            orderForm.setOrderformid(i1);
            orderFormMapper.addOrderForm(orderForm);
        }
        //  返回订单
        List<OrderForm> list = orderFormMapper.selectOrderFormId(orderForm);
        HashSet<Integer> orderformid = new HashSet();
        for (OrderForm form : list) {
            orderformid.add(form.getOrderformid());
        }
        

//        返回前端的所有订单
        List<OrderForm> orderFormList = new ArrayList<OrderForm>();
//          根据订单id返回用户当前所有订单
        List<OrderForm> orderList = new ArrayList<OrderForm>();
        List<OrderForm> commodities = new ArrayList<OrderForm>();
        for (Integer integer : orderformid) {
            orderList = orderFormMapper.selectOrderForm(integer);

        }

        OrderForm o = new OrderForm();
        User user = new User();
        user.setUserid(orderForm.getUserid());
        User userB = userMapper.findUserB(user);
        o.setUser(userB);

        for (int i = 0; i < orderList.size(); i++) {
            o = orderList.get(0);
            commodities.add(commodityMapper.seCo(orderList.get(i).getCommodityid()));
        }
        orderFormList.add(o);



        System.out.println("888888888888");
        System.out.println(orderFormList.size());
        return orderFormList;
    }
}
