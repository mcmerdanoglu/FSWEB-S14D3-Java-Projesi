package PacificCarCompany;

import java.util.Objects;

public class Car {

    private boolean engine;

    private int cylinders;

    private String name;

    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        setEngine(true); // veya engine=true;
        setWheels(4); // veya wheels = 4; şeklinde de yazılabilir.
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String startEngine(){
        System.out.println("Class Name: " + getClass().getSimpleName());
       return " the car's engine is starting";
    }

    public String accelerate(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        return " the car is accelerating";
    }

    public String brake(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        return " the car is braking";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + getName() + "\n");
        sb.append("Cylinders: " + getCylinders() + "\n");
        sb.append("Wheel: " + getWheels() + "\n");
        sb.append("Engine: " + isEngine() + "\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        //devamı 2 şekilde de olabilir.

        //1//
        // return ((Car) o).cylinders == this.cylinders && ((Car)o).name.equals(this.name);
        //2//
        Car car = (Car) o;
        return cylinders == car.cylinders && name.equals(car.name);
    }
}
