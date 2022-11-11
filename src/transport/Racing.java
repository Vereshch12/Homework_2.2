package transport;

import transport.Bus;
import transport.Car;
import transport.Truck;

public class Racing {
    public static void main(String[] args) {

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        Car bmw = new Car("BMW", "Z8", 3);
        Car kia = new Car("Kia", "Sportage 4 поколения", 2.4);
        Car hyunday = new Car("Hyunday", "Avante", 1.6);
        Bus huyndaiBus = new Bus("Hyundai", "Universe", 4.3);
        Bus volvoBus = new Bus("Volvo", "8900", 4.9);
        Bus scaniaBus = new Bus("Scania", "OmniExpress", 5.0);
        Bus liazBus = new Bus("Liaz", "«Курсор» 4292", 4.5);
        Truck kamazTruck = new Truck("КАМАЗ", "5490", 11.2);
        Truck manTruck = new Truck("MAN", "TGL", 7.2);
        Truck hyundaiTruck = new Truck("Hyundai", "HD 78", 4.1);
        Truck mercedesTruck = new Truck("Mercedes", "Actros", 14.5);
        hyundaiTruck.startDriving();
        hyundaiTruck.stopDriving();
        liazBus.startDriving();
        bmw.startDriving();
        liazBus.stopDriving();
        bmw.stopDriving();
        System.out.println(volvoBus);
        kamazTruck.pitStop();
        scaniaBus.bestTime();
        kia.maxSpeed();
        kia.maxSpeed();
    }
}