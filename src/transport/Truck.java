package transport;

public class Truck extends Transport implements Competing{
    public enum LoadCapacity {
        N1 ("N1 (c полной массой до 3,5 тонн)"),
        N2 ("N2 (с полной массой свыше 3,5 до 12 тонн)"),
        N3 ("N3 (с полной массой свыше 12 тонн)");

        public static LoadCapacity findByKeyboardLoadCapacity(String keyboardLoadCapacity){
            for (LoadCapacity capacityOfTruck: values()){
                if (capacityOfTruck.getLoadCapacity().equalsIgnoreCase(keyboardLoadCapacity)){
                    return capacityOfTruck;
                }
            }
            return null;
        }

        private String loadCapacity;

        LoadCapacity(String loadCapacity) {
            this.loadCapacity = loadCapacity;
        }

        public String getLoadCapacity() {
            return loadCapacity;
        }

        @Override
        public String toString() {
            return
                    "\nТип грузоподъемности: " + loadCapacity;
        }
    }

    private LoadCapacity loadCapacity;
    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        if (loadCapacity == null){
            throw new IllegalArgumentException("Неверно введен тип грузоподъемности грузовика " + brand + " " + model +"!");
        }
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("\nГрузовик " + brand + " " + model + " начал движение!");
    }

    @Override
    public void stopMoving() {
        System.out.println("\nГрузовик " + brand + " " + model + " закончил движение!");
    }

    @Override
    public void undergoDiagnostics() throws LicensseCategoryException, PassageOfDiagnosticsException {
        if (!(getDriver().getLicensse().equals("C"))){
            throw new LicensseCategoryException ("Требуется изменить категорию прав водителю " + getDriver().getName() + "!");
        }
        if (Math.random() > 0.5){
            System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " прошел диагностику!" );
        }
        else {
            throw new PassageOfDiagnosticsException("Грузовой автомобиль " + getModel() + " " + getBrand() + " не прошел диагностику!" );
        }
    }

    @Override
    public void pitStop() {
        System.out.println("\nГрузовик " + brand + " " + model + " остановился на пит-стоп.");
    }

    @Override
    public void bestTime() {
        System.out.println("\nЛучшее время грузовика " + brand + " " + model + ": " + null);
    }

    @Override
    public void maxSpeed() {
        System.out.println("\nМаксимальная скорость грузовика " + brand + " " + model + ": " + null);
    }



    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + getLoadCapacity();
    }
}
