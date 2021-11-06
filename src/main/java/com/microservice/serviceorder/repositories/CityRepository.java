package com.microservice.serviceorder.repositories;

import com.microservice.serviceorder.models.City;

import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Integer> {

}
