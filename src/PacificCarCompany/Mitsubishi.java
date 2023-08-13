package PacificCarCompany;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    //Override edilen methodlarda super ile üst sınıf methodunu çağırmayabilirdik ama sınıf adını alan kısmı
    //tek tek yazmaktan kurtulduk. soutp olmayan kısım olan "car is ..." ise çağrılmadığı için ezilen methodlar
    // çağrıldığında ekrana çıktı olarak yansımadı çünkü return olarak yer alan kısım soutp ile string olarak döndürülmedi.
    @Override
    public String startEngine() {
        super.startEngine();
        return getName() + " engine is starting";
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return getName() + " is accelerating";
    }

    @Override
    public String brake() {
        super.brake();
        return getName() + " is braking";
    }
}
