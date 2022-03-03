package com.example.flyer.vehicle;

public abstract class AbstractVehicle implements Vehicle {

    protected String name;

    public AbstractVehicle(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle [Adı = " + name + "]";
    }
}
