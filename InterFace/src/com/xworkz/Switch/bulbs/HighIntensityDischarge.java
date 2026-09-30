package com.xworkz.Switch.bulbs;

import com.xworkz.Switch.Switch;

public class HighIntensityDischarge implements Switch {

    @Override
    public void on(){
        System.out.println("High-Intensity Discharge is On");
    }
    @Override
    public void off(){
        System.out.println("High-Intensity Discharge id OFF");
    }
}
