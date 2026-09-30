package com.xworkz.Switch.bulbs;

import com.xworkz.Switch.Switch;

public class GlobeBulb implements Switch
{
    @Override
    public void on(){
        System.out.println("Globe BUlb is on");
    }
    public void off(){
        System.out.println("Globe bulb is OFF");
    }
}
