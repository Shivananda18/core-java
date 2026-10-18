package com.xworkz;

import com.xworkz.amazon.AmazonProduct;
import com.xworkz.amazon.amazonProductImpl.AmazonProductImpl;
import com.xworkz.amazon.amazonProductImpl.product.Product;

import java.util.Scanner;

public class amazonProductRunner {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the no of Products");
        int size=scanner.nextInt();

        AmazonProduct amazonProductImpl=new AmazonProductImpl(size);

        for(int i=0;i<size;i++) {
            Product product = new Product();
            System.out.println("enter the product id ");
            product.setProductId(scanner.nextInt());

            System.out.println("enter the brand Name");
            product.setBrandName(scanner.next());

            System.out.println("enter the model");
            product.setBrandName(scanner.next());

            System.out.println("enter the Screen Size");
            product.setScreenSize(scanner.next());

            System.out.println("enter the Colour ");
            product.setColour(scanner.next());

            System.out.println("enter the HardDiskIn MB");
            product.setHardDiskInGb(scanner.nextInt());

            System.out.println("enter the Ram");
            product.setRam(scanner.next());

            System.out.println("enter Special feature");
            product.setSpecialFeature(scanner.next().split(","));

            amazonProductImpl.addProduct(product);
        }
        amazonProductImpl.getAllProducts();

        System.out.println("getProductIdByBrandName");
        amazonProductImpl.getProductIdByBrandName("laptop");

        System.out.println("getProductModelByProductScreenSize");
        amazonProductImpl.getProductModelByProductScreenSize("");

        System.out.println("getHardDiskInGbBySpecialFeature");
        amazonProductImpl.gethardDiskInGbBySpecialFeature("".split(","));

        System.out.println("getProductColorByProductRam");
        amazonProductImpl.getProductColorByProductRam("");

        System.out.println("getProductFeatureByProductColour");
        amazonProductImpl.getProductFeatureByProductColour("White");

    }
}
