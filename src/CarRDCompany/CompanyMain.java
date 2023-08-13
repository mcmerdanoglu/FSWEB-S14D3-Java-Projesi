package CarRDCompany;

import java.util.Arrays;

public class CompanyMain {

    public static void main(String[] args) {
        System.out.println("Car R&D Company________________________");

        CarSkeleton car1 = new GasPoweredCar("Opel", "LPG ve benzinli", 0.5, 4);
        CarSkeleton car2 = new ElectricCar("Toyota", "yeni elektrikli", 0.7, 10);
        CarSkeleton car3= new HybridCar("Honda", "HRV", 0.6, 12, 6);

        System.out.println(car1.startEngine());
        car1.drive();

        System.out.println(car2.startEngine());
        car2.drive();

        System.out.println(car3.startEngine());
        car3.drive();

    }
}
