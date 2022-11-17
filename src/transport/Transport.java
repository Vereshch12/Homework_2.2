package transport;

import java.util.Objects;

public abstract class Transport {
    protected String brand;
    protected String model;
    //protected Integer productionYear;
    //protected String productionCountry;
    //protected String color;
    //protected Integer maxSpeed;
    //protected String motorType;
    protected double engineVolume;
    private Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void checkNaming (String line){
        if (line == null || line.isEmpty() || line.isBlank()) line= "default";
    }



    /*private boolean checkMotorType (String motorType){
        return motorType.equalsIgnoreCase("электрический") || motorType.equalsIgnoreCase("бензиновый")
                || motorType.equalsIgnoreCase("дизельный");
    }*/


    public Transport(String brand, String model, /*Integer productionYear, String productionCountry, String color,
                     Integer maxSpeed, String motorType*/double engineVolume ) {
        checkNaming(brand);
        checkNaming(model);
        if (engineVolume == 0) engineVolume = 1.5;
        //checkNaming(color);
        //if (color.equals("default")) color = "белый";
        //checkNaming(productionCountry);
        //if (productionYear == 0) productionYear = 2000;
        //if (maxSpeed == 0) maxSpeed = 180;
        //if (!checkMotorType(motorType)) motorType = "бензиновый";
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        //this.productionYear = productionYear;
        //this.productionCountry = productionCountry;
        //this.color = color;
       // this.maxSpeed = maxSpeed;
        //this.motorType = motorType;
    }
    //protected abstract void refill();

    public abstract void startMoving();
    public abstract void stopMoving();

    public abstract void undergoDiagnostics() throws LicensseCategoryException, PassageOfDiagnosticsException;


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) engineVolume = 1.5;
        this.engineVolume = engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return  "\nКласс объекта: " + getClass() +
                "\nБренд: " + brand +
                "\nМодель: " + model +
                "\nОбъем двигателя: " + engineVolume;
    }

    /*public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        checkNaming(color);
        this.color = color;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        if (maxSpeed == 0) maxSpeed = 180;
        this.maxSpeed = maxSpeed;
    }*/
}
