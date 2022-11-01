import transport.Car;
import transport.Car.Key;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public void checkInsurance(Car car){
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
        //Задание 1-2
        Person maxim = new Person("Максим", 1987, "Минск", "бренд-менеджер");
        //maxim.welcome();
        Person anya = new Person(null, 1993, "Москва", "методист образовательных программ\n");
        //anya.welcome();
        Person katya = new Person("Катя", 1994, "Калининград", "продакт-менеджер");
        //katya.welcome();
        Person artem = new Person("Артём", 1995, "Москва", "директор по развитию бизнеса");
        //artem.welcome();

        System.out.println();

        //Задание №3
        Key key1 = new Key("Есть", "Нет");
        Car.Insurance insuranceLada = new Car.Insurance(LocalDate.of(2023, 1, 1), 5000, "123mj7898");
        Car.Insurance insuranceAudi = new Car.Insurance(LocalDate.of(2020, 1, 1), 0, "12mj7898");
        Car.Insurance insuranceBmw = new Car.Insurance(LocalDate.of(2022, 12, 1), 5000, "123456789");
        Car.Insurance insuranceKia = new Car.Insurance(LocalDate.of(2021, 1, 1), 7650, "mj7898");
        Car.Insurance insuranceHyundai = new Car.Insurance(LocalDate.of(2023, 1, 1), 5000, "1243mj7898");
        Car lada = new Car("Lada", "Grande",0, "желтый", 2015, "Россия",
                           "Механическая", "Хэтчбек", "Т123ПЛ123", 4, "Летняя", insuranceLada );
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020,"Германия",
                           "Автоматическая", "Внедорожник", "1234JF234", 5, "зимняя", insuranceAudi);
        Car bmw = new Car("BMW", "Z8", 3, "черный", 2021, "Германия",
                          "Автоматическая", "Минивэн", "а234ло234", 2, "лето", insuranceBmw);
        Car kia = new Car("Kia", "Sportage 4 поколения", 2.4, "", 2018, "Южная Корея",
                          "Механическая", "Кроссовер", "Д743ЖП543", null, "Летняя", insuranceKia);
        Car hyunday = new Car("Hyunday", "Avante", 1.6, "оранжевый", 2016, "Южная Корея",
                              "Автомат", "Кроссовер", "k123kj45", 4, "летняя", insuranceHyundai);
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


        System.out.println();


        // задание "Цветы" (запутался в номерах уже)))
        Flower rose = new Flower("Роза", null, "Голландия", 35.5911, null);
        //System.out.println("rose = " + rose);
        Flower hrizantema = new Flower("Хризантема", null, null, 15.00, 5);
        //System.out.println("hrizantema = " + hrizantema);
        Flower pion = new Flower("Пион", null, "Англия", 69.90, 1);
        //System.out.println("pion = " + pion);
        //System.out.println("pion.getCost() = " + pion.getCost());
        Flower giposfila = new Flower("Гипосфила", null, "Турция", 19.5, 10);
        //System.out.println("giposfila = " + giposfila);
    }
}