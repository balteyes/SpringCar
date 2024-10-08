package example.spring;

public class Car {
    String model;
    int year;
    Man owner;

    public void setOwner(Man owner) {
        this.owner = owner;
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
