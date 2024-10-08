package example.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Man {

    String name;
    @Autowired
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
