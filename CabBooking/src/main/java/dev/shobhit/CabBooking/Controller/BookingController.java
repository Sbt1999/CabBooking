package dev.shobhit.CabBooking.Controller;

import dev.shobhit.CabBooking.Exceptions.DriverNotFoundException;
import dev.shobhit.CabBooking.Exceptions.UserNotFoundException;
import dev.shobhit.CabBooking.Services.BookingService;
import dev.shobhit.CabBooking.models.Driver;

import java.util.ArrayList;

public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public ArrayList<Driver> findRide(String userName, int sourceX, int sourceY, int destinationX, int destinationY) throws UserNotFoundException {
        Integer[] source = {sourceX, sourceY};
        Integer[] destination = {destinationX, destinationY};

        return bookingService.findRide(userName, source, destination);
    }

    public void chooseRide(String userName, String driverName) throws DriverNotFoundException {
        bookingService.chooseRide(userName, driverName);
    }

    public int calculateBill(String userName) throws UserNotFoundException, DriverNotFoundException {
        return bookingService.calculateBill(userName);
    }

    public void findTotalEarning() {
        bookingService.findTotalEarning();
    }
}
