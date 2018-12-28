package com.webank.bdp.demo.eventbus.eventbus;

import java.math.BigDecimal;

public class PayEvent {

    private Integer userId;
    private BigDecimal amount;

    public PayEvent(Integer userId, BigDecimal amount) {
    }

    public Integer getUserId() {
        return userId;
    }
    public BigDecimal getAmount() {
        return amount;
    }
}
