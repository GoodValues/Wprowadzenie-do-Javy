package person;

import java.time.LocalDateTime;

public class Car implements Vehicle {

    private LocalDateTime boughtDate;
    private String brand;
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String brand) {this.brand=brand;}

    @Override
    public void setBoughtDate(LocalDateTime date) {
        this.boughtDate=date;
    }

    @Override
    public LocalDateTime getBoughtDate() {
        return boughtDate;
    }

    @Override
    public String getBrand() {
        return brand;
    }
}
