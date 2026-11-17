package com.xworkz.collections.country;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class CountryDto {

    private String countryName;
    private  int countryPin;
    private String primeMinister;
    private double population;

public CountryDto(String countryName,int countryPin,String primeMinister,double population){
    this.countryName=countryName;
    this.countryPin=countryPin;
    this.population=population;
    this.primeMinister=primeMinister;
}
public String toString(){
    return "country details : { countryName : "+this.countryName+"countryPin : "+this.countryPin+"population :"+this.population+"prime Minister : "+this.primeMinister+"}";
}
}
