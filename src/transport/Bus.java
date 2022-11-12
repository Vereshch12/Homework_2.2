package transport;

public class Bus extends Transport implements Competing{
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("\nАвтобус " + brand + " " + model + " начал движение!");
    }

    @Override
    public void stopMoving() {
        System.out.println("\nАвтобус " + brand + " " + model + " закончил движение!");
    }

    @Override
    public void pitStop() {
        System.out.println("\nАвтобус " + brand + " " + model + " остановился на пит-стопе для заправки.");
    }

    @Override
    public void bestTime() {
        System.out.println("\nЛучшее время автобуса " + brand + " " + model + ": " + null);
    }

    @Override
    public void maxSpeed() {
        System.out.println("\nМаксимальная скорость автобуса " + brand + " " + model + ": " + null);
    }
    /*public Bus(String brand, String model, Integer productionYear, String productionCountry, String color,
               Integer maxSpeed, String motorType1) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, motorType1);
        if (!(motorType.equalsIgnoreCase("бензиновый") || motorType.equalsIgnoreCase("'дизельный")))
            motorType = "бензиновый";
    }

    @Override
    public void refill() {
        if (motorType.equalsIgnoreCase("бензиновый")) {
            System.out.println("Автобус " + brand + " " + model + " заправлен бензином");
        }
        else {
            System.out.println("Автобус " + brand + " " + model + " заправлен дизелем");
        }

    }

    @Override
    public String toString() {
        return "АВТОБУС" +
                "\n_______________________________" +
                "\nБренд: " + brand + "\nМодель: " + model +
                "\nЦвет кузова: " + color +
                "\nГод выпуска: " + productionYear + "\nСтрана сборки: " + productionCountry +
                "\nМаксимальная скорость: " + maxSpeed +
                "\n‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾";
    }*/
}
