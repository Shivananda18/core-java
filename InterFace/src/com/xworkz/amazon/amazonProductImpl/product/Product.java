package com.xworkz.amazon.amazonProductImpl.product;

public class Product {

    private int productId;
    private String brandName;
    private String model;
    private String screenSize;
    private String colour;
    private int hardDiskInGb;
    private String ram;
    private String[] specialFeature;


    public void setProductId(int productId){
        this.productId=productId;
    }
    public int getProductId(){
        return this.productId;
    }
    public void setBrandName(String brandName){
        this.brandName=brandName;
    }
    public String getBrandName(){
        return brandName;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return this.model;
    }
    public void setScreenSize(String screenSize){
        this.screenSize=screenSize;
    }
    public String getScreenSize(){
        return screenSize;
    }
    public void setColour(String colour){
        this.colour=colour;
    }
    public String getColour(){
        return colour;
    }
    public void setHardDiskInGb(int hardDiskInGb){
        this.hardDiskInGb=hardDiskInGb;
    }
    public int getHardDiskInGb(){
        return hardDiskInGb;
    }
    public void setRam(String ram){
        this.ram=ram;
    }
    public String getRam(){
        return ram;
    }
    public void setSpecialFeature(String[] specialFeature){
        this.specialFeature=specialFeature;
    }
    public String[] getSpecialFeature(){
        return specialFeature;
    }
    public String toString(){

        return "amazon Product : {Product= "+"productId= "+productId+"brandName= "+brandName+"model= "+model+"screenSize= "+screenSize+"colour"+colour+"hardDiskInGb= "+hardDiskInGb+"ram= "+ram+"specialFeature= "+specialFeature+'}';
    }
}
