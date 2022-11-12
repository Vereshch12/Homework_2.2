package transport;


public class Racing {

    public static void main(String[] args) {

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, Car.CarBody.SUV);
        Car bmw = new Car("BMW", "Z8", 3, Car.CarBody.SEDAN);
        Car kia = new Car("Kia", "Sportage 4 поколения", 2.4, Car.CarBody.HATCHBACK);
        Car hyunday = new Car("Hyunday", "Avante", 1.6, Car.CarBody.findByKeyboardBodyOfCar("УниверсаЛ"));
        Bus huyndaiBus = new Bus("Hyundai", "Universe", 4.3, Bus.BusCapacity.SMALL);
        Bus volvoBus = new Bus("Volvo", "8900", 4.9, Bus.BusCapacity.BIG);
        Bus scaniaBus = new Bus("Scania", "OmniExpress", 5.0, Bus.BusCapacity.BIG);
        Bus liazBus = new Bus("Liaz", "«Курсор» 4292", 4.5, Bus.BusCapacity.AVERAGE);
        Truck kamazTruck = new Truck("КАМАЗ", "5490", 11.2, Truck.LoadCapacity.N2);
        Truck manTruck = new Truck("MAN", "TGL", 7.2, Truck.LoadCapacity.N1);
        Truck hyundaiTruck = new Truck("Hyundai", "HD 78", 4.1, Truck.LoadCapacity.N1);
        Truck mercedesTruck = new Truck("Mercedes", "Actros", 14.5, Truck.LoadCapacity.N3);
        hyundaiTruck.startMoving();
        hyundaiTruck.stopMoving();
        liazBus.startMoving();
        bmw.startMoving();
        liazBus.stopMoving();
        bmw.stopMoving();
        System.out.println(volvoBus);
        kamazTruck.pitStop();
        scaniaBus.bestTime();
        kia.maxSpeed();
        kia.maxSpeed();
        Driver<Bus> pit = new Driver("Пит", "D", 2, volvoBus);
        Driver<Car> max = new Driver("Макс", "C", 3, mercedesTruck);
        max.startDriving();
        pit.stopDriving();
        max.refuel();
        System.out.println(hyunday);
        System.out.println(scaniaBus.getBusCapacity());
        System.out.println(huyndaiBus);
        System.out.println(liazBus);
        System.out.println(manTruck);
        System.out.println(hyundaiTruck);
        System.out.println(kamazTruck);
    }
}