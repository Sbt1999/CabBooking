package dev.shobhit.CabBooking.Services;


import dev.shobhit.CabBooking.Repositories.BookingRepository;
import dev.shobhit.CabBooking.models.Driver;

import java.util.ArrayList;
import java.util.Arrays;

public class BookingService {
    BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public ArrayList<Driver> findRide(String userName, Integer[] source, Integer[] destination) {
        ArrayList<Integer> sourceList = new ArrayList<>(Arrays.asList(source));
        ArrayList<Integer> destinationList = new ArrayList<>(Arrays.asList(destination));

        ArrayList<Driver> availableDrivers = this.bookingRepository.findRide(userName, sourceList, destinationList);
        if (availableDrivers.isEmpty()) {
//            throw new DriverNotFoundException("No available drivers found for the ride");
            System.out.println("No ride found");
        } else {
            for (Driver driver : availableDrivers) {
                System.out.println(driver.getName() + " Available");
            }
        }
        return availableDrivers;
    }

    public void chooseRide(String userName, String driverName) {
        this.bookingRepository.chooseRide(userName, driverName);
    }

    public int calculateBill(String userName) {
        int bill = this.bookingRepository.calculateBill(userName);
        System.out.println("Ride ended. Bill amount: $" + bill);
        return bill;
    }

    public void findTotalEarning() {
        this.bookingRepository.findTotalEarning();
    }
}

