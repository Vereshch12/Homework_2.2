package transport;

public class Truck extends Transport {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startDriving() {
        System.out.println("\nГрузовик " + brand + " " + model + " начал движение!");
    }

    @Override
    public void stopDriving() {
        System.out.println("\nГрузовик " + brand + " " + model + " закончил движение!");
    }
}
