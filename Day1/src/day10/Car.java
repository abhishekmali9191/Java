package day10;

import day1.Date;

import java.util.ArrayList;


public final class Car {
    private final String make;
    private final String model;
    private final Date mandat;
    private final ArrayList<String> colors;

    public Car(String make, String model, Date mandat, ArrayList<String> colors) {
        this.make = make;
        this.model = model;
        this.mandat = mandat;
        this.colors = colors;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Date getMandat() {
        return mandat;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mandat=" + mandat +
                ", colors=" + colors +
                '}';
    }
}
