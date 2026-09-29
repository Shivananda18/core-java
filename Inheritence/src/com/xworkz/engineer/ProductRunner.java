package com.xworkz.engineer;

import com.xworkz.engineer.poduct1.Product1;

public class ProductRunner {

    public static void main(String[] args) {

        Product1 product=new Product1();
        product.setProductId(1);
        System.out.println("product id : "+product.getProductId());

        product.setProductName("toaster");
        System.out.println("product name is : "+ product.getProductName());

       product.setBrandName("MILTON");
        System.out.println("product brandName : "+product.getBrandName());

        product.setProductPrice(500.0);
        System.out.println("product price : "+product.getProductPrice());


        product.setAsin("B0H3Q8SSDR");
        System.out.println("product asin : "+product.getAsin());

        product.setItemTypeName("Popup Toaster");
        System.out.println("item type name : "+product.getItemTypeName());




        Product1 product1=new Product1();
        product1.setProductId(2);
        System.out.println("product id : "+product.getProductId());

        product1.setProductName("clock");
        System.out.println("product name is : "+ product.getProductName());

        product1.setBrandName("Ajatha");
        System.out.println("product brandName : "+product.getBrandName());

        product1.setProductPrice(200.0);
        System.out.println("product price : "+product.getProductPrice());


        product1.setAsin("KJJO258SSDR");
        System.out.println("product asin : "+product.getAsin());

        product1.setItemTypeName("null");
        System.out.println("item type name : "+product.getItemTypeName());



        System.out.println("product and product1 are equal : "+product.equals(product1));
        System.out.println("product hash code :"+product.hashCode());
        System.out.println("product1 hash value :"+product1.hashCode());
        System.out.println("String representation of the Object : "+product);
        System.out.println("String representation of the Object : "+product1);

    }
}
