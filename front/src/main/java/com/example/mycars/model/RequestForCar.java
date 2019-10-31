package com.example.mycars.model;

import java.time.LocalDate;



public class RequestForCar {
    private LocalDate date_start;
    private LocalDate date_end;


    public LocalDate getDate_start() {
        return date_start;
    }

    public void setDate_start(LocalDate date_start) {
        this.date_start = date_start;
    }

    public LocalDate getDate_end() {
        return date_end;
    }

    public void setDate_end(LocalDate date_end) {
        this.date_end = date_end;
    }

}
