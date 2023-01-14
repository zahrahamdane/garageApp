package com.spring.garageApp.repository;

import com.spring.garageApp.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface GarageRepository extends CrudRepository<Car, Long> {

}
