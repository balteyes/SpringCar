package example.spring;

public class Man {
    String name;

    Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public Man(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
