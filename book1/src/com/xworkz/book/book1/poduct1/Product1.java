package com.xworkz.book.book1.poduct1;

import java.util.Objects;

public class Product1 {

    private int productId;
    private String brandName;
    private String productName;
    private double productPrice;
    private String asin;
    private String itemTypeName;


    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return this.productId;
    }


    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return this.brandName;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return this.productName;
    }


    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return this.productPrice;
    }


    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getAsin() {
        return this.asin;
    }


    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }

    public String getItemTypeName() {
        return this.itemTypeName;
    }

    @Override
    public boolean equals(Object object) {
        Product1 product = (Product1) object;

        if (this.productId == product.productId && this.productName.equals(product.productName) && this.productPrice == product.productPrice && this.brandName.equals(brandName) && this.asin.equals(product.asin) && this.itemTypeName.equals(product.itemTypeName))
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, productId, productName, productPrice, itemTypeName, asin);
    }

    @Override
    public String toString() {
        return "Product :{Brand_Name : " + this.brandName + "product_Id : " + this.productId + "product_Name : " + this.productName + "product_Price" + this.productPrice + "item_Type_Name : " + this.itemTypeName + "ASIN : " + this.asin;

    }

}


