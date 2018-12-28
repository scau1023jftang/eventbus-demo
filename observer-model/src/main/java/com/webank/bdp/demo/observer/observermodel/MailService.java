package com.webank.bdp.demo.observer.observermodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


public class MailService {


    private UserService userService;

    public void sendPaymentEmail(Integer userId, BigDecimal amount) {
        String emailAddress = userService.getEmailAddress(userId);
        // Send email...
    }
}
