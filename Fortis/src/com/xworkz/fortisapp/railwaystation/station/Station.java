package com.xworkz.fortisapp.railwaystation.station;

public class Station {

    private int stationId;
    private String stationName;
    private String code;
    private String city;
    private String zone;
    private String location;
    private String trainName;
    private String SourceDeparture;
    private String JourneyDetails;
    private String DestinationArrival;


    public void setStationId(int stationId) {
        this.stationId = stationId;
    }
    public int getStationId() {
        return stationId;
    }
    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getSourceDeparture() {
        return SourceDeparture;
    }

    public void setSourceDeparture(String sourceDeparture) {
        SourceDeparture = sourceDeparture;
    }

    public String getJourneyDetails() {
        return JourneyDetails;
    }

    public void setJourneyDetails(String journeyDetails) {
        JourneyDetails = journeyDetails;
    }

    public String getDestinationArrival() {
        return DestinationArrival;
    }

    public void setDestinationArrival(String destinationArrival) {
        DestinationArrival = destinationArrival;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationId=" + stationId+
                ", stationName='" + stationName+
                ", code='" + code+
                ", city='" + city+
                ", zone='" + zone+
                ", location='" + location+
                ", trainName='" + trainName+
                ", SourceDeparture='" + SourceDeparture+
                ", JourneyDetails='" + JourneyDetails+
                ", DestinationArrival='" + DestinationArrival+'}';
    }
}