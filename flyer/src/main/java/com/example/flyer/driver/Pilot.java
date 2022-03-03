package com.example.flyer.driver;

import com.example.flyer.vehicle.Airplane;
import com.example.flyer.vehicle.Vehicle;

public class Pilot extends AbstractDriver{

    public Pilot(String name){
        super(name);
    }

    @Override
    public void drive(Vehicle vehicle){
        vehicle.turnOn();
        fly(vehicle);
    }

    private void fly(Vehicle vehicle){
        if (vehicle instanceof Airplane){
            Airplane plane = (Airplane) vehicle;
            System.out.println("\n" + plane + " uçağı uçuyor.");
            plane.turnOn();
            plane.takeOff();
            plane.fly();
            plane.land();
            plane.turnOff();
        }
        else {
            vehicle.turnOn();
            vehicle.go();
            vehicle.stop();
            vehicle.turnOff();
        }
    }
}
