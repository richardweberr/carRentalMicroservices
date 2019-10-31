package com.carrental.rental.Controller;

import com.carrental.rental.model.Booking;
import com.carrental.rental.model.Car;
import com.carrental.rental.model.RequestForCar;
import com.carrental.rental.model.RequestForPricing;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Api(tags = "Controleur disponibilité et plus")
@RestController
public class RentalController {

    @ApiOperation(value = "vérifie la disponibilité, dates en entrée, list de cars en sortie")
    @RequestMapping(value = "/rentalAvailability", method = RequestMethod.POST)
    public ArrayList<Car> rentalAvailability(@RequestBody RequestForCar requestForCar) {
        RestTemplate restTemplate = new RestTemplate();
        ArrayList<Integer> carsIdAvailable = new ArrayList<>();
        ArrayList<Car> carsAvailable = new ArrayList<>();
        Booking[] bookings = restTemplate.getForObject("http://localhost:8030/bookingList", Booking[].class);
        for (Booking booking : bookings) {
            System.out.println(requestForCar.getDate_start());
            System.out.println(booking.getDate_end());
            System.out.println(requestForCar.getDate_start().compareTo(booking.getDate_end()) > 0);
            System.out.println(requestForCar.getDate_end());
            System.out.println(booking.getDate_start());
            System.out.println(requestForCar.getDate_end().compareTo(booking.getDate_start()) < 0);
            if ((requestForCar.getDate_start().compareTo(booking.getDate_end()) > 0) || (requestForCar.getDate_end().compareTo(booking.getDate_start()) < 0)) {
                carsIdAvailable.add(booking.getCar_id());
                System.out.println(booking.getCar_id());
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

    @ApiOperation(value = "calcul prix de location")
    @RequestMapping(value = "/rentalEstimatedPrice", method = RequestMethod.POST)
    public int rentalEstimatedPrice(@RequestBody RequestForPricing requestForPricing) {
        RestTemplate restTemplate = new RestTemplate();
        Car[] cars = restTemplate.getForObject("http://localhost:8020/cars", Car[].class);
        return 0;
    }

//    @ApiOperation(value = "selection voitures selon age conducteur")
//    @RequestMapping(value = "/rentalCarsByAge", method = RequestMethod.POST)
//    public ArrayList<Car> rentalCarsByAge(@RequestBody requestForAge)
}
