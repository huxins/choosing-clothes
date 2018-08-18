package cn.inxiny.dao;

import cn.inxiny.model.OrderForm;
import cn.inxiny.model.User;

import java.util.List;

public interface OrderFormMapper {

    void addOrderForm(OrderForm orderForm);

    List<OrderForm> selectOrderFormId(OrderForm orderForm); // 查询用户所有的订单

    List<OrderForm> selectOrderForm(Integer integer);   //  根据订单id查询当前用户所有订单

}