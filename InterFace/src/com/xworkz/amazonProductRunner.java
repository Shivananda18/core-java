package com.xworkz;

import com.xworkz.amazon.AmazonProduct;
import com.xworkz.amazon.amazonProductImpl.AmazonProductImpl;
import com.xworkz.amazon.amazonProductImpl.product.Product;

import java.util.Scanner;

public class amazonProductRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no of Products");
        int size = scanner.nextInt();

        AmazonProduct amazonProductImpl = new AmazonProductImpl(size);

        for (int i = 0; i < size; i++) {
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
        String yesOrNo = null;
        do {
            System.out.println("enter option");
            int option = scanner.nextInt();

            System.out.println("press 1 getAllProducts");
            System.out.println("press 2 getProductIdByBrandName");
            System.out.println("press 3 getProductModelByProductScreenSize ");
            System.out.println("press 4 gethardDiskInGbBySpecialFeature ");
            System.out.println("press 5 getProductColorByProductRam ");
            System.out.println("press 6 getProductFeatureByProductColour ");

            switch (option) {

                case 1:
                    System.out.println("all products details are :");
                    amazonProductImpl.getAllProducts();
                    break;

                case 2:
                    System.out.println("getProductIdByBrandName");
                    amazonProductImpl.getProductIdByBrandName("laptop");
                    break;

                case 3:
                    System.out.println("getProductModelByProductScreenSize");
                    amazonProductImpl.getProductModelByProductScreenSize("");
                    break;

                case 4:
                    System.out.println("getHardDiskInGbBySpecialFeature");
                    amazonProductImpl.gethardDiskInGbBySpecialFeature("".split(","));
                    break;

                case 5:
                    System.out.println("getProductColorByProductRam");
                    amazonProductImpl.getProductColorByProductRam("");
                    break;

                case 6:
                    System.out.println("getProductFeatureByProductColour");
                    amazonProductImpl.getProductFeatureByProductColour("White");
                    break;

                case 7:
                    System.out.println("updateIdByName");
                    amazonProductImpl.updateIdByName(101,"mobile");
                    break;

                case 8:
                    System.out.println("updateModelByRam");
                    amazonProductImpl.updateModelByRam("t3x","18Gb");
                    break;

                case 9:
                    System.out.println("update Feature Based on Colour");
                    amazonProductImpl.updateFeaturByColour("sfv,wsf".split(","),"red");
                    break;

                default:
                    System.out.println("please enter valid option--");
            }
            System.out.println("do you want continue Y/N");
            yesOrNo = scanner.next();
        } while (yesOrNo.equalsIgnoreCase("y"));
    }
}
