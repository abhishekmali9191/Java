package day2;

import day1.nEWdATE;

public class Car {
    private String make;
    private String model;
    private nEWdATE purchaseDate;

    public Car(String make, String model, nEWdATE purchaseDate)
    {
        this.make=make;
        this.model=model;
        this.purchaseDate=purchaseDate;
    }

    public String toString()
    {
        return "Car Make : "+make+"                     Car Model : "+model+" Purchase Date : "+purchaseDate;
    }

    public static void main(String[] args) {
        Car car = new Car("Ford","Endeveour",new nEWdATE(12,"JAN",2022));
        System.out.println(car);
    }
}
