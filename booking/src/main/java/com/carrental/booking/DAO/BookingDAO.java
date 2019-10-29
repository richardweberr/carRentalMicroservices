package com.carrental.booking.DAO;

import com.carrental.booking.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingDAO extends JpaRepository<Booking, Integer> {

    @Override
    List<Booking> findAll();

    @Override
    Optional<Booking> findById(Integer integer);

//    @Override
//    Booking getOne(Integer integer);

    @Override
    <S extends Booking> S save(S s);

    @Override
    void deleteById(Integer integer);

}

