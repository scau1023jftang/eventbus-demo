package com.webank.bdp.demo.observer.observermodel;

import java.math.BigDecimal;

public interface OrderListener {
    public void onSubmitOrder(Integer userId, BigDecimal amount);
}
