package transport;
import java.time.LocalDate;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Car extends Transport implements Competing{
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startDriving() {
        System.out.println("\nЛегковой автомобиль " + brand + " " + model + " начал движение!");
    }

    @Override
    public void stopDriving() {
        System.out.println("\nЛегковой автомобиль " + brand + " " + model + " закончил движение!");
    }

    @Override
    public void pitStop() {
        System.out.println("\nЛегковой автомобиль " + brand + " " + model + " остановился на пит-стоп.");
    }

    @Override
    public void bestTime() {
        System.out.println("\nЛучшее время легкового автомобиля " + brand + " " + model + ": " + null);
    }

    @Override
    public void maxSpeed() {
        System.out.println("\nМаксимальная скорость легкового автомобиля " + brand + " " + model + ": " + null);
    }

    /*public static class Insurance{
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
        @Override
        public String toString() {
            return "Страховка:" +
                    "\n        Срок действия: " + validityPeriod +
                    "\n        Стоимость: " + cost +
                    "\n        Номер: " + insuranceNumber;
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


    private double engineVolume;
    private String transmission;
    private String type;
    private String number;
    private Integer numberOfSeats;
    private String typeOfRubber;
    private Key key;
    private Insurance insurance;

    public static String checkNumber (String number){
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
                    String transmission, String type, String number, Integer numberOfSeats, String typeOfRubber,
               Insurance insurance, Integer maxSpeed, String motorType) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, motorType);
        checkNaming(transmission);
        checkNaming(type);
        if (checkNumber(number).equalsIgnoreCase("Номер не корректен")) number = "default";
        if (numberOfSeats == null || numberOfSeats < 2) numberOfSeats = 5;
        if (!checkRubber(typeOfRubber)) typeOfRubber = "default";
        if (engineVolume == 0) engineVolume = 1.5;
        this.transmission = transmission;
        this.type = type;
        this.number = number;
        this.numberOfSeats = numberOfSeats;
        this.typeOfRubber = typeOfRubber;
        this.engineVolume = engineVolume;
        this.insurance = insurance;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) engineVolume = 1.5;
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        checkNaming(transmission);
        this.transmission = transmission;
    }

    @Override
    public void refill() {
        if (motorType.equalsIgnoreCase("бензиновый")) {
            System.out.println("Автомобиль " + brand + " " + model + " заправлен бензином");
        }
        else {
            if (motorType.equalsIgnoreCase("дизельный"))
                System.out.println("Автомобиль " + brand + " " + model + " заправлен дизелем");
            else
                System.out.println("Автомобиль " + brand + " " + model + " заряжен");
        }
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
        return "АВТОМОБИЛЬ" +
                "\n_______________________________" +
                "\nБренд: " + brand + "\nМодель: " + model +
                "\nОбъем двигателя: " + engineVolume + "\nЦвет кузова: " + color +
                "\nГод выпуска: " + productionYear + "\nСтрана сборки: " + productionCountry +
                "\nКоробка передач: " + transmission + "\nТип кузова: " + type +
                "\nМаксимальная скорость: " + maxSpeed +
                "\nРегистрационный номер: " + number + "\nКоличество мест: " + numberOfSeats +
                "\nРезина: " + typeOfRubber +
                "\n" + key + "\n" + insurance +
                "\n‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾";
    }*/

}
