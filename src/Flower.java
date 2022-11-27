import java.math.BigDecimal;
import java.math.RoundingMode;

public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    public Integer lifeSpan;
    private String name;

    public Flower(String name, String flowerColor, String country, double cost, Integer lifeSpan) {
        setName(name);
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty()) this.flowerColor = "белый";
        else this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty()) this.country = "Россия";
        else this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0)
            this.cost = 1;
        else
            this.cost = (double)(Math.round(cost * 100)) / 100;
    }

    public Integer getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(Integer lifeSpan) {
        if (lifeSpan == null || lifeSpan < 0) this.lifeSpan = 3;
        else this.lifeSpan = lifeSpan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = "Информация не указана";
        }
        else
            this.name = name;
    }

    @Override
    public String toString() {
        return "Flower{\n" +
                "name='" + name + '\'' +
                ", flowerColor='" + flowerColor + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + round(cost) +
                ", lifeSpan=" + lifeSpan +
                '}';
    }

    public BigDecimal round(double cost) {
        BigDecimal bd = new BigDecimal(Double.toString(cost));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd;
    }
}
