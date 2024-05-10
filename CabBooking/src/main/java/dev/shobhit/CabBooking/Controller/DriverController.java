package dev.shobhit.CabBooking.Controller;

import dev.shobhit.CabBooking.Services.DriverService;

import java.util.ArrayList;

public class DriverController {

    private DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    public void addDriver(String driverDetails, String vehicleDetails, int locationX, int locationY) {
        try {
            Integer[] location = {locationX, locationY};
            driverService.addDriver(driverDetails, vehicleDetails, location);
        } catch (Exception e) {
            System.out.println("Error adding driver: " + e.getMessage());
        }
    }

    public void updateDriverLocation(String driverName, int locationX, int locationY) {
        try {
            // Create an ArrayList to represent the driver's location
            ArrayList<Integer> location = new ArrayList<>();
            location.add(locationX);
            location.add(locationY);

            // Call the updateDriverLocation method in the DriverService
            driverService.updateDriverLocation(driverName, location);
        } catch (Exception e) {
            // If any exception occurs, print an error message
            System.out.println("Error updating driver location: " + e.getMessage());
        }
    }


    public void updateDriverStatus(String driverName, boolean status) {
        try {
            driverService.updateDriverStatus(driverName, status);
        } catch (Exception e) {
            System.out.println("Error updating driver status: " + e.getMessage());
        }
    }
}


