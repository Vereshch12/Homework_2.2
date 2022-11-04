package transport;

public class Train extends Transport{
    private Integer ticketPrice;
    private Integer timeOfTrip; /*не понял как и где это использовать*/
    private String departureStationName;
    private String arrivalStationName;

    private Integer numberOfCarriages;


    public Train(String brand, String model, Integer productionYear, String productionCountry, String color, Integer maxSpeed, Integer ticketPrice,
                 String departureStationName, String arrivalStationName, Integer numberOfCarriages) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed,"Дизельный");
        checkNaming(departureStationName);
        checkNaming(arrivalStationName);
        if (ticketPrice == 0) ticketPrice = 1000;
        if (numberOfCarriages == 0) numberOfCarriages = 10;
        this.ticketPrice = ticketPrice;
        this.departureStationName = departureStationName;
        this.arrivalStationName = arrivalStationName;
        this.numberOfCarriages = numberOfCarriages;
    }

    @Override
    public void refill() {
        System.out.println("Поезд " + brand + " " + model + " заправлен дизелем");
    }

    public Integer getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Integer ticketPrice) {
        if (ticketPrice == 0) ticketPrice = 1000;
        this.ticketPrice = ticketPrice;
    }

    public Integer getTimeOfTrip() {
        return timeOfTrip;
    }

    public String getDepartureStationName() {
        checkNaming(departureStationName);
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        checkNaming(departureStationName);
        this.departureStationName = departureStationName;
    }

    public String getArrivalStationName() {
        return arrivalStationName;
    }

    public void setArrivalStationName(String arrivalStationName) {
        checkNaming(arrivalStationName);
        this.arrivalStationName = arrivalStationName;
    }

    public Integer getNumberOfCarriages() {
        return numberOfCarriages;
    }

    public void setNumberOfCarriages(Integer numberOfCarriages) {
        if (numberOfCarriages == 0) numberOfCarriages = 10;
        this.numberOfCarriages = numberOfCarriages;
    }

    @Override
    public String toString() {
        return "\nПОЕЗД" +
                "\n‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾" +
                "\nБренд: " + brand + "\nМодель: " + model +
                "\nГод выпуска: " + productionYear + "\nСтрана сборки: " + productionCountry +
                "\nЦена поездки: " + ticketPrice + "\nВремя поездки: " + timeOfTrip +
                "\nСтанция отбытия: " + departureStationName +
                "\nСтанция прибытия: " + arrivalStationName +
                "\nСкорость: " + maxSpeed + "\nКоличество вагонов: " + numberOfCarriages +
                "\n‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾";
    }
}
