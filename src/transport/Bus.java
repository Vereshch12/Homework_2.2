package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, Integer productionYear, String productionCountry, String color, Integer maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
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
