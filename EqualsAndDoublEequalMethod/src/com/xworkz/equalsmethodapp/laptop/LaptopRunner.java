package com.xworkz.equalsmethodapp.laptop;

public class LaptopRunner {
    public static void main(String[] args) {

        Laptop laptop=new Laptop();
        laptop.laptopName="Lenovo";
        laptop.modelName="LOQ";
        laptop.color="Black";
        laptop.hardDiskSizeinMB=512;

        Laptop laptop1=new Laptop();
        laptop1.laptopName="Lenovo";
        laptop1.modelName="LOQ";
        laptop1.color="Black";
        laptop1.hardDiskSizeinMB=512;

        System.out.println("laptop and laptop1 are same : "+laptop.equals(laptop1));
        System.out.println("laptop hashcode : "+laptop.hashCode());
        System.out.println("laptop1 hashCode : "+laptop1.hashCode());

        System.out.println("laptop Object holding  fields : "+laptop);
        System.out.println("laptop1 Object holding  fields : "+laptop1);
    }
}
