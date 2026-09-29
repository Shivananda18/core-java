package com.xworkz.equalsmethodapp.bat;

import com.xworkz.equalsmethodapp.SoundBox;

public class BatRunner {
    public static void main(String[] args) {
        System.out.println("main Started...........");
        System.out.println("bat is started executing........");
        Bat bat=new Bat();
        bat.brandName="SAG";
        bat.batSize=6;
        bat.materialType="English willow";
        bat.color="Red";
        System.out.println("bat finishing executing ...............");

        System.out.println("bat1 is started executing............");
        Bat bat1=new Bat();
        bat1.brandName="SAG";
        bat1.batSize=6;
        bat1.materialType="English willow";
        bat1.color="Red";
        System.out.println("bat1 finishing executing.....");

        System.out.println("hash value of bat : "+bat.hashCode());
        System.out.println("hash value fof bat1 : "+bat1.hashCode());

        System.out.println("bat and bat1 are same : "+bat.equals(bat1));
        System.out.println("String representation of the bat object : "+bat.toString());//toString is optonal in the output because we overridin the method for custom class
        System.out.println("string representation of the bat1 object : "+bat1.toString());
        System.out.println("main Ended.........");
    }
}
