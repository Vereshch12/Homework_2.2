package transport;

public class Driver <T extends Transport & Competing> {
    private String name;
    private String licensse;
    private Integer experience;
    private T car;

    protected Driver(String name, String licensse, Integer experience, T car) {
        if (name == null || name.isEmpty() || name.isBlank()) name = "default";
        if (experience == 0) experience = 1;
        this.name = name;
        this.experience = experience;
        this.car = car;
        setLicensse(licensse);
        if (this.licensse.equals("default")){
            throw new IllegalArgumentException("Измените категорию!");
        }
    }

    private void setLicensse(String licensse) {
        if (licensse.equalsIgnoreCase("B")||licensse.equalsIgnoreCase("C")
                || licensse.equalsIgnoreCase("D")) licensse = licensse.toUpperCase();
        switch (licensse) {
            case "B":
                if (getCar() instanceof Car) {
                    System.out.println("\nВодитель " + name + " будет участвовать в заезде на легковом автомобиле " + getCar().getBrand()
                            + " " + getCar().getModel());
                    this.licensse = licensse;
                    return;
                } else {
                    System.out.println("\nВодитель " + name +" с категорией B должен ездить на легковом автомобиле!");
                    this.licensse = "default";
                    return;
                }
            case "C":
                if (getCar() instanceof Truck){
                    System.out.println("\nВодитель " + name + " будет участвовать в заезде на грузовом автомобиле " + getCar().getBrand()
                            +" " + getCar().getModel());
                    this.licensse = licensse;
                    return;
                } else {
                    System.out.println("\nВодитель " + name + " с категорией C должен ездить на грузовом автомобиле!");
                    this.licensse = "default";
                    return;
                }
            case "D":
                if (getCar() instanceof Bus){
                    System.out.println("\nВодитель " + name + " будет участвовать в заезде на aвтобусе " + getCar().getBrand()
                            + " " + getCar().getModel());
                    this.licensse = licensse;
                    return;
                } else {
                    System.out.println("\nВодитель " + name +" с категорией D должен ездить на автобусе!");
                    this.licensse = "default";
                    return;
                }
            default:
                this.licensse = "default";
        }
    }

    public void startDriving(){
        System.out.print("\nВодитель " + name + " заводит " + getCar().getBrand() + " " + getCar().getModel() + " и давит на газ.");
        getCar().startMoving();
    }

    public void stopDriving(){
        System.out.print("\nВодитель " + name + " жмет на тормоз " + getCar().getBrand() + " " + getCar().getModel());
        getCar().stopMoving();
    }

    public void refuel(){
        System.out.print("\nВодитель " + name + " решает заправить " + getCar().getBrand() + " " + getCar().getModel() + " и направляется на пит-стоп");
        getCar().pitStop();
        System.out.println(name + " заправил " + getCar().getBrand() + " " + getCar().getModel() + "!");
    }

    public String getLicensse() {
        return licensse;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        if (experience == 0) experience = 1;
        this.experience = experience;
    }


    public void setCar(T car) {
        this.car = car;
    }
    public T getCar() {
        return car;
    }

    public String getName() {
        return name;
    }


}
