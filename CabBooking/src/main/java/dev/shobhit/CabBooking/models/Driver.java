package dev.shobhit.CabBooking.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Driver {
    private String name;
    private char gender;
    private int age;
    private String carName;
    private String carNumber;
    private boolean isAvailable;
    private int earning;
    private ArrayList<Integer> currentLocation;

    public Driver(String name, char gender, int age, String carName, String carNumber, ArrayList<Integer> currentLocation) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.carName = carName;
        this.carNumber = carNumber;
        this.isAvailable = true;
        this.earning = 0;
        this.currentLocation = currentLocation;
    }
}
