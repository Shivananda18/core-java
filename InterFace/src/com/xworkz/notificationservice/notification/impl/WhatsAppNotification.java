package com.xworkz.notificationservice.notification.impl;

import com.xworkz.notificationservice.notification.Notification;

public class WhatsAppNotification extends  Notification {



    public WhatsAppNotification(int i){
        super(i);
    }
    @Override
    public void sendNotification() {
        System.out.println("send msg via WhatsApp");
    }

    @Override
    public void receiveNotification() {
        System.out.println("receive msg via WhatsApp");
    }
}
