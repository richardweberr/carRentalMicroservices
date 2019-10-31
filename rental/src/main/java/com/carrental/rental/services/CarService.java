package com.carrental.rental.services;

import com.carrental.rental.model.Car;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class CarService {

    public Car[] getCarList() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:8020/cars", Car[].class);
    }

    public ArrayList<Car> carListById(Car[] cars, ArrayList<Integer> carsIdAvailable) {
        ArrayList<Car> carsAvailable = new ArrayList<>();
        for (Car car : cars) {
            for (int carId : carsIdAvailable) {
                if (car.getId() == carId) {
                    carsAvailable.add(car);
                }
            }
        }
        return carsAvailable;
    }

}
