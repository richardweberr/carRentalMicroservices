package com.carrental.rental.Controller;

import com.carrental.rental.model.Booking;
import com.carrental.rental.model.Car;
import com.carrental.rental.model.RequestForCar;
import com.carrental.rental.services.BookingService;
import com.carrental.rental.services.CarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Api(tags = "Controleur disponibilité et plus")
@RestController
public class RentalController {

    @Autowired
    CarService carService;
    @Autowired
    BookingService bookingService;

    @ApiOperation(value = "vérifie la disponibilité, ")
    @RequestMapping(value = "/rentalAvailability", method = RequestMethod.POST)
    public ArrayList<Car> rentalAvailability(@RequestBody RequestForCar requestForCar) {
        ArrayList<Integer> carsIdAvailable = new ArrayList<>();
        for (Booking booking : bookingService.getBookingList()) {
            if ((requestForCar.getDate_start().compareTo(booking.getDate_end()) > 0) || (requestForCar.getDate_end().compareTo(booking.getDate_start()) < 0)) {
                carsIdAvailable.add(booking.getCar_id());
            }
        }
        return carService.carListById(carService.getCarList(), carsIdAvailable);
    }

//    @ApiOperation(value = "calcul prix de location")
//    @RequestMapping(value = "/rentalEstimatedPrice", method = RequestMethod.POST)
//    public int rentalEstimatedPrice(@RequestBody RequestForPricing requestForPricing) {
//        RestTemplate restTemplate = new RestTemplate();
//        Car[] cars = restTemplate.getForObject("http://localhost:8020/cars", Car[].class);
//        return 0;
//    }


}
