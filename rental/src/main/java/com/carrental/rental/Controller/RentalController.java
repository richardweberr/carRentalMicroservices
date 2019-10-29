package com.carrental.rental.Controller;

import com.carrental.rental.model.Booking;
import com.carrental.rental.model.Car;
import com.carrental.rental.model.DataForm;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class RentalController {

    @RequestMapping(value = "/rentalAvailability", method = RequestMethod.POST)
    public ArrayList<Integer> rentalAvailability(@RequestBody DataForm dataForm) {
        RestTemplate restTemplate = new RestTemplate();
        ArrayList<Integer> carIdAvailable = new ArrayList<>();
//        ArrayList<Car> carsAvailable = new ArrayList<>();
        Booking[] bookings = restTemplate.getForObject("http://localhost:8030/bookingList", Booking[].class);
        for (Booking booking : bookings) {
            if ( (new Date(dataForm.getDate_start()).compareTo(booking.getDate_end()) > 0) || (new Date(dataForm.getDate_end()).compareTo(booking.getDate_start()) < 0) ){
                carIdAvailable.add(booking.getCar_id());
            }
        }
        System.out.println(carIdAvailable.size());
        return carIdAvailable;
    }
//
//    @RequestBody(value = "/rentalPrice)
}
