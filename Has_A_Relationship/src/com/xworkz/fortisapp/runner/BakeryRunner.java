package com.xworkz.fortisapp.runner;

import com.xworkz.fortisapp.Bakery.Bakery;
import com.xworkz.fortisapp.Bakery.condiment.Condiment;

public class BakeryRunner {
    public static void main(String[] args) {

        Bakery bakery=new Bakery();

        Condiment condiment1 = new Condiment();
        condiment1.setCandimentId(1);
        condiment1.setCandimentName("Egg Puffs");
        condiment1.setPrice(25);
        bakery.addCondiments(condiment1);

        Condiment condiment2 = new Condiment();
        condiment2.setCandimentId(2);
        condiment2.setCandimentName("Veg Puffs");
        condiment2.setPrice(20);
        bakery.addCondiments(condiment2);

        Condiment condiment3 = new Condiment();
        condiment3.setCandimentId(3);
        condiment3.setCandimentName("Chicken Puffs");
        condiment3.setPrice(35);
        bakery.addCondiments(condiment3);

        Condiment condiment4 = new Condiment();
        condiment4.setCandimentId(4);
        condiment4.setCandimentName("Paneer Puffs");
        condiment4.setPrice(30);
        bakery.addCondiments(condiment4);

        Condiment condiment5 = new Condiment();
        condiment5.setCandimentId(5);
        condiment5.setCandimentName("Mushroom Puffs");
        condiment5.setPrice(30);
        bakery.addCondiments(condiment5);

        Condiment condiment6 = new Condiment();
        condiment6.setCandimentId(6);
        condiment6.setCandimentName("Aloo Samosa");
        condiment6.setPrice(15);
        bakery.addCondiments(condiment6);

        Condiment condiment7 = new Condiment();
        condiment7.setCandimentId(7);
        condiment7.setCandimentName("Veg Samosa");
        condiment7.setPrice(15);
        bakery.addCondiments(condiment7);

        Condiment condiment8 = new Condiment();
        condiment8.setCandimentId(8);
        condiment8.setCandimentName("Chicken Roll");
        condiment8.setPrice(45);
        bakery.addCondiments(condiment8);

        Condiment condiment9 = new Condiment();
        condiment9.setCandimentId(9);
        condiment9.setCandimentName("Veg Roll");
        condiment9.setPrice(35);
        bakery.addCondiments(condiment9);

        Condiment condiment10 = new Condiment();
        condiment10.setCandimentId(10);
        condiment10.setCandimentName("Cheese Sandwich");
        condiment10.setPrice(50);
        bakery.addCondiments(condiment10);

        Condiment condiment11 = new Condiment();
        condiment11.setCandimentId(11);
        condiment11.setCandimentName("Veg Sandwich");
        condiment11.setPrice(40);
        bakery.addCondiments(condiment11);

        Condiment condiment12 = new Condiment();
        condiment12.setCandimentId(12);
        condiment12.setCandimentName("Chicken Sandwich");
        condiment12.setPrice(60);
        bakery.addCondiments(condiment12);

        Condiment condiment13 = new Condiment();
        condiment13.setCandimentId(13);
        condiment13.setCandimentName("Garlic Bread");
        condiment13.setPrice(45);
        bakery.addCondiments(condiment13);

        Condiment condiment14 = new Condiment();
        condiment14.setCandimentId(14);
        condiment14.setCandimentName("Cheese Garlic Bread");
        condiment14.setPrice(65);
        bakery.addCondiments(condiment14);

        Condiment condiment15 = new Condiment();
        condiment15.setCandimentId(15);
        condiment15.setCandimentName("French Fries");
        condiment15.setPrice(50);
        bakery.addCondiments(condiment15);

        Condiment condiment16 = new Condiment();
        condiment16.setCandimentId(16);
        condiment16.setCandimentName("Cream Bun");
        condiment16.setPrice(30);
        bakery.addCondiments(condiment16);

        Condiment condiment17 = new Condiment();
        condiment17.setCandimentId(17);
        condiment17.setCandimentName("Chocolate Bun");
        condiment17.setPrice(35);
        bakery.addCondiments(condiment17);

        bakery.getAllCondiments();
    }
}
