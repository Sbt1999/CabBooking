package dev.shobhit.CabBooking.Controller;

import dev.shobhit.CabBooking.Exceptions.UserNotFoundException;
import dev.shobhit.CabBooking.Services.UserService;

import java.util.ArrayList;
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void addUser(String userDetails) {
        userService.addUser(userDetails);
    }
    public void updateUser(String userName, String updatedDetails) throws UserNotFoundException {
        userService.updateUser(userName, updatedDetails);
    }
    public void updateUserLocation(String userName, int locationX, int locationY) throws UserNotFoundException {
        Integer[] location = {locationX, locationY};

        userService.updateUserLocation(userName, location);
    }
}
