package com.pluralsight;

public class VehicleInheritance {
    public static void main(String[] args) {


        Moped slowRide = new Moped("Ford", "Blue", 120, 60, 3, 10,5);

        System.out.println(slowRide.getModel());
        System.out.println(slowRide.getColor());
        System.out.println(slowRide.getTopSpeed());
        System.out.println(slowRide.getFuelCapacity());
        System.out.println(slowRide.getNumberOfPassengers());
        System.out.println(slowRide.getCargoCapacity());
        System.out.println(slowRide.getMaxWeight());



        /* Why are you able to access the Vehicle getters/setters when you did not create an
        instance of the Vehicle class?*/

        // Answer: Because of extend can access the Vehicle class to get the color and set the color
    }
}
