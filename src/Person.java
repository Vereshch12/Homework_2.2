public class Person {
    private String name;
    private Integer yearOfBirth;
    private String city;
    private String job;

    public Person(String name, Integer yearOfBirth, String city, String job) {
        setName(name);
        setYearOfBirth(yearOfBirth);
        setCity(city);
        setJob(job);
    }

    public void welcome(){
        System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился в %d году. Я работаю на должности %s. Будем знакомы!\n", name, city, yearOfBirth, job);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = "Информация не указана";
        }
        else
            this.name = name;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        if (yearOfBirth == null || yearOfBirth < 0) this.yearOfBirth = 0;
        else this.yearOfBirth = yearOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.isEmpty()) this.city = "Информация не указана";
        else this.city = city;
    }
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        if (job == null || job.isEmpty()) this.job = "Информация не указана";
        else this.job = job;
    }
}
