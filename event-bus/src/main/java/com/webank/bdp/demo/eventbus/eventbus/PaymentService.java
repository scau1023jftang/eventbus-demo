package com.webank.bdp.demo.eventbus.eventbus;

import org.greenrobot.eventbus.Subscribe;

public class PaymentService {
    private MailService mailService;

    @Subscribe
    public void doPayment(PayEvent  payEvent) {
        // Do payment...
        mailService.sendPaymentEmail(payEvent.getUserId(), payEvent.getAmount());
    }
}
