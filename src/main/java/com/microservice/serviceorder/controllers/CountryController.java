package com.microservice.serviceorder.controllers;

import java.util.HashMap;
import java.util.Map;

import com.microservice.serviceorder.models.Country;
import com.microservice.serviceorder.repositories.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping("/countries/{id}")
    @ResponseBody
    public Country show(@PathVariable int id) {
        return countryRepository.findById(id).get();
    }

    @DeleteMapping("/countries/{id}")
    @ResponseBody
    public Map<String, String> destroy(@PathVariable int id) {

        countryRepository.deleteById(id);

        Map<String, String> success = new HashMap<String, String>();
        success.put("success", "true");
        success.put("message", "Data successfully deleted");

        return success;
    }

    @PutMapping("/countries/{id}")
    @ResponseBody
    public Country update(@RequestBody Country param, @PathVariable int id) {
        param.setCountry_id(id);
        return countryRepository.save(param);
    }
}
