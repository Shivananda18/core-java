package com.xworkz.fortisapp.runner;

import com.xworkz.fortisapp.company.Company;
import com.xworkz.fortisapp.company.software.SoftWare;

public class CompanyRunner {
    public static void main(String[] args) {

        Company company = new Company();

        SoftWare softWare1 = new SoftWare();
        softWare1.setSoftwareId(1);
        softWare1.setSoftwareName("Microsoft Teams");
        softWare1.setPrice(1000000);
        softWare1.setNumberOfEmp(1000);
        company.addSoftwares(softWare1);

        SoftWare softWare2 = new SoftWare();
        softWare2.setSoftwareId(2);
        softWare2.setSoftwareName("Microsoft Word");
        softWare2.setPrice(800000);
        softWare2.setNumberOfEmp(800);
        company.addSoftwares(softWare2);

        SoftWare softWare3 = new SoftWare();
        softWare3.setSoftwareId(3);
        softWare3.setSoftwareName("Microsoft Excel");
        softWare3.setPrice(850000);
        softWare3.setNumberOfEmp(850);
        company.addSoftwares(softWare3);

        SoftWare softWare4 = new SoftWare();
        softWare4.setSoftwareId(4);
        softWare4.setSoftwareName("Microsoft PowerPoint");
        softWare4.setPrice(750000);
        softWare4.setNumberOfEmp(700);
        company.addSoftwares(softWare4);

        SoftWare softWare5 = new SoftWare();
        softWare5.setSoftwareId(5);
        softWare5.setSoftwareName("Microsoft Outlook");
        softWare5.setPrice(700000);
        softWare5.setNumberOfEmp(650);
        company.addSoftwares(softWare5);

        SoftWare softWare6 = new SoftWare();
        softWare6.setSoftwareId(6);
        softWare6.setSoftwareName("Microsoft OneDrive");
        softWare6.setPrice(600000);
        softWare6.setNumberOfEmp(500);
        company.addSoftwares(softWare6);

        SoftWare softWare7 = new SoftWare();
        softWare7.setSoftwareId(7);
        softWare7.setSoftwareName("Microsoft Access");
        softWare7.setPrice(550000);
        softWare7.setNumberOfEmp(450);
        company.addSoftwares(softWare7);

        SoftWare softWare8 = new SoftWare();
        softWare8.setSoftwareId(8);
        softWare8.setSoftwareName("Microsoft Visual Studio");
        softWare8.setPrice(900000);
        softWare8.setNumberOfEmp(900);
        company.addSoftwares(softWare8);

        SoftWare softWare9 = new SoftWare();
        softWare9.setSoftwareId(9);
        softWare9.setSoftwareName("Microsoft Power BI");
        softWare9.setPrice(950000);
        softWare9.setNumberOfEmp(950);
        company.addSoftwares(softWare9);

        company.getAllSoftware();
    }
}
