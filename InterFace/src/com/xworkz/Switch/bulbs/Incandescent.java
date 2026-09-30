package com.xworkz.Switch.bulbs;

import com.xworkz.Switch.Switch;

public class Incandescent implements Switch {

    @Override
    public void on(){
        System.out.println("Incandescent is on");
    }
    @Override
    public void off(){
        System.out.println("Incandescent is off");
    }
}
