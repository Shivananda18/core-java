package com.xworkz.amazon;

import com.xworkz.amazon.amazonProductImpl.product.Product;

public interface AmazonProduct {

    boolean addProduct(Product product);
    void getAllProducts();
    int getProductIdByBrandName(String brandName);
    String getProductModelByProductScreenSize(String screenSize);
    int gethardDiskInGbBySpecialFeature(String[] specialFeature);
    String getProductColorByProductRam(String productRam);
    String[] getProductFeatureByProductColour(String productColour);
    boolean updateIdByName(int newId,String name);
    boolean updateModelByRam(String newModel,String ram);
    boolean updateFeaturByColour(String[] newFeature,String colour);
}
