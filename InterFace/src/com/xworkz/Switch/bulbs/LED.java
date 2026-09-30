package com.xworkz.Switch.bulbs;

import com.xworkz.Switch.Switch;

public class LED implements Switch {

    @Override
    public void on() {
        System.out.println("LED light ON");
    }
    @Override
        public void off(){
            System.out.println("LED light off");

    }
}
