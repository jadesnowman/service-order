package com.microservice.serviceorder.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city")

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int city_id;
    private String city;
    private int country_id;
    private String last_update;

    public int getCity_id() {
        return this.city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountry_id() {
        return this.country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getLast_update() {
        return this.last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }
}
