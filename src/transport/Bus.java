package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, Integer productionYear, String productionCountry, String color,
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
    }
}
