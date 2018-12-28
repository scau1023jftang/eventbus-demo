package com.webank.bdp.demo.observer.observermodel;

public class PublisherSubscribeTest {
    public static void main(String[] args) {
        PaymentService paymentService=new PaymentService();
        UserService userService=new UserService();

        OrderPage orderPage=new OrderPage();

        orderPage.addOrderListener(paymentService);
        orderPage.addOrderListener(userService);
        orderPage.submitOrder();
    }
}
