package com.webank.bdp.demo.eventbus.eventbus;

import org.greenrobot.eventbus.Subscribe;

public class UserService {
    public String getEmailAddress(Integer userId) {
        return "foo@bar.com";
    }

    @Subscribe
    public void registerPayment(PayEvent payEvent) {
        // Register payment in database...
    }
}
