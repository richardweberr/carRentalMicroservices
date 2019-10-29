package com.carrental.car.Dao;

import com.carrental.car.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface carDao extends JpaRepository<Car, Integer> {
        Car findById(int id);
        Car deleteById(int id);
}
//public interface carDao {
//    public List<Car>findAll();
//    public Car findById(int id);
//    public Car save(Car car);
//    public void delete(int id);
//}
