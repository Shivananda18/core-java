package com.xworkz.movieticketbookingapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public abstract  class BookMyShow implements WatchMovieApp {

    @Override
    public void TicketBooking() {
        System.out.println("TicketBooking in BookMyShow");
    }

    @Override
    public void freeGift() {
        System.out.println("free Gift given by BookMyShow");

    }
}
