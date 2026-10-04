package com.xworkz.notificationservice.notification.impl;

import com.xworkz.notificationservice.notification.Notification;

public class SMSNotification implements Notification {


    @Override
    public void sendNotification() {
        System.out.println("send msg via sms");
    }

    @Override
    public void receiveNotification() {
        System.out.println("receive msg via sms");
    }
}
