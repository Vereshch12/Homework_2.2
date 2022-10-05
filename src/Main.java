public class Main {
    public static void main(String[] args) {
        //Задание 1-2
        Person maxim = new Person("Максим", 1987, "Минск", "бренд-менеджер");
        maxim.welcome();
        Person anya = new Person("Аня", 1993, "Москва", "методист образовательных программ\n");
        anya.welcome();
        Person katya = new Person("Катя", 1994, "Калининград", "продакт-менеджер");
        katya.welcome();
        Person artem = new Person("Артём", 1995, "Москва", "директор по развитию бизнеса");
        artem.welcome();

        System.out.println();

        //Задание №3
        Car lada = new Car("Lada", "Grande",1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020,"Германия");
        Car bmw = new Car("BMW", "Z8", 3, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4 поколения", 2.4, "красный", 2018, "Южная Корея" );
        Car hyunday = new Car("Hyunday", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        System.out.println("lada = " + lada);
        System.out.println("audi = " + audi);
        System.out.println("bmw = " + bmw);
        System.out.println("kia = " + kia);
        System.out.println("hyunday = " + hyunday);
    }
}