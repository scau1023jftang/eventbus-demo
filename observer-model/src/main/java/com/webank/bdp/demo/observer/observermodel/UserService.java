package com.webank.bdp.demo.observer.observermodel;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;


public class UserService implements OrderListener {
    public String getEmailAddress(Integer userId) {
        return "foo@bar.com";
    }

    public void registerPayment(Integer userId, BigDecimal amount) {
        // Register payment in database...
    }

    @Override
    public void onSubmitOrder(Integer userId, BigDecimal amount) {

        registerPayment(userId, amount);

    }
}
