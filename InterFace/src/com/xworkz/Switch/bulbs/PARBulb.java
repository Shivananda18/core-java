package com.xworkz.Switch.bulbs;

import com.xworkz.Switch.Switch;

public class PARBulb implements Switch {

    @Override
    public void on(){
        System.out.println("PARBulb is on");
    }
    @Override
    public void off(){
        System.out.println("PARBulb is off");
    }
}
