package com.xworkz;

import com.xworkz.policestation.PoliceStation;
import com.xworkz.policestation.PoliceStationImpl;
import com.xworkz.policestation.police.PoliceOfficer;

import java.util.Scanner;

public class PoliceStationRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no of police");
        int size = scanner.nextInt();

        PoliceStation policeStationImpl = new PoliceStationImpl(size);

        for (int i = 0; i < size; i++) {
            PoliceOfficer policeOfficer = new PoliceOfficer();
            System.out.println("enter the police officer id");
            policeOfficer.setPoliceId(scanner.nextInt());

            System.out.println("enter police officer name");
            policeOfficer.setOfficerName(scanner.next());

            System.out.println("enter police department");
            policeOfficer.setDepartment(scanner.next());

            System.out.println("enter police rank");
            policeOfficer.setRank(scanner.nextInt());

            System.out.println("enter police badge number");
            policeOfficer.setBadgeNumber(scanner.next());

            System.out.println("enter police is On duty");
            policeOfficer.setOnDuty(scanner.nextBoolean());

            System.out.println("Enter police officer Age ");
            policeOfficer.setPoliceOfficerAge(scanner.nextInt());

           if(policeStationImpl.addPoliceOfficer(policeOfficer)>0){
            policeStationImpl.addPoliceOfficer(policeOfficer);
            }else{
                System.out.println("police officers not adding");
            }
        }
        String yesOrNo=null;
        do{
            System.out.println("press  1 getPoliceOfficer ");
            System.out.println("press 2 getPoliceOfficerNameByPoliceOfficerId ");
            System.out.println("press 3 getPoliceOfficerDepartmentByPoliceOfficerName ");
            System.out.println("press 4 getPoliceOfficerBadgeNumberByPoliceOfficerRank ");
            System.out.println("press 5 getPoliceOfficerOnDutyByPoliceOfficerAge ");
            System.out.println("press 7 getPoliceOfficerRankBypoliceOfficerId ");
            System.out.println("press 8 updateOfficerNameById");
            System.out.println("press 9 updateDepartmentByName ");
            System.out.println("press 10 updateBadgeNumberByRank");
            System.out.println("press 11 updateonDutyBYAge");

        System.out.println("please enter option");
        int option=scanner.nextInt();

        switch(option) {
            case 1:
                System.out.println("all police officer details");
                policeStationImpl.getPoliceOfficer();
                break;

            case 2:
                System.out.println("fetching police officer name  by   id");
                policeStationImpl.getPoliceOfficerNameByPoliceOfficerId(2);
                break;

            case 3:
                System.out.println("fetching police officer department  by   name ");
                policeStationImpl.getPoliceOfficerDepartmentByPoliceOfficerName("Shiva");
                break;

            case 4:
                System.out.println("fetching police officer badgeNumber  by   rank ");
                policeStationImpl.getPoliceOfficerBadgeNumberByPoliceOfficerRank(1000);
                break;

            case 5:
                System.out.println("fetching onDuty by  police age");
                policeStationImpl.getPoliceOfficerOnDutyByPoliceOfficerAge(25);
                break;

            case 6:
                System.out.println("fetching the police Rank by  id");
                policeStationImpl.getPoliceOfficerRankBypoliceOfficerId(10);
                break;

            case 7:
                System.out.println("fetching policeName by policeOfficerRank");
                policeStationImpl.getPoliceOfficerNameByPoliceOfficerRank(1000);

                break;

            case 8:
                System.out.println("update OfficerName Based on Id");
                policeStationImpl.updateOfficerNameById("kalmesh",2);
                policeStationImpl.getPoliceOfficerNameByPoliceOfficerId(2);
                break;

            case 9:
                System.out.println("update Department Based on Name");
                policeStationImpl.updateDepartmentByName("civil"," dr.kiran");
                break;

            case 10:
                System.out.println("update BadgeNumber Based on Rank");
                policeStationImpl.updateBadgeNumberByRank("sfg54",150);
                break;

            case 11:
                System.out.println("update onDuty Based on Age");
                policeStationImpl.updateonDutyBYAge(true,25);
                policeStationImpl.getPoliceOfficerOnDutyByPoliceOfficerAge(25);
                break;

            default:
                System.out.println("please enter valid option");
        }
        System.out.println("Do you want to continue Y/N");
        yesOrNo=scanner.next();
        }while (yesOrNo.equalsIgnoreCase("Y"));
    }
    }
