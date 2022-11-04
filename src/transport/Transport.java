package transport;

public abstract class Transport {
    protected String brand;
    protected String model;
    protected Integer productionYear;
    protected String productionCountry;
    protected String color;
    protected Integer maxSpeed;
    protected String motorType;

    public void checkNaming (String line){
        if (line == null || line.isEmpty() || line.isBlank()) line= "default";
    }



    private boolean checkMotorType (String motorType){
        return motorType.equalsIgnoreCase("электрический") || motorType.equalsIgnoreCase("бензиновый")
                || motorType.equalsIgnoreCase("дизельный");
    }


    public Transport(String brand, String model, Integer productionYear, String productionCountry, String color,
                     Integer maxSpeed, String motorType) {
        checkNaming(brand);
        checkNaming(model);
        checkNaming(color);
        if (color.equals("default")) color = "белый";
        checkNaming(productionCountry);
        if (productionYear == 0) productionYear = 2000;
        if (maxSpeed == 0) maxSpeed = 180;
        if (!checkMotorType(motorType)) motorType = "бензиновый";
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.motorType = motorType;
    }
    protected abstract void refill();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getProductionYear() {
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
    }
}
