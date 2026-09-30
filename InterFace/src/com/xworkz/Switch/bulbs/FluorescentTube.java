package com.xworkz.Switch.bulbs;

import com.xworkz.Switch.Switch;

public class FluorescentTube implements Switch {

    @Override
public void on(){
    System.out.println("Fluorescent Tube is On");
}
@Override
public void off(){
    System.out.println("Fluorescent  Tube is Off");
}
}
