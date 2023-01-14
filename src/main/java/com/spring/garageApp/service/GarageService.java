package com.spring.garageApp.service;

import com.spring.garageApp.model.Car;
import com.spring.garageApp.repository.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarageService {

    @Autowired
    private GarageRepository garageRepository;

//    static private ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
//            new Car(1,"Laguna", "Renault", 2004, Car.Color.BLUE),
//            new Car(2,"5008", "Peugeot", 2013, Car.Color.YELLOW),
//            new Car(3,"C4", "Citroen", 2006, Car.Color.BLUE),
//            new Car(4,"206", "Peugeot", 2004, Car.Color.GREEN),
//            new Car(5,"Laguna", "Renault", 2010, Car.Color.RED)
//    ));

    public List<Car> getCars(){
        List<Car> cars = new ArrayList<>();
        garageRepository.findAll().forEach(car ->{
            cars.add(car);
        });
        return cars;
    }

    public Car getCar(long id) {
        return garageRepository.findById(id).orElse(null);
    }

    public void deleteCar(long id) {
        garageRepository.deleteById(id);
    }

    public void addCar(Car car) {
        garageRepository.save(car);
    }

    public void updateCare(Car car, long id) {
        garageRepository.save(car);
    }
}
