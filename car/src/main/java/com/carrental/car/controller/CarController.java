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


    @GetMapping(value="Cars")

    public List<Car> carList(){

        return carDao.findAll();
    }


    @GetMapping(value="Cars/{id}")
    public Car afficherCar(@PathVariable int id){

        return carDao.findById(id);
}

    @PostMapping("/Cars")
    public void addVoiture(@RequestBody Car car ) {
        carDao.save(car);

    }

    @DeleteMapping("/Cars/{id}")
    public  List<Car> deleteCar(@PathVariable int id ){
        carDao.deleteById(id);
        return carDao.findAll();

    }


    @PutMapping("/Cars")
    public void modifycar(@RequestBody Car car ) {
        carDao.deleteById(car.getId());
        carDao.save(car);

    }


}
