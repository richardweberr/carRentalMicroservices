package com.carrental.car.controller;

import com.carrental.car.Dao.carDao;
import com.carrental.car.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {


    @Autowired
    private carDao carDao;


    @GetMapping(value = "cars")

    public List<Car> carList() {

        return carDao.findAll();
    }


    @GetMapping(value = "cars/{id}")
    public Car showCar(@PathVariable int id) {

        return carDao.findById(id);
    }

    @PostMapping("cars")
    public void addCar(@RequestBody Car car) {
        carDao.save(car);

    }

    @DeleteMapping("car/{id}")
    public List<Car> deleteCar(@PathVariable int id) {
        carDao.deleteById(id);
        return carDao.findAll();

    }


    @PutMapping("cars")
    public void modifyCar(@RequestBody Car car) {
        carDao.deleteById(car.getId());
        carDao.save(car);

    }


}
