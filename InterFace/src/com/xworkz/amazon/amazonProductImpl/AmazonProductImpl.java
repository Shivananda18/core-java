package com.xworkz.amazon.amazonProductImpl;

import com.xworkz.amazon.AmazonProduct;
import com.xworkz.amazon.amazonProductImpl.product.Product;

public class AmazonProductImpl implements AmazonProduct {

    Product[] products;
    int index;
    public AmazonProductImpl(int size){
        products=new Product[size];
    }


    public  boolean addProduct(Product product){
       boolean addProducts=false;
       boolean isProductIdAdded=false;
       boolean isModelAdded=false;
       boolean isBrandNameAdded=false;
       boolean isColourAdded=false;
       boolean isScreenSize=false;
       boolean isHardDiskAdded=false;
       boolean isRamAdded=false;
       boolean isSpecialFeature=false;

       if(product.getProductId()>0){
           isProductIdAdded=true;
       }
       if(product.getBrandName()!=null && !product.getBrandName().isEmpty()){
           isBrandNameAdded=true;
       }
       if(product.getModel()!=null && !product.getModel().isEmpty()){
           isModelAdded=true;
       }
       if(product.getColour()!=null && !product.getColour().isEmpty()){
           isColourAdded=true;
       }
       if(product.getScreenSize()!=null && !product.getScreenSize().isEmpty()){
           isScreenSize=true;
       }
       if(product.getHardDiskInGb()>0){
           isHardDiskAdded=true;
       }
       if(product.getRam()!=null && !product.getRam().isEmpty()){
           isRamAdded=true;
       }
       if(product.getSpecialFeature()!=null ){
           isSpecialFeature=true;
       }
       if(isProductIdAdded && isColourAdded && isSpecialFeature && isBrandNameAdded && isModelAdded && isScreenSize && isHardDiskAdded && isRamAdded){
           this.products[index++]=product;
       }
        return addProducts;
    }
    public void getAllProducts(){
        for (Product product:products){
            if(product!=null) {
            }else{
                System.out.println("products not added");
            }
            System.out.println(product);
        }
    }
    @Override
    public int getProductIdByBrandName(String brandName) {
        return 0;
    }

    @Override
    public String getProductModelByProductScreenSize(String screenSize) {
        String getProductModel=null;
        for(Product product:products){
            if(screenSize.equals(product.getScreenSize())){
                getProductModel=product.getModel();
            }
        }
        return getProductModel;
    }

    @Override
    public int gethardDiskInGbBySpecialFeature(String[] specialFeature) {
        int getHardDiskInGB=0;
        for(Product product:products){
            if(specialFeature.equals(product.getSpecialFeature())){
                getHardDiskInGB=product.getHardDiskInGb();
            }
        }
        return getHardDiskInGB;
    }

    @Override
    public String getProductColorByProductRam(String productRam){
        String getProductColour=null;
        for(Product product:products){
            if(productRam.equals(product.getRam())){
                getProductColour=product.getColour();
            }
        }
        return getProductColour;
    }

    @Override
    public String[] getProductFeatureByProductColour(String productColour) {
        String[] getProductFeature=null;
        for(Product product:products){
            if(productColour.equals(product.getColour())){
                getProductFeature=product.getSpecialFeature();
            }
        }
        return  getProductFeature;
    }

    @Override
    public boolean updateIdByName(int newId, String name) {
        boolean updateId=false;
        for(Product product:products){
            if(name.equals(product.getBrandName())){
                product.setProductId(newId);
                updateId=true;
                System.out.println("id is updated");
            }
        }
        return updateId;
    }

    @Override
    public boolean updateModelByRam(String newModel, String ram) {
        boolean updateModel=false;
        for(Product product:products){
            if(ram.equals(product.getRam())){
                product.setModel(newModel);
                updateModel=true;
                System.out.println("model is updated");
            }
        }
        return updateModel;
    }

    @Override
    public boolean updateFeaturByColour(String[] newFeature, String colour) {
        boolean updateFeature=false;
        for(Product product:products){
            if(colour.equals(product.getColour())){
                product.setSpecialFeature(newFeature);
                updateFeature=true;
                System.out.println("product feature is updated");
            }
        }
        return updateFeature;
    }
}
