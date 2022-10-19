package transport;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private Integer productionYear;
    private String productionCountry;
    private String transmission;
    private String type;
    private String number;
    private Integer numberOfSeats;
    private String typeOfRubber;

    public String checkNumber (String number){
        Matcher nomer = Pattern.compile("[А-Я]\\d\\d\\d[А-Я][А-Я]\\d\\d\\d").matcher(number);
        if (nomer.find()){
            return "Номер корректен";
        }else {
            return "Номер не корректен";
        }
    }

    private boolean checkRubber (String rubber){
        return rubber.equalsIgnoreCase("зимняя") || rubber.equalsIgnoreCase("летняя");
    }

    public Car(String brand, String model, double engineVolume, String color, Integer productionYear, String productionCountry,
                    String transmission, String type, String number, Integer numberOfSeats, String typeOfRubber) {
        if (transmission == null) transmission = "default";
        if (type == null) type = "default";
        if (checkNumber(number).equalsIgnoreCase("Номер не корректен")) number = "default";
        if (numberOfSeats == null || numberOfSeats < 2) numberOfSeats = 5;
        if (typeOfRubber == null || !checkRubber(typeOfRubber)) typeOfRubber = "default";
        if (brand == null) brand = "default";
        if (model == null) model = "default";
        if (productionCountry == null) productionCountry = "default";
        if (color == null) color = "белый";
        if (engineVolume == 0) engineVolume = 1.5;
        if (productionYear == null) productionYear = 2000;
        this.transmission = transmission;
        this.type = type;
        this.number = number;
        this.numberOfSeats = numberOfSeats;
        this.typeOfRubber = typeOfRubber;
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTypeOfRubber() {
        return typeOfRubber;
    }

    public void setTypeOfRubber(String typeOfRubber) {
        this.typeOfRubber = typeOfRubber;
    }

    @Override
    public String toString() {
        return "\n_______________________________" +
                "\nБренд: " + brand + "\nМодель: " + model +
                "\nОбъем двигателя: " + engineVolume + "\nЦвет кузова: " + color +
                "\nГод выпуска: " + productionYear + "\nСтрана сборки: " + productionCountry +
                "\nКоробка передач: " + transmission + "\nТип кузова: " + type +
                "\nРегистрационный номер: " + number + "\nКоличество мест: " + numberOfSeats +
                "\nРезина: " + typeOfRubber +
                "\n‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾";
    }

}
