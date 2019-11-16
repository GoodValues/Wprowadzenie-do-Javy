package person;

import java.time.LocalDateTime;

public class Bike implements Vehicle {
    private LocalDateTime boughtDate;
    private String brand;

    public Bike(String brand) {this.brand=brand;}

    @Override
    public void setBoughtDate(LocalDateTime date) {
        boughtDate=date;
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
