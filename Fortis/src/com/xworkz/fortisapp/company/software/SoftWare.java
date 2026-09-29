package com.xworkz.fortisapp.company.software;

public class SoftWare {

    private int softwareId;
    private String softwareName;
    private double price;
    private int numberOfEmp;


    public void setSoftwareId(int id){
        softwareId=id;
    }
    public int getSoftwareId(){
        return softwareId;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfEmp() {
        return numberOfEmp;
    }

    public void setNumberOfEmp(int numberOfEmp) {
        this.numberOfEmp = numberOfEmp;
    }

    @Override
    public String toString() {
        return "SoftWare{" +
                "softwareId=" + softwareId +
                ", softwareName='" + softwareName + '\'' +
                ", price=" + price +
                ", number Of Emp=" + numberOfEmp +
                '}';
    }
}
