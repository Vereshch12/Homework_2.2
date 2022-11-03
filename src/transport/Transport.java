package transport;

public class Transport {
    protected String brand;
    protected String model;
    protected Integer productionYear;
    protected String productionCountry;
    protected String color;
    protected Integer maxSpeed;

    public void checkNaming (String line){
        if (line == null || line.isEmpty() || line.isBlank()) line= "default";
    }


    public Transport(String brand, String model, Integer productionYear, String productionCountry, String color, Integer maxSpeed) {
        checkNaming(brand);
        checkNaming(model);
        checkNaming(color);
        if (color.equals("default")) color = "белый";
        checkNaming(productionCountry);
        if (productionYear == 0) productionYear = 2000;
        if (maxSpeed == 0) maxSpeed = 180;
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

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
        this.color = color;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
