package com.webank.bdp.demo.observer.observermodel;

import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class PaymentService implements OrderListener {

    private MailService mailService;

    public void doPayment(Integer userId, BigDecimal amount) {
        // Do payment...
        mailService.sendPaymentEmail(userId, amount);
    }

    @Override
    public void onSubmitOrder(Integer userId, BigDecimal amount) {

        doPayment(userId, amount);
    }
}
