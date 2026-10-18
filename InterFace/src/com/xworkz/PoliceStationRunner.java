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
        policeStationImpl.getPoliceOfficer();

            System.out.println("fetching police officer name  by   id");
            policeStationImpl.getPoliceOfficerNameByPoliceOfficerId(2);

            System.out.println("fetching police officer department  by   name ");
            policeStationImpl.getPoliceOfficerDepartmentByPoliceOfficerName("Shiva");

            System.out.println("fetching police officer badgeNumber  by   rank ");
            policeStationImpl.getPoliceOfficerBadgeNumberByPoliceOfficerRank(1000);

            System.out.println("fetching onDuty by  police age");
            policeStationImpl.getPoliceOfficerOnDutyByPoliceOfficerAge(25);

        System.out.println("fetching the police Rank by  id");
        policeStationImpl.getPoliceOfficerRankBypoliceOfficerId(10);

        System.out.println("fetching policeName by policeOfficerRank");
        policeStationImpl.getPoliceOfficerNameByPoliceOfficerRank(1000);

        }
    }
