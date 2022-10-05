public class Person {
    private String name;
    private Integer yearOfBirth;
    private String city;

    public Person(String name, Integer yearOfBirth, String city) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.city = city;
    }

    public void welcome(){
        System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился в %d году. Будем знакомы!\n", name, city, yearOfBirth);
    }
}
