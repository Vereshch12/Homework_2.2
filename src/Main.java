import transport.Car;

import java.time.LocalDate;

public class Main {

    public void changeRubbers (Car car){
        if(LocalDate.now().getMonth().getValue() > 10 || LocalDate.now().getMonth().getValue() < 3){
            car.setTypeOfRubber("Зимняя");
        }
        else
            car.setTypeOfRubber("Летняя");
    }

    public static void main(String[] args) {
        //Задание 1-2
        Person maxim = new Person("Максим", 1987, "Минск", "бренд-менеджер");
        maxim.welcome();
        Person anya = new Person(null, 1993, "Москва", "методист образовательных программ\n");
        anya.welcome();
        Person katya = new Person("Катя", 1994, "Калининград", "продакт-менеджер");
        katya.welcome();
        Person artem = new Person("Артём", 1995, "Москва", "директор по развитию бизнеса");
        artem.welcome();

        System.out.println();

        //Задание №3
        Car lada = new Car("Lada", "Grande",0, "желтый", 2015, "Россия",
                           "Механическая", "Хэтчбек", "Т123ПЛ123", 4, "Летняя");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020,"Германия",
                           "Автоматическая", "Внедорожник", "1234JF234", 5, "зимняя");
        Car bmw = new Car("BMW", "Z8", 3, "черный", 2021, "Германия",
                          "Автоматическая", "Минивэн", "а234ло234", 2, "лето");
        Car kia = new Car("Kia", "Sportage 4 поколения", 2.4, "красный", 2018, "Южная Корея",
                          "Механическая", "Кроссовер", "Д743ЖП543", null, "Летняя");
        Car hyunday = new Car("Hyunday", "Avante", 1.6, "оранжевый", 2016, "Южная Корея",
                              "Автомат", "Кроссовер", "k123kj45", 4, "летняя");
        System.out.println("lada = " + lada);
        System.out.println("audi = " + audi);
        System.out.println("bmw = " + bmw);
        System.out.println("kia = " + kia);
        System.out.println("hyunday = " + hyunday);


        System.out.println();

        // задание "Цветы" (запутался в номерах уже)))
        Flower rose = new Flower("Роза", null, "Голландия", 35.5911, null);
        System.out.println("rose = " + rose);
        Flower hrizantema = new Flower("Хризантема", null, null, 15.00, 5);
        System.out.println("hrizantema = " + hrizantema);
        Flower pion = new Flower("Пион", null, "Англия", 69.90, 1);
        System.out.println("pion = " + pion);
        System.out.println("pion.getCost() = " + pion.getCost());
        Flower giposfila = new Flower("Гипосфила", null, "Турция", 19.5, 10);
        System.out.println("giposfila = " + giposfila);
    }
}