package com.carrental.rental.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;


public class RequestForCar {
    private int clientAge;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date_start;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date_end;

    public int getClientAge() {
        return clientAge;
    }

    public void setClientAge(int clientAge) {
        this.clientAge = clientAge;
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
}
