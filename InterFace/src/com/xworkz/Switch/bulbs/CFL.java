package com.xworkz.Switch.bulbs;

import com.xworkz.Switch.Switch;

public class CFL implements Switch {


    @Override
    public void on() {

        System.out.println("CFL bulb is On ");
    }

    @Override
    public void off() {
        System.out.println("CFL bulb is OFF");

    }
}
