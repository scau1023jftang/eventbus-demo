package com.webank.bdp.demo.eventbus.eventbus;

import java.math.BigDecimal;


public class MailService {


    private UserService userService;

    public void sendPaymentEmail(Integer userId, BigDecimal amount) {
        String emailAddress = userService.getEmailAddress(userId);
        // Send email...
    }
}
