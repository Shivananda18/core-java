package com.xworkz.notificationservice;

import com.xworkz.movieticketbookingapp.WatchMovieApp;
import com.xworkz.notificationservice.notification.Notification;
import com.xworkz.notificationservice.notification.impl.SMSNotification;
import com.xworkz.notificationservice.notification.impl.WhatsAppNotification;

public class NotificationRunner {

    public static void main(String[] args) {


        Notification notification=new SMSNotification();
        notification.sendNotification();
        notification.receiveNotification();

        Notification notification1=new WhatsAppNotification();
        notification1.sendNotification();
        notification1.receiveNotification();

    }
}
