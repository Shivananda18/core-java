package com.xworkz.Switch.bulbs;

import com.xworkz.Switch.Switch;

public class EdisonBulb implements Switch {

    @Override
    public void on(){
        System.out.println("EdisonBulb is on");
    }
    @Override
    public void off(){
        System.out.println("EdisonBulb is off");
    }
}
