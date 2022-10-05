public class Main {
    public static void main(String[] args) {
        Person maxim = new Person("Максим", 1987, "Минск", "бренд-менеджер");
        maxim.welcome();
        Person anya = new Person("Аня", 1993, "Москва", "методист образовательных программ\n");
        anya.welcome();
        Person katya = new Person("Катя", 1994, "Калининград", "продакт-менеджер");
        katya.welcome();
        Person artem = new Person("Артём", 1995, "Москва", "директор по развитию бизнеса");
        artem.welcome();
    }
}