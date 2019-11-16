package person;

import java.time.LocalDateTime;
import java.util.Random;

public class Person {
    private String name;
    private Vehicle[] vehicles;
    public Person(String name) {
        this.name=name;
    }
    public String getName() {return name;}
    public Vehicle[] getVehicles() {return vehicles;}

    public void buy(Vehicle vehicle) {

        vehicle.setBoughtDate(LocalDateTime.now().plusDays(new Random().nextInt(100)-50));
        if (vehicles==null) {
            vehicles=new Vehicle[] {vehicle};
            return;
        }
        Vehicle[] tmp=new Vehicle[vehicles.length+1];
        for (int i=0; i<vehicles.length; i++)
            tmp[i]=vehicles[i];
        tmp[tmp.length-1]=vehicle;
        vehicles=tmp;
    }
}
