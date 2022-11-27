package transport;
import java.util.Objects;

public class Sponsor {
    private String name;
    private int totalAnte;

    public Sponsor(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) name= "Анонимный спонсор";
        this.name = name;
    }

    public void makeContribution (int ante, Transport car){
        if (ante == 0) ante = 1;
        if (car.getSponsors().contains(this)){
            totalAnte += ante;
            System.out.println("\nСпонсор " + name + " повторно стал спонсором автомобиля " + car.getBrand() + " " + car.getModel() + " на сумму $" + ante);
        } else {
            car.acceptContribution(this);
            totalAnte += ante;
            System.out.println("\nСпонсор " + name + " стал спонсором автомобиля " + car.getBrand() + " " + car.getModel() + " на сумму $" + ante);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) name= "Анонимный спонсор";
        this.name = name;
    }

    public int getTotalAnte() {
        return totalAnte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, totalAnte);
    }

    @Override
    public String toString() {
        return "\nСпонсор " + getName() + ", сумма поддержки: $" + getTotalAnte() ;
    }
}
