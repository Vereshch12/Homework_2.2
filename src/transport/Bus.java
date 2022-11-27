package transport;

public class Bus extends Transport implements Competing{
    public enum BusCapacity {
        EXTRA_SMALL ("Особо малая (до 10 мест)"),
        SMALL ("Малая (до 25 мест)"),
        AVERAGE ("Средняя (40-50 мест)"),
        BIG ("Большая (60-80 мест)"),
        EXTRA_BIG ("Особо большая (100-120 мест)");

        public static BusCapacity findByKeyboardBusCapcity(String keyboardBusCapacity){
            for (BusCapacity capacityOfBus: values()){
                if (capacityOfBus.getBusCapacity().equalsIgnoreCase(keyboardBusCapacity)){
                    return capacityOfBus;
                }
            }
            return null;
        }

        private String busCapacity;

        BusCapacity(String busCapacity) {
            this.busCapacity = busCapacity;
        }

        public String getBusCapacity() {
            return busCapacity;
        }

        @Override
        public String toString() {
            return
                    "\nВместимость автобуса: " + busCapacity;
        }

    }
    private BusCapacity busCapacity;
    public Bus(String brand, String model, double engineVolume,BusCapacity busCapacity) {
        super(brand, model, engineVolume);
        if (busCapacity == null){
            throw new IllegalArgumentException("Неверно введен тип вместимости автобуса " + brand + " " + model +"!");
        }
        this.busCapacity = busCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("\nАвтобус " + brand + " " + model + " начал движение!");
    }

    @Override
    public void stopMoving() {
        System.out.println("\nАвтобус " + brand + " " + model + " закончил движение!");
    }

    @Override
    public void pitStop() {
        System.out.println("\nАвтобус " + brand + " " + model + " остановился на пит-стопе для заправки.");
    }

    @Override
    public void bestTime() {
        System.out.println("\nЛучшее время автобуса " + brand + " " + model + ": " + null);
    }

    @Override
    public void maxSpeed() {
        System.out.println("\nМаксимальная скорость автобуса " + brand + " " + model + ": " + null);
    }

    @Override
    public void undergoDiagnostics() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не нуждается!" );
    }



    public BusCapacity getBusCapacity() {
        return busCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + getBusCapacity();
    }
    /*public Bus(String brand, String model, Integer productionYear, String productionCountry, String color,
               Integer maxSpeed, String motorType1) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, motorType1);
        if (!(motorType.equalsIgnoreCase("бензиновый") || motorType.equalsIgnoreCase("'дизельный")))
            motorType = "бензиновый";
    }

    @Override
    public void refill() {
        if (motorType.equalsIgnoreCase("бензиновый")) {
            System.out.println("Автобус " + brand + " " + model + " заправлен бензином");
        }
        else {
            System.out.println("Автобус " + brand + " " + model + " заправлен дизелем");
        }

    }

    @Override
    public String toString() {
        return "АВТОБУС" +
                "\n_______________________________" +
                "\nБренд: " + brand + "\nМодель: " + model +
                "\nЦвет кузова: " + color +
                "\nГод выпуска: " + productionYear + "\nСтрана сборки: " + productionCountry +
                "\nМаксимальная скорость: " + maxSpeed +
                "\n‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾";
    }*/
}
