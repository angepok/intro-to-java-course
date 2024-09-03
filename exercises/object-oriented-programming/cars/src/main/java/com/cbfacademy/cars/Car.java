package com.cbfacademy.cars;

public class Car {
private String make;
private String model;
private String colour;
private int year;



public Car(String make, String model, String colour, int year) {
//- constructor that accepts parameters representing the make, model, colour and year of the car
this.make = make;
this.model = model;
this.colour = colour;
this.year = year;
}

public String getMake(){
 // - returns the car make
    //String makeOfcar = make;
    //return makeOfcar;
    return make;
}

public String getModel(){
// - returns the car model
    return model;
}

public int getYear() {
//- returns the year the car was made
    return year;
}
public String getColour(){
// - returns the colour of the car
    return colour;
}
public void setColour(String colour) {
//- sets the colour of the car
    this.colour = colour;

}
public String getDetails(){
// - returns the car
    String details = String.format("colour,model,", make, model, year,colour);
    return details;
}
}



