package com.xworkz.card.cardbank;

import com.xworkz.card.Card;

public  class BankOfBaroda extends AxisBank {

    @Override
    public void insert(){
        System.out.println("BankOfBaroda Card inserted from Card interFace ");
    }
    @Override
    public void helpPeople(){
        System.out.println("BankOfBaroda help People");
    }
}
