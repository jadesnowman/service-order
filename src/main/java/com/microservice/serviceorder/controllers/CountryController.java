package com.microservice.serviceorder.controllers;

import com.microservice.serviceorder.models.Country;
import com.microservice.serviceorder.repositories.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class CountryController {
    @Autowired

    private CountryRepository countryRepository;

    @GetMapping("/countries")
    @ResponseBody
    public Iterable<Country> index() {
        return countryRepository.findAll();
    }

    @PostMapping("/countries")
    @ResponseBody
    public Country store(@RequestBody Country param) {

        countryRepository.save(param);

        return param;
    }
}
