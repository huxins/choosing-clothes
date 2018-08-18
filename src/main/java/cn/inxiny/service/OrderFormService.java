package cn.inxiny.service;

import cn.inxiny.model.OrderForm;

import java.util.List;

public interface OrderFormService {
    List<OrderForm> addOrderForm(OrderForm orderForm, Integer[] comm, Integer[] count);  //  添加订单
}
