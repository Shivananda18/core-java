package com.xworkz.notificationservice.notification.impl;

import com.xworkz.notificationservice.notification.Notification;

import java.io.Serializable;

public class SMSNotification extends  Notification {
    public int i;
    public  SMSNotification(int i){
        super(i);
        this.i=i;
    }
    @Override
    public  void sendNotification() {
        System.out.println("send msg via sms");

    }

    @Override
    public  void receiveNotification() {
        System.out.println("receive msg via sms");
    }
}
