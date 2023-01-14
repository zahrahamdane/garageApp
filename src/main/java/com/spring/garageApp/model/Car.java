package com.spring.garageApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    public enum Color{
        RED,
        BLUE,
        GREEN,
        YELLOW
    }

    @Id
    private long id;
    private String model;
    private String brand;
    //@Column(name = "release_year")
    private int year;
    private Color color;

}
