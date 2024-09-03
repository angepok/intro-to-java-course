package com.cbfacademy.cars;

import java.util.List;

public class App {
    public static void main(String[] args) {
        //  Display details of all cars in showroom
         Showroom showroom = new Showroom();

        // Get the list of cars from the showroom
        List<Car> cars = showroom.getCars();

        // Print the cars
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
