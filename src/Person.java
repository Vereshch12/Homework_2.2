public class Person {
    private String name;
    private Integer yearOfBirth;
    private String city;
    private String job;

    public Person(String name, Integer yearOfBirth, String city, String job) {
        if (name == null) name = "Информация не указана";
        if (city == null) name = "Информация не указана";
        if (job == null) name = "Информация не указана";
        if (yearOfBirth < 0) yearOfBirth = 0;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.city = city;
        this.job = job;
    }

    public void welcome(){
        System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился в %d году. Я работаю на должности %s. Будем знакомы!\n", name, city, yearOfBirth, job);
    }
}
