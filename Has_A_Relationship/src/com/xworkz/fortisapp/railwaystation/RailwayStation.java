package com.xworkz.fortisapp.railwaystation;

import com.xworkz.fortisapp.railwaystation.station.Station;

public class RailwayStation {

    public Station[] stations=new Station[10];

    int index;
    public boolean addStations(Station station){
        boolean isStationAdded=false;
        boolean isStationIdValid=false;
        boolean isStationNameValid=false;
        boolean isStationCodeisValid=false;
        boolean isStationCityValid=false;
        boolean isStationZoneValid=false;
        boolean isStationLocation=false;
        boolean isTrainNameValid=false;
        boolean isSourceDeparture=false;
        boolean isJourneyDetailsValid=false;
        boolean isDestinationArrival=false;

        if(station.getStationId()>0){
            isStationIdValid=true;
        }
        if(station.getStationName() !=null && !station.getTrainName().isEmpty()){
            isStationNameValid=true;
        }
        if(station.getCode() !=null && !station.getCode().isEmpty()){
            isStationCodeisValid=true;
        }
        if(station.getCity() !=null && !station.getCity().isEmpty()){
            isStationCityValid=true;
        }
        if(station.getZone() !=null && !station.getZone().isEmpty()){
            isStationZoneValid=true;
        }
        if(station.getLocation()!=null  && !station.getLocation().isEmpty()){
            isStationLocation=true;
        }
        if(station.getTrainName() !=null && !station.getTrainName().isEmpty()){
            isTrainNameValid=true;
        }
        if(station.getSourceDeparture() !=null && !station.getSourceDeparture().isEmpty()){
            isSourceDeparture=true;
        }
        if(station.getJourneyDetails() !=null && !station.getJourneyDetails().isEmpty()){
            isJourneyDetailsValid=true;
        }
        if(station.getDestinationArrival() !=null && !station.getDestinationArrival().isEmpty()){
            isDestinationArrival=true;
        }
        if(isStationIdValid && isStationNameValid && isStationCodeisValid && isStationCityValid && isStationZoneValid && isStationLocation && isTrainNameValid && isSourceDeparture && isJourneyDetailsValid && isDestinationArrival){
            this.stations[index++]=station;

            isStationAdded=true;
        }

       return isStationAdded;
    }


    public  void getAllStation(){
        for(Station station:stations){
            System.out.println(station);

        }
    }
}
