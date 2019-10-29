package com.carrental.booking.model;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int booking_id;
    private int car_id;
    private int client_id;
    private Date date_start;
    private Date date_end;
    private int distance_estimated;
    private int distance_performed;

    public Booking() {
    }

    public Booking(int client_id, Date date_start, Date date_end, int distance_estimated, int distance_performed) {
        this.client_id = client_id;
        this.date_start = date_start;
        this.date_end = date_end;
        this.distance_estimated = distance_estimated;
        this.distance_performed = distance_performed;
    }

    public Booking(int car_id, int client_id, Date date_start, Date date_end, int distance_estimated, int distance_performed) {
        this.car_id = car_id;
        this.client_id = client_id;
        this.date_start = date_start;
        this.date_end = date_end;
        this.distance_estimated = distance_estimated;
        this.distance_performed = distance_performed;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public Date getDate_start() {
        return date_start;
    }

    public void setDate_start(Date date_start) {
        this.date_start = date_start;
    }

    public Date getDate_end() {
        return date_end;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

    public int getDistance_estimated() {
        return distance_estimated;
    }

    public void setDistance_estimated(int distance_estimated) {
        this.distance_estimated = distance_estimated;
    }

    public int getDistance_performed() {
        return distance_performed;
    }

    public void setDistance_performed(int distance_performed) {
        this.distance_performed = distance_performed;
    }
}

//{
//        "booking_id": 1,
//        "car_id": 2,
//        "client_id": 1,
//        "date_start": 500,
//        "date_end": 800,
//        "distance_estimated": 100,
//        "distance_performed": 110,
//        }
