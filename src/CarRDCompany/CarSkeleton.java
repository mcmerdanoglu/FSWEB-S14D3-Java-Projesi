package CarRDCompany;

public class CarSkeleton {
    private String name;

    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return getName() + "'s engine has started.";
    }

    public String drive() {
        runEngine(this);
        return getName() + "is driving on the road";
    }

    protected void runEngine(CarSkeleton carSkeleton) {
        if (carSkeleton instanceof GasPoweredCar) {
            ((GasPoweredCar)carSkeleton).getName(); //Bu şekilde cast yaparak sınıf methodlarına ulaşabiliriz.
            System.out.println("The Gas Powered cars engine started");
        } else if (carSkeleton instanceof HybridCar) {
            ((HybridCar)carSkeleton).getName();
            System.out.println("The Hybrid Powered cars engine started");
        } else if (carSkeleton instanceof ElectricCar) {
            ((ElectricCar)carSkeleton).getName();
            System.out.println("The Electric Powered cars engine started");
        }
        else System.out.println("Car powered type is not been supported yet...");
    }
}