package com.xworkz.notificationservice.notification;

public abstract class  Notification {

  //4 var instance variables
  int i;

  protected Notification(int i){
    this.i=i;
  }
    public abstract   void sendNotification();
  public abstract   void receiveNotification();
}
