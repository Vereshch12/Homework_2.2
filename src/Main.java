import transport.Bus;
import transport.Car;
import transport.Truck;
//import transport.Car.Key;
//import transport.Train;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
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


    /*public void checkInsurance(Car car){
        if (car.getInsurance().getValidityPeriod().isBefore(LocalDate.now())){
            System.out.println("Строховка у данной машины просрочена");
        }
    }

    public static void checkInsuranceNumber (Car car){
        if (car.getInsurance().getInsuranceNumber().length() != 9){
            System.out.println("Номер страховки у данной страховки введен неверно!");
        }
    }
    public static void checkNumber (Car car){
        Matcher nomer = Pattern.compile("[А-Я]\\d\\d\\d[А-Я][А-Я]\\d\\d\\d").matcher(car.getNumber());
        if (nomer.find()){
            System.out.println("\nНомер корректен");
        }else {
            System.out.println("\nНомер не корректен");
        }
    }

    public static void changeRubbers (Car car){
        if(LocalDate.now().getMonth().getValue() > 10 || LocalDate.now().getMonth().getValue() < 3){
            car.setTypeOfRubber("Зимняя");
        }
        else
            car.setTypeOfRubber("Летняя");
    }

    public static void main(String[] args) {
        Key key1 = new Key("Есть", "Нет");
        Car.Insurance insuranceLada = new Car.Insurance(LocalDate.of(2023, 1, 1), 5000, "123mj7898");
        Car.Insurance insuranceAudi = new Car.Insurance(LocalDate.of(2020, 1, 1), 0, "12mj7898");
        Car.Insurance insuranceBmw = new Car.Insurance(LocalDate.of(2022, 12, 1), 5000, "123456789");
        Car.Insurance insuranceKia = new Car.Insurance(LocalDate.of(2021, 1, 1), 7650, "mj7898");
        Car.Insurance insuranceHyundai = new Car.Insurance(LocalDate.of(2023, 1, 1), 5000, "1243mj7898");
        Car lada = new Car("Lada", "Grande",0, "желтый", 2015, "Россия",
                           "Механическая", "Хэтчбек", "Т123ПЛ123", 4,
                "Летняя", insuranceLada, 190, "бензиновый" );
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020,"Германия",
                           "Автоматическая", "Внедорожник", "1234JF234", 5,
                "зимняя", insuranceAudi, 300, "электрический");
        Car bmw = new Car("BMW", "Z8", 3, "черный", 2021, "Германия",
                          "Автоматическая", "Минивэн", "а234ло234", 2,
                "лето", insuranceBmw, 280, "бенз");
        Car kia = new Car("Kia", "Sportage 4 поколения", 2.4, "", 2018, "Южная Корея",
                          "Механическая", "Кроссовер", "Д743ЖП543", null,
                "Летняя", insuranceKia, 0, "дизельный");
        Car hyunday = new Car("Hyunday", "Avante", 1.6, "оранжевый", 2016, "Южная Корея",
                              "Автомат", "Кроссовер", "k123kj45", 4,
                "летняя", insuranceHyundai, 190, "Бензиновый");
        System.out.println("\nlada = " + lada);
        System.out.println("\naudi = " + audi);
        System.out.println("\nbmw = " + bmw);
        System.out.println("\nkia = " + kia);
        System.out.println("\nhyunday = " + hyunday);
        changeRubbers(audi);
        System.out.println("\naudi = " + audi);
        checkNumber(hyunday);
        kia.setKey(key1);
        System.out.println("\nkia = " + kia);
        checkInsuranceNumber(hyunday);
        System.out.println("\n\n");
        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", "", 301,
                3500, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", "", 270,
                         1700, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        System.out.println("lastochka = " + lastochka);
        System.out.println("leningrad = " + leningrad);
        System.out.println("\n\n");
        Bus huyndaiBus = new Bus("Hyundai", "Universe", 2016, "Южная Корея",
                "Серый", 142, "электрический");
        Bus volvoBus = new Bus("Volvo", "8900", 2013, "Швеция", "",
                150, "бензиновый");
        Bus scaniaBus = new Bus("Scania", "OmniExpress", 2010, "Швеция",
                "Желтый", 140, "ДиЗельный");
        System.out.println("huyndaiBus = " + huyndaiBus);
        System.out.println("volvoBus = " + volvoBus);
        System.out.println("scaniaBus = " + scaniaBus);
        System.out.println("\n\n");
        lada.refill();
        audi.refill();
        bmw.refill();
        kia.refill();
        hyunday.refill();
        System.out.println("\n");
        lastochka.refill();
        leningrad.refill();
        System.out.println("\n");
        huyndaiBus.refill();
        volvoBus.refill();
        scaniaBus.refill();
    }*/
    }
}