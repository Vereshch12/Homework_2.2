package transport;

import java.util.Objects;

public class Mechanic {
    public enum Specialization{
        ALL ("Все типы авто"), CARS("Легковые авто"), TRUCKS("Грузовые авто"), BUSES("Автобусы"),
        CARSANDTRUCKS ("Легковые и Грузовые авто"), CARSANDBUSES("Автобусы и Легковые авто"),
        TRUCKSANDBUSES("Автобусы и Грузовый авто");

        public static  Specialization findByKeyboardSpecialization(String keyboardSpecialization){
            for (Specialization specializationOfMechanic: values()){
                if (specializationOfMechanic.getSpecialization().equalsIgnoreCase(keyboardSpecialization)){
                    return specializationOfMechanic;
                }
            }
            return null;
        }

        private String specialization;

        Specialization(String specialization) {
            this.specialization = specialization;
        }

        public String getSpecialization() {
            return specialization;
        }

        @Override
        public String toString() {
            return
                    "\n   Специализация: " + specialization;
        }
    }
    private String name;
    private String company;
    private Specialization specialization;

    public Mechanic(String name, String company, Specialization specialization) throws SpecializationException{
        if (name == null || name.isEmpty() || name.isBlank()) name= "default";
        if (company == null || company.isEmpty() || company.isBlank()) company= "default";
        if (specialization == null){
            throw new SpecializationException("Неверно введена специализация у механика " +name + "!");
        }
        this.name = name;
        this.company = company;
        this.specialization = specialization;
    }

    protected void checkSpecializationAndTransport(Transport transport) throws SpecializationException {
        if ((getSpecialization() == Specialization.BUSES || getSpecialization() == Specialization.CARSANDBUSES
         || getSpecialization() == Specialization.TRUCKSANDBUSES) && transport.getClass() != Bus.class){
            throw new SpecializationException("Механик " + name + " не может обслуживать автомобиль " + transport.getBrand() + " " + transport.getModel() + "!");
        } else {
            if ((getSpecialization() == Specialization.CARS || getSpecialization() == Specialization.CARSANDBUSES
                    || getSpecialization() == Specialization.CARSANDTRUCKS) && transport.getClass() != Car.class){
                throw new SpecializationException("Механик " + name + " не может обслуживать автомобиль " + transport.getBrand() + " " + transport.getModel() + "!");
            } else if ((getSpecialization() == Specialization.TRUCKS || getSpecialization() == Specialization.TRUCKSANDBUSES
                    || getSpecialization() == Specialization.CARSANDTRUCKS) && transport.getClass() != Truck.class) {
                throw new SpecializationException("Механик " + name + " не может обслуживать автомобиль " + transport.getBrand() + " " + transport.getModel() + "!");
            }
        }
    }

    public void carryOutMaintenance(Transport transport) throws SpecializationException {
        checkSpecializationAndTransport(transport);
        System.out.print("\nПроведено техобслуживание у автомобиля " + transport.getBrand() + " " + transport.getModel()+ ". Механик: " + name);
    }

    public void fixTransport(Transport transport) throws SpecializationException {
        checkSpecializationAndTransport(transport);
        System.out.println("\nАвтомобиль " + transport.getBrand() + " " + transport.getModel() + " починен. Механик: " + name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) name= "default";
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company == null || company.isEmpty() || company.isBlank()) company= "default";
        this.company = company;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        if (specialization == null){
            throw new IllegalArgumentException("Неверно введена специализация у механика " +name + "!");
        }
        this.specialization = specialization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(company, mechanic.company) && specialization == mechanic.specialization;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, specialization);
    }

    @Override
    public String toString() {
        return "\nМеханик: " + name +
                "\n   Компания: " + company + getSpecialization();
    }
}
