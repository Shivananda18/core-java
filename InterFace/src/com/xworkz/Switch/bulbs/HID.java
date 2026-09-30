package com.xworkz.Switch.bulbs;

import com.xworkz.Switch.Switch;

public class HID implements Switch {

    @Override
    public void on(){
        System.out.println("HID Bulb is On");
    }
    @Override
    public void off(){
        System.out.println("HID bulb is OFF");
    }
}
