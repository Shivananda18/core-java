package com.xworkz.fortisapp.company;

import com.xworkz.fortisapp.company.software.SoftWare;

public class Company {

    SoftWare[] softWares = new SoftWare[9];
    int index;

    public boolean addSoftwares(SoftWare softWare) {
        boolean isSoftwareValid = false;
        boolean isSoftwareNameValid = false;
        boolean isPriceValid = false;
        boolean isNumberOfEmpValid = false;
        boolean isAdded = false;

        if (softWare.getSoftwareId() > 0) {
            isSoftwareValid = true;
        } else {
            System.out.println("isSoftwareValid");
        }
        if (softWare.getSoftwareName() != null && !softWare.getSoftwareName().isEmpty()) {
            isSoftwareNameValid = true;
        }
        if (softWare.getPrice() > 0) {
            isPriceValid = true;
        }
        if (softWare.getNumberOfEmp() > 0) {
            isNumberOfEmpValid = true;
        }
        if (isSoftwareValid && isSoftwareNameValid && isPriceValid && isNumberOfEmpValid) {
            this.softWares[index++] = softWare;
            isAdded = true;
        }
        return isAdded;
    }

    public void getAllSoftware() {
        for (SoftWare softWare : softWares) {
            System.out.println(softWare);
        }
    }

}
