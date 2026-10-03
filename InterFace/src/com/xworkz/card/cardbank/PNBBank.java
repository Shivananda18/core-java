package com.xworkz.card.cardbank;

import javax.sound.midi.Soundbank;
import java.net.Socket;

public class PNBBank extends AxisBank{

    @Override
    public void helpPeople(){
        System.out.println("PNBBank Card inserted");
    }
    @Override
    public void creditAmount() {
        System.out.println("credit amount from Pnb Bank");
    }
    @Override
    public void insert(){
        System.out.println("insert card of PNB Bank");
    }

}
