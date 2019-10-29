package com.carrental.rental.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
public class RentalController {

    @RequestMapping(value = "/rental", method = RequestMethod.POST)
    public List<Car> rental (@RequestBody Date date_start, @RequestBody Date date_end) {

    }
}
