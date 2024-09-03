package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import com.cbfacademy.cars.Car;


public class Showroom {
    
    public List<Car> getCars() {
        // returns a list containing three Car objects:
           
        // Create a list to hold the Car objects
        List<Car> cars = new ArrayList<>();
        
        // Add the required Car objects to the list
        //make sure parametsr are the same as car object

        cars.add(new Car("Volvo", "V40", "blue", 2012));
        cars.add(new Car("Porsche", "Panamera","red",2009));
        cars.add(new Car("Audi", "A3","grey", 2018));
         
       
       // Return the list
        return cars;


    }

}
