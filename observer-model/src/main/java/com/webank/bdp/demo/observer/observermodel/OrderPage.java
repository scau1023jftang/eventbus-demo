package com.webank.bdp.demo.observer.observermodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderPage {

    private List<OrderListener> orderListeners=new ArrayList<OrderListener>();

    public void submitOrder() {
        Integer userId = 1;
        BigDecimal amount = BigDecimal.TEN;

        for (OrderListener orderListener : orderListeners) {
            orderListener.onSubmitOrder(userId, amount);
        }
    }

    public void addOrderListener(OrderListener orderListener){
        this.orderListeners.add(orderListener);
    }
}
