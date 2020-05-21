package com.zeus.design.pattern.structural_jiegouxing.proxy_daili.dynamicproxy;

import com.zeus.design.pattern.structural_jiegouxing.proxy_daili.Order;
import com.zeus.design.pattern.structural_jiegouxing.proxy_daili.IOrderService;
import com.zeus.design.pattern.structural_jiegouxing.proxy_daili.OrderServiceImpl;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
//        order.setUserId(2);
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);
    }
}
