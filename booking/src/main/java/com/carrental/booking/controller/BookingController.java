package com.carrental.booking.controller;

import com.carrental.booking.DAO.BookingDAO;
import com.carrental.booking.model.Booking;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api(description = "CRUD to booking DB")
@RestController
public class BookingController {

    @Autowired
    private BookingDAO bookingDAO;

    @ApiOperation(value = "create new booking")
    @RequestMapping(value = {"/bookingCreate"}, method = RequestMethod.POST)
    public void bookingCreate(@RequestBody Booking booking) {
        bookingDAO.save(booking);
    }

    @ApiOperation(value = "list all bookings")
    @RequestMapping(value = {"/bookingList"}, method = RequestMethod.GET)
    public List bookingList() {
        return bookingDAO.findAll();
    }

    @ApiOperation(value = "show one booking by id")
    @RequestMapping(value = {"/booking/{id}"}, method = RequestMethod.GET)
    public Optional<Booking> bookingOne(@PathVariable int id) {
        return bookingDAO.findById(id);
    }

//    @ApiOperation(value = "show show list of booked cars for ")
//    @RequestMapping(value = {"/booking/{id}"}, method = RequestMethod.GET)
//    public Optional<Booking> bookingOne(@PathVariable int id) {
//        return bookingDAO.findById(id);

    @ApiOperation(value = "list all bookings")
    @RequestMapping(value = {"/updateBooking"}, method = RequestMethod.PUT)
    public Booking bookingEdit(@RequestBody Booking booking) {
        bookingDAO.save(booking);
        return booking;
    }

    @RequestMapping(value = {"/deleteBooking/{id}"}, method = RequestMethod.DELETE)
    public void bookingDelete(@PathVariable int id) {
        bookingDAO.deleteById(id);
    }
}
