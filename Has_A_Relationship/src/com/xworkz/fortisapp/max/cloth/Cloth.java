package com.xworkz.fortisapp.max.cloth;

public class Cloth {

    private int clothId;
    private int size;
    private String color;
    private String brand;
    private String discount;
    private String Gender;
    private String countryOfOrigin;
    private String type;
    private String Design;

    public int getClothId() {
        return clothId;
    }

    public void setClothId(int clothId) {
        this.clothId = clothId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesign() {
        return Design;
    }

    public void setDesign(String design) {
        Design = design;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "clothId=" + clothId +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", discount='" + discount + '\'' +
                ", Gender='" + Gender + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", type='" + type + '\'' +
                ", Design='" + Design + '\'' +
                '}';
    }
}
