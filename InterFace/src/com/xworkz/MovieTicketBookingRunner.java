package com.xworkz;

import com.xworkz.movieticketbookingapp.BookMyShow;
import com.xworkz.movieticketbookingapp.Paytm;
import com.xworkz.movieticketbookingapp.WatchMovieApp;

public class MovieTicketBookingRunner {


    public static void main(String[] args) {


        WatchMovieApp paytm =new Paytm();
        paytm.TicketBooking();
        paytm.orderFood();

    }
}
