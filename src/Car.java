public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private Integer productionYear;
    private String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, Integer productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return "\nБренд: " + brand + "\nМодель: " + model +
                "\nОбъем двигателя: " + engineVolume + "\nЦвет кузова: " + color
                +"\nГод выпуска: " + productionYear + "\nСтрана сборки: " + productionCountry;
    }
}
