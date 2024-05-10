package dev.shobhit.CabBooking.Exceptions;

public class DriverNotFoundException extends RuntimeException{
    public DriverNotFoundException(String message) {
        super(message);
    }
}
