package com.carrental.rental.Controller;

import com.carrental.rental.model.Booking;
import com.carrental.rental.model.Car;
import com.carrental.rental.model.RequestForCar;
import com.carrental.rental.model.RequestForPricing;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@RestController
public class RentalController {


    @RequestMapping(value = "/rentalAvailability", method = RequestMethod.POST)
    public ArrayList<Car> rentalAvailability(@RequestBody RequestForCar requestForCar) {
        RestTemplate restTemplate = new RestTemplate();
        ArrayList<Integer> carsIdAvailable = new ArrayList<>();
        ArrayList<Car> carsAvailable = new ArrayList<>();
        Booking[] bookings = restTemplate.getForObject("http://localhost:8030/bookingList", Booking[].class);
        for (Booking booking : bookings) {
            if ((requestForCar.getDate_start().compareTo(booking.getDate_end()) > 0) || (requestForCar.getDate_end().compareTo(booking.getDate_start()) < 0)) {
                carsIdAvailable.add(booking.getCar_id());
            }
        }
        Car[] cars = restTemplate.getForObject("http://localhost:8020/cars", Car[].class);
        for (Car car : cars) {
            for (int carId : carsIdAvailable) {
                if (car.getId() == carId) {
                    carsAvailable.add(car);
                }
            }
        }
        return carsAvailable;
    }

    @RequestMapping(value = "/rentalEstimatedPrice", method = RequestMethod.POST)
    public int rentalEstimatedPrice(@RequestBody RequestForPricing requestForPricing) {
        RestTemplate restTemplate = new RestTemplate();
        return 0;
    }
}
