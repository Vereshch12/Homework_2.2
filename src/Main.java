public class Main {
    public static void main(String[] args) {
        Person maxim = new Person("Максим", 1987, "Минск");
        maxim.welcome();
        Person anya = new Person("Аня", 1993, "Москва");
        anya.welcome();
        Person katya = new Person("Катя", 1994, "Калининград");
        katya.welcome();
        Person artem = new Person("Артём", 1995, "Москва");
        artem.welcome();
    }
}