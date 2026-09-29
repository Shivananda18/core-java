package com.xworkz.fortisapp.Bakery.condiment;

public class Condiment {

    private int candimentId;
    private String candimentName;
    private double Price;

    public int getCandimentId() {
        return candimentId;
    }

    public void setCandimentId(int candimentId) {
        this.candimentId = candimentId;
    }

    public String getCandimentName() {
        return candimentName;
    }

    public void setCandimentName(String candimentName) {
        this.candimentName = candimentName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
    @Override
    public String toString() {
        return "Candiment{" +
                "candimentId=" + candimentId +
                ", candimentName='" + candimentName + '\'' +
                ", Price=" + Price +
                '}';
    }
}
