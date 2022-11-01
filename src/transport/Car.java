package transport;
import java.time.LocalDate;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Car {

    public static class Insurance{
        @Override
        public String toString() {
            return "Страховка:" +
                    "\n        Срок действия: " + validityPeriod +
                    "\n        Стоимость: " + cost +
                    "\n        Номер: " + insuranceNumber;
        }

        private final LocalDate validityPeriod;
        private final Integer cost;

        private final String  insuranceNumber;

        public Insurance(LocalDate validityPeriod, Integer cost, String insuranceNumber) {
            if (validityPeriod == null) validityPeriod = LocalDate.of(2000, 1, 1);
            if (cost == 0) cost = 1000;
            if (insuranceNumber == null || insuranceNumber == "") insuranceNumber = "000000000";
            this.validityPeriod = validityPeriod;
            this.cost = cost;
            this.insuranceNumber = insuranceNumber;
        }
        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }

        public Integer getCost() {
            return cost;
        }

        public String getInsuranceNumber() {
            return insuranceNumber;
        }
    }
    public static class Key{

        private String remoteEngineStart;
        private String keylessEntry;

        private boolean checkKey (String rubber){
            return rubber.equalsIgnoreCase("есть") || rubber.equalsIgnoreCase("да") || rubber.equalsIgnoreCase("нет");
        }

        public Key(String remoteEngineStart, String keylessEntry) {
            if (remoteEngineStart == null || !checkKey(remoteEngineStart)) remoteEngineStart = "default";
            if (keylessEntry == null || !checkKey(keylessEntry)) keylessEntry = "default";
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return "Ключ: " +
                    "\n     Удаленный запуск двигателя: " + remoteEngineStart +
                    "\n     Бесключевой доступ: " + keylessEntry;
        }
    }

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
    private Key key;
    private Insurance insurance;

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
                    String transmission, String type, String number, Integer numberOfSeats, String typeOfRubber, Insurance insurance) {
        if (transmission == null || transmission.equals("")) transmission = "default";
        if (type == null || type.equals("")) type = "default";
        if (checkNumber(number).equalsIgnoreCase("Номер не корректен")) number = "default";
        if (numberOfSeats == null || numberOfSeats < 2) numberOfSeats = 5;
        if (typeOfRubber == null || !checkRubber(typeOfRubber) || typeOfRubber.equals("")) typeOfRubber = "default";
        if (brand == null || brand.equals("")) brand = "default";
        if (model == null || model.equals("")) model = "default";
        if (productionCountry == null || productionCountry.equals("")) productionCountry = "default";
        if (color == null || color.equals("")) color = "белый";
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
        this.insurance = insurance;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) engineVolume = 1.5;
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.equals("")) color = "белый";
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.equals("")) transmission = "default";
        this.transmission = transmission;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (checkNumber(number).equalsIgnoreCase("Номер не корректен")) number = "default";
        this.number = number;
    }

    public String getTypeOfRubber() {
        return typeOfRubber;
    }

    public void setTypeOfRubber(String typeOfRubber) {
        if (typeOfRubber == null || !checkRubber(typeOfRubber) || typeOfRubber.equals("")) typeOfRubber = "default";
        this.typeOfRubber = typeOfRubber;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (this.key == null){
            this.key = key;
        }
    }

    public Insurance getInsurance() {
        return insurance;
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
                "\n" + key + "\n" + insurance +
                "\n‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾";
    }

}
