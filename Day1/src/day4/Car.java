package day4;

import java.util.Objects;

public class Car implements Cloneable {
    private String model;
    private String make;
    private int price;

    public Car(String model, String make, int price) {
        this.model = model;
        this.make = make;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(model, car.model) && Objects.equals(make, car.make);
    }

    //    @Override
//    public boolean equals(Object o)
//    {
//     Car other = (Car)o;
//     if((this.make.equals(other.make))&&(this.model.equals(other.model))&& (this.price==other.price))
//         return true;
//     else
//         return false;
//    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, make, price);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
