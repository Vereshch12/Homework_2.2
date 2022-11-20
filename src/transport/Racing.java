package transport;
import java.util.ArrayList;
import java.util.List;

public class Racing {
    public static List<Transport> transportList = new ArrayList<>();
    public static List<Driver> driverList = new ArrayList<>();

    public static void main(String[] args) throws LicensseCategoryException, PassageOfDiagnosticsException, SpecializationException {
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
        Driver<Car> max = new Driver("Макс", "B", 3, audi);
        Driver<Truck> mikel = new Driver<>("Maйкл", "C", 3, mercedesTruck);
//        max.startDriving();
//        pit.stopDriving();
//        max.refuel();
//        System.out.println(hyunday);
//        System.out.println(scaniaBus.getBusCapacity());
//        System.out.println(huyndaiBus);
//        System.out.println(liazBus);
//        System.out.println(manTruck);
//        System.out.println(hyundaiTruck);
//        System.out.println(kamazTruck);
//        System.out.println(audi.getDriver().getLicensse());
//        volvoBus.undergoDiagnostics();
//        audi.undergoDiagnostics();
//        mercedesTruck.undergoDiagnostics();
        System.out.println(getTransportList());
        Sponsor john = new Sponsor("Джон");
        john.makeContribution(1000000, audi);
        Sponsor joe = new Sponsor("Джо");
        joe.makeContribution(10000000, audi);
        System.out.println("\n\n\n\n"+audi);
        System.out.println(getDriverList());
        Mechanic armen = new Mechanic("Армэн", "Audi", Mechanic.Specialization.CARS);
        System.out.println(armen);
        armen.carryOutMaintenance(audi);
        audi.addMechanicInTeam(armen);
        System.out.println(audi);
    }

    public static String getTransportList() {
        return "\nСПИСОК ВСЕХ АВТОМОБИЛЕЙ: " + transportList;
    }

    public static String getDriverList() {
        return "\nСПИСОК ВСЕХ ВОДИТЕЛЕЙ: " + driverList;
    }
}