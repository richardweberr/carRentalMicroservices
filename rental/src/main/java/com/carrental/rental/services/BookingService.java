package com.carrental.rental.services;

import com.carrental.rental.model.Booking;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookingService {

    public Booking[] getBookingList() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:8030/bookingList", Booking[].class);
    }
}

