package dev.shobhit.CabBooking.models;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;

@Getter
@Setter
public class User {
    private String name;
    private char gender;
    private int age;
    private ArrayList<Integer> currentLocation;

    public User(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}