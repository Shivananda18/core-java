package com.xworkz.card.cardbank;

import com.xworkz.card.Card;

public  abstract class AxisBank implements Card {

    public void insert(){
        System.out.println("AxisBank Card inserted");
    }

    public  void creditAmount(){

        System.out.println("AxisBank help people");
    }
}
