package transport;

public class Truck extends Transport implements Competing{
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("\nГрузовик " + brand + " " + model + " начал движение!");
    }

    @Override
    public void stopMoving() {
        System.out.println("\nГрузовик " + brand + " " + model + " закончил движение!");
    }

    @Override
    public void pitStop() {
        System.out.println("\nГрузовик " + brand + " " + model + " остановился на пит-стоп.");
    }

    @Override
    public void bestTime() {
        System.out.println("\nЛучшее время грузовика " + brand + " " + model + ": " + null);
    }

    @Override
    public void maxSpeed() {
        System.out.println("\nМаксимальная скорость грузовика " + brand + " " + model + ": " + null);
    }
}
