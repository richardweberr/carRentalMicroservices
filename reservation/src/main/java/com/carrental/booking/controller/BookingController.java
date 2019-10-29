package com.carrental.booking.controller;

import com.carrental.booking.DAO.BookingDAO;
import com.carrental.booking.model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookingController {

    @Autowired
    private BookingDAO bookingDAO;

    @RequestMapping(value = {"/create"}, method = RequestMethod.POST)
    public void bookingCreate(@RequestBody Booking booking) {
        bookingDAO.save(booking);
    }

    @RequestMapping(value = {"/bookings"}, method = RequestMethod.GET)
    public List bookingList() {
        return bookingDAO.findAll();
    }

    @RequestMapping(value = {"/booking/{id}"}, method = RequestMethod.GET)
    public Optional<Booking> bookingOne(@PathVariable int id) {
        return bookingDAO.findById(id);
    }

    @RequestMapping(value = {"/update"}, method = RequestMethod.PUT)
    public Booking bookingEdit(@RequestBody Booking booking) {
        bookingDAO.save(booking);
        return booking;
    }

    @RequestMapping(value = {"/delete/{id}"}, method = RequestMethod.DELETE)
    public void bookingDelete(@PathVariable int id) {
        bookingDAO.deleteById(id);
    }
}
