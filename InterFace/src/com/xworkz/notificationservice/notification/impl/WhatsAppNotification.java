package com.xworkz.notificationservice.notification.impl;

import com.xworkz.notificationservice.notification.Notification;

public class WhatsAppNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("send msg via WhatsApp");
    }

    @Override
    public void receiveNotification() {
        System.out.println("receive msg via WhatsApp");
    }
}
