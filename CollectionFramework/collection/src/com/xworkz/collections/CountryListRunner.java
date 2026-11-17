package com.xworkz.collections;

import com.xworkz.collections.country.CountryDto;

import java.util.ArrayList;
import java.util.List;

public class CountryListRunner {

    public static void main(String[] args) {


        List<CountryDto> countryDtoList=new ArrayList<>();
        countryDtoList.add(new CountryDto("amith",1,"Modi",500.0));
        countryDtoList.add(new CountryDto("shrilanka",656,"frfsdwes",502));

    }
}

