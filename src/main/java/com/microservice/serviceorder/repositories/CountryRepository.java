package com.microservice.serviceorder.repositories;

import com.microservice.serviceorder.models.Country;

import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Integer> {

}
