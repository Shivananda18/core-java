package com.xworkz.fortisapp.runner;

import com.xworkz.fortisapp.railwaystation.RailwayStation;
import com.xworkz.fortisapp.railwaystation.station.Station;

public class RailwayStationRunner {

    public static void main(String[] args) {

        RailwayStation railwayStation=new RailwayStation();

        Station station1 = new Station();
        station1.setStationId(1);
        station1.setStationName("KSR Bengaluru City Junction");
        station1.setCode("SBC");
        station1.setCity("Bengaluru");
        station1.setZone("South Western Railway");
        station1.setLocation("Majestic, Bengaluru");
        station1.setTrainName("Karnataka Express");
        station1.setSourceDeparture("Bengaluru 06:00 AM");
        station1.setJourneyDetails("Bengaluru to New Delhi");
        station1.setDestinationArrival("New Delhi 10:30 AM");
        railwayStation.addStations(station1);


        Station station2 = new Station();
        station2.setStationId(2);
        station2.setStationName("Mysuru Junction");
        station2.setCode("MYS");
        station2.setCity("Mysuru");
        station2.setZone("South Western Railway");
        station2.setLocation("Mysuru");
        station2.setTrainName("Mysuru Express");
        station2.setSourceDeparture("Mysuru 07:00 AM");
        station2.setJourneyDetails("Mysuru to Bengaluru");
        station2.setDestinationArrival("Bengaluru 09:30 AM");
        railwayStation.addStations(station2);


        Station station3 = new Station();
        station3.setStationId(3);
        station3.setStationName("Tumakuru");
        station3.setCode("TK");
        station3.setCity("Tumakuru");
        station3.setZone("South Western Railway");
        station3.setLocation("Tumakuru");
        station3.setTrainName("Tumakuru Express");
        station3.setSourceDeparture("Tumakuru 08:00 AM");
        station3.setJourneyDetails("Tumakuru to Bengaluru");
        station3.setDestinationArrival("Bengaluru 09:45 AM");
        railwayStation.addStations(station3);


        Station station4 = new Station();
        station4.setStationId(4);
        station4.setStationName("Mandya");
        station4.setCode("MYA");
        station4.setCity("Mandya");
        station4.setZone("South Western Railway");
        station4.setLocation("Mandya");
        station4.setTrainName("Chamundi Express");
        station4.setSourceDeparture("Mandya 06:30 AM");
        station4.setJourneyDetails("Mandya to Bengaluru");
        station4.setDestinationArrival("Bengaluru 08:45 AM");
        railwayStation.addStations(station4);


        Station station5 = new Station();
        station5.setStationId(5);
        station5.setStationName("Hassan Junction");
        station5.setCode("HAS");
        station5.setCity("Hassan");
        station5.setZone("South Western Railway");
        station5.setLocation("Hassan");
        station5.setTrainName("Hassan Express");
        station5.setSourceDeparture("Hassan 07:30 AM");
        station5.setJourneyDetails("Hassan to Bengaluru");
        station5.setDestinationArrival("Bengaluru 11:00 AM");
        railwayStation.addStations(station5);


        Station station6 = new Station();
        station6.setStationId(6);
        station6.setStationName("Hubballi Junction");
        station6.setCode("UBL");
        station6.setCity("Hubballi");
        station6.setZone("South Western Railway");
        station6.setLocation("Hubballi");
        station6.setTrainName("Hubballi Express");
        station6.setSourceDeparture("Hubballi 06:00 AM");
        station6.setJourneyDetails("Hubballi to Bengaluru");
        station6.setDestinationArrival("Bengaluru 01:00 PM");
        railwayStation.addStations(station6);


        Station station7 = new Station();
        station7.setStationId(7);
        station7.setStationName("Davangere");
        station7.setCode("DVG");
        station7.setCity("Davangere");
        station7.setZone("South Western Railway");
        station7.setLocation("Davangere");
        station7.setTrainName("Davanagere Express");
        station7.setSourceDeparture("Davangere 08:00 AM");
        station7.setJourneyDetails("Davangere to Bengaluru");
        station7.setDestinationArrival("Bengaluru 01:30 PM");
        railwayStation.addStations(station7);


        Station station8 = new Station();
        station8.setStationId(8);
        station8.setStationName("Shivamogga Town");
        station8.setCode("SMET");
        station8.setCity("Shivamogga");
        station8.setZone("South Western Railway");
        station8.setLocation("Shivamogga");
        station8.setTrainName("Shivamogga Express");
        station8.setSourceDeparture("Shivamogga 07:00 AM");
        station8.setJourneyDetails("Shivamogga to Bengaluru");
        station8.setDestinationArrival("Bengaluru 12:00 PM");
        railwayStation.addStations(station8);


        Station station9 = new Station();
        station9.setStationId(9);
        station9.setStationName("Ballari Junction");
        station9.setCode("BALLARI");
        station9.setCity("Ballari");
        station9.setZone("South Western Railway");
        station9.setLocation("Ballari");
        station9.setTrainName("Ballari Express");
        station9.setSourceDeparture("Ballari 06:30 AM");
        station9.setJourneyDetails("Ballari to Bengaluru");
        station9.setDestinationArrival("Bengaluru 02:00 PM");
        railwayStation.addStations(station9);


        Station station10 = new Station();
        station10.setStationId(10);
        station10.setStationName("Kolar");
        station10.setCode("KQZ");
        station10.setCity("Kolar");
        station10.setZone("South Western Railway");
        station10.setLocation("Kolar");
        station10.setTrainName("Kolar Express");
        station10.setSourceDeparture("Kolar 07:30 AM");
        station10.setJourneyDetails("Kolar to Bengaluru");
        station10.setDestinationArrival("Bengaluru 10:00 AM");

        railwayStation.addStations(station10);

        railwayStation.getAllStation();
    }
}
