package com.xworkz.equalsmethodapp;

import com.xworkz.equalsmethodapp.clock.Clock;
import com.xworkz.equalsmethodapp.laptop.Laptop;

public class AllRunner {

    public static void main(String[] args) {

        Watch watch=new Watch();
        System.out.println("watch class started===========");
       watch.watchId=1;
        watch.watchName="London Fog";
         watch.bandColor="Black";
        watch.countryOfOrigin="Hong Kong";

        Watch watch1=new Watch();
        watch1.watchId=1;
        watch1.watchName="London Fog";
        watch1.bandColor="Black";
        watch1.countryOfOrigin="Hong kong";
        System.out.println("watch and watch1 are same : "+watch.equals(watch1));
        System.out.println("watch class ended========");

       Swiggy swiggy=new Swiggy();
         swiggy.swiggyId=10;
        swiggy.swiggyOrderName="biryani";
        swiggy.swiggyOrderNumber=1646;
        swiggy.orederPrice=150;
        swiggy.orderLocation="Rajajinagar Bangalore";


        Swiggy swiggy1=new Swiggy();
        swiggy1.swiggyId=11;
        swiggy1.swiggyOrderName="biryani";
        swiggy1.swiggyOrderNumber=1646;
        swiggy1.orederPrice=150;
        swiggy1.orderLocation="Rajajinagar Bangalore";
        System.out.println("swiggy and swiggy1 are equal : "+swiggy.equals(swiggy1));


        SoundBox soundBox=new SoundBox();
        soundBox.brand="JBL";
        soundBox.speakerMaximumOutputPowerInWatts=160;
        soundBox.frequency="20000KHz";
        soundBox.AudioOutputMode="Stereo";


        SoundBox soundBox1=new SoundBox();
        soundBox1.brand="JBL";
        soundBox1.speakerMaximumOutputPowerInWatts=160;
        soundBox1.frequency="20000KHz";
        soundBox1.AudioOutputMode="Stereo";

        System.out.println("soundBox and SoundBox1 are same : "+soundBox.equals(soundBox1));



        Laptop laptop=new Laptop();
        laptop.laptopName="Lenovo";
        laptop.modelName="LOQ";
        laptop.color="Grey";
        laptop.hardDiskSizeinMB=512;

        Laptop laptop1=new Laptop();
        laptop1.laptopName="Lenovo";
        laptop1.modelName="LOQ";
        laptop1.color="Black";
        laptop1.hardDiskSizeinMB=512;

        System.out.println("laptop and laptop1 are equal : "+laptop.equals(laptop1));


        Clock clock=new Clock();
        clock.brand="Ajantha";
        clock.displayType="Analog";
        clock.style="Modern";
        clock.specialFeature="step Movement";
        clock.productPrice=300;

        Clock clock1=new Clock();
        clock1.brand="Matiz";
        clock1.displayType="Analog";
        clock1.style="Modern";
        clock1.specialFeature="step Movement";
        clock1.productPrice=300;

        System.out.println("clock and clock1 are same : "+clock.equals(clock1));


        LEDTV ledtv=new LEDTV();
        ledtv.brandName="Samsung";
        ledtv.ScreenSize="55 Inches";
        ledtv.display="QLED";
        ledtv.resolution="4K";
        ledtv.refreshRate="50Hz";

        LEDTV ledtv1=new LEDTV();
        ledtv1.brandName="Samsung";
        ledtv1.ScreenSize="55 Inches";
        ledtv1.display="QLED";
        ledtv1.resolution="4K";
        ledtv1.refreshRate="50Hz";
        System.out.println("ledtv and ledtv are same  : "+ledtv.equals(ledtv1));

        Printer printer=new Printer();
        printer.brandName="HP";
        printer.connectingTechnology="USb";
        printer.printing="Inkjet";
        printer.specialFeature="USB";
        printer.itemWeight="5.03 Kilograms";
        printer.modelName="HP Tank";


        Printer printer1=new Printer();
        printer1.brandName="HP";
        printer1.connectingTechnology="USb";
        printer1.printing="Inkjet";
        printer1.specialFeature="USB";
        printer1.itemWeight="5.03 Kilograms";
        printer1.modelName="HP Tank";

        System.out.println("printer is equals to printer1 :  "+printer.equals(printer1));
     System.out.println(printer1.hashCode());
     System.out.println(printer.hashCode());
     System.out.println(printer);
/*
        WashingMachine washingMachine=new WashingMachine();
        washingMachine.machineName="LG Smart";
        washingMachine.Product="44D x 60W x 85H";
        washingMachine.Dimensions="Centimeters";
        washingMachine.brand="LG";
        washingMachine.accessLocation="Front Load";

        WashingMachine washingMachine1=new WashingMachine();
        washingMachine1.machineName="LG Smart";
        washingMachine1.Product="44D x 60W x 85H";
        washingMachine1.Dimensions="Centimeters";
        washingMachine1.brand="LG";
        washingMachine1.accessLocation="Front Load";

        System.out.println("washigmachine and washing machine1 are same : "+washingMachine.equals(washingMachine1));


        Bike bike=new Bike();
        bike.bikeName="tvs";
        bike.bikeNumber="KA 16 1360";
        bike.bikePrice=120000;
        bike.engineCC="150cc";

        Bike bike1=new Bike();
        bike1.bikeName="Hero Honda";
        bike1.bikeNumber="KA 16 1360";
        bike1.bikePrice=120000;
        bike1.engineCC="125cc";

        System.out.println("bike and bike1 are same capacity"+bike.equals(bike1));

        Car car=new Car();
        car.carName="Range Rover";
        car.carNumber="KA 16 1360";
        car.color="Balck";
        car.price=30000000;

        Car car1=new Car();
        car1.carName="Range Rover";
        car1.carNumber="KA 16 1360";
        car1.color="Balck";
        car1.price=29000000;

        System.out.println("car and car1 are same : "+car.equals(car1));

        Bat bat=new Bat();
        bat.brandName="SAG";
        bat.batSize=6;
        bat.materialType="English willow";
        bat.color="Red";

     Bat bat1=new Bat();
     bat1.brandName="SAG";
     bat1.batSize=6;
     bat1.materialType="English willow";
     bat1.color="Red";

     System.out.println("bat  and bat1 are equal : "+bat.equals(bat1));


     VollyBall vollyBall=new VollyBall();
     vollyBall.ballName="Vector";
     vollyBall.material="Nova Soft PU";
     vollyBall.ageRange="youth";
     vollyBall.itemWeight="280 grams";
     vollyBall.color="Yellow/Blue";
     vollyBall.price=600;

     VollyBall vollyBall1=new VollyBall();
     vollyBall1.ballName="Navia";
     vollyBall1.material="Nova Soft PU";
     vollyBall1.ageRange="youth";
     vollyBall1.itemWeight="280 grams";
     vollyBall1.color="Yellow/Blue";
     vollyBall1.price=800;

     System.out.println("navia and vector vollyball are same : "+vollyBall.equals(vollyBall1));

     DrivingLicence drivingLicence=new DrivingLicence();
     drivingLicence.name="shivu";
     drivingLicence.dlNumber="ljdg26";
     drivingLicence.dateOfBirth="25/10/1998";
     drivingLicence.address="Bang//alore";
     drivingLicence.bloodGroup="B+";

     DrivingLicence drivingLicence1=new DrivingLicence();
     drivingLicence1.name="shivu";
     drivingLicence1.dlNumber="ljdg26";
     drivingLicence1.dateOfBirth="25/10/1998";
     drivingLicence1.address="Bang//alore";
     drivingLicence1.bloodGroup="B+";

     System.out.println("driving licence are same : "+drivingLicence.equals(drivingLicence1));

   */
    }
}
