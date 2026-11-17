package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ShopRunner {

    public static void main(String[] args) {

        List<String> orinShop=new ArrayList<>();
        orinShop.add("zara");
        orinShop.add("H&m");
        orinShop.add("uniqlo");
        orinShop.add("marks and spencer");
        orinShop.add("westside");
        orinShop.add("shoppers stop");
        orinShop.add(0,"shiva");
        System.out.println("orinShop : "+orinShop);
        System.out.println(orinShop.remove(1));
        orinShop.addFirst("guru");
        orinShop.addLast("kiran");
        System.out.println(orinShop);
        String d=orinShop.getFirst();
        System.out.println("get first : "+d);
        System.out.println("get Last : "+orinShop.getLast());
        System.out.println("index of : "+orinShop.indexOf("shiva"));
        System.out.println("last index of : "+orinShop.lastIndexOf("westside"));

        System.out.println("orinShop : "+orinShop);
        orinShop.reversed();
        System.out.println("reversed : "+orinShop);



List<String> newOrion=new ArrayList();
        newOrion.add("pantaloons");
        newOrion.add("Newme");
        newOrion.add("Mango");
        newOrion.add("Only");
        newOrion.add("vero moda");
        newOrion.add("forever new");
        System.out.println("newOrion : "+newOrion);


        orinShop.addAll(0,newOrion);
        System.out.println(orinShop);


    }



    // System.out.println("Orian mall shop names : "+orinShop);
/*
        for(Object orion:orinShop){
            System.out.println(orion);

        }
        */

}
