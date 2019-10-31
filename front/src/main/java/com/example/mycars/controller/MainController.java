package com.example.mycars.controller;

import com.example.mycars.model.Car;
import com.example.mycars.model.RequestForCar;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {

    @GetMapping(value = { "/", "/index" }) // Routing sur l'index
    public ModelAndView index() { // instanciation d'un nouvau Model controlleur
        ModelAndView mv = new ModelAndView();
        mv.addObject("requestForCar", new RequestForCar());
        mv.setViewName("index");
        return mv; // retourne la vue index
    }


    @PostMapping(value = { "/chocolat" }) // Routing POST sur l'url /chocolat
    public String saveCar(Model model, @RequestBody RequestForCar requestForCar) { // instanciation d'un nouveau Model controlleur
        RestTemplate restTemplate = new RestTemplate();
        Car cars = restTemplate.postForObject("http://localhost:8040/rentalAvailability", requestForCar, Car.class);
        model.addAttribute("cars", cars);
        return "car"; // retourne la vue index
    }


    @GetMapping(value = { "/car" }) // Routing sur l'index
    public ModelAndView car() { // instanciation d'un nouvau Model controlleur
        ModelAndView mv = new ModelAndView();
        mv.setViewName("car");
        return mv; // retourne la vue index
    }

}
