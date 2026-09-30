package com.xworkz.Switch.bulbs;

import com.xworkz.Switch.Switch;

public class Halogen implements Switch {

    @Override
    public void on(){
        System.out.println("Halogen is ON");
    }
    @Override
    public void off(){
        System.out.println("Halogen is Off");

    }
}
